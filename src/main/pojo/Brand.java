/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mikhail
 */
public class Brand implements Serializable {
    String name;
    int itemsCount;
    ArrayList<Category> categories;
    
    public Brand() {
        this.categories = new ArrayList();
    }
    
    public Brand(String name) {
        this.name = name;
        this.categories = new ArrayList();
    } 

    public void add(Category cat) {
        this.categories.add(cat);
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }
    
}
