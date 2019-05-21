/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import main.pojo.Product;

/**
 *
 * @author Mikhail
 */
public class Category implements Serializable  {
    
    String name;
    String url;
    String image;
    int itemsCount;
    ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList();
    }

    public void add(Product p) {
        this.products.add(p);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }
    
    
}
