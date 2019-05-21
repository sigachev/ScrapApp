/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mikhail
 */
public class DBFunctions {
    
         // JDBC driver name and database URL
       static final  String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
       static final  String DB_URL = "jdbc:mysql://zource.com/zource";
       
       //  Database credentials
        static final String USER = "root";
        static final String PASS = "int6859";

    
    
    public static Map<String,String> getAllFeatures() {
        
        Map <String,String> featureMap = new HashMap<String,String>();
        Connection conn = null;
        java.sql.Statement stmt = null;
        
         try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      String sql = "SELECT DISTINCT product_features.feature_type, product_features_descriptions.description FROM zource.product_features JOIN zource.product_features_descriptions \n" +
"ON zource.product_features.feature_id=zource.product_features_descriptions.feature_id AND feature_type !='' ORDER BY description;";
      PreparedStatement ps = null;
      ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      
      while(rs.next()){
         featureMap.put(rs.getString("description"), rs.getString("feature_type"));
      }
      rs.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Features Types Generation Complete!");
   return featureMap;
        
    }

 

    /**
     *
     * @param filename
     * @param urlString
     * @throws MalformedURLException
     * @throws IOException
     */
    public static void saveURL(final String filename, final String urlString) {        
    try {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(filename,false);

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        }
         finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }               
           }
         
         }
    
    catch (IOException ex) {
               Logger.getLogger(DBFunctions.class.getName()).log(Level.SEVERE, null, ex);
           }
}
    
    public static String getFileName(String url) {
        String fileName;
        int slashIndex = url.lastIndexOf("/");
        int qIndex = url.lastIndexOf("?");
        if (qIndex > slashIndex)//if has parameters
            fileName = url.substring(slashIndex + 1, qIndex);
        else
            fileName = url.substring(slashIndex + 1);
        return fileName;
}
    
    public static String getFileExtension(String url) {
        String fileExtension;
        int dotIndex = url.lastIndexOf(".");
        fileExtension = getFileName(url).substring(dotIndex + 1);
        return fileExtension;
}
    
}
