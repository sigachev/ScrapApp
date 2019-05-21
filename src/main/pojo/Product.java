/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.pojo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mikhail
 */
public class Product implements Serializable {
    String url;
    String product_code;
    String category;
    String secondary_categories;
    String product_name;
    String price;
    String short_description;
    String description;
    String features;
    String options;
    String store;
    String language;
    String meta_keywords;
    String meta_description;
    String free_shipping;
    String feature_comparison;
    String analogue_tags;
    String taxes;
    String quantity;
    String detailed_image;
    String image_url;
    ArrayList<Option> optionsList;
    ArrayList<String> imageList;
    
    public ArrayList<String> getOptionListStrings() {
       ArrayList<String> st = new ArrayList();
       for (Option o:this.optionsList)
           st.add(o.getValue());
       return st;
     
    }

    public Product() {
        this.optionsList = new ArrayList();
        this.imageList = new ArrayList();
    }
    
    public void addImage(String im) {
        this.imageList.add(im);
    }
    
    public void add(Option o) {
        optionsList.add(o);
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSecondary_categories() {
        return secondary_categories;
    }

    public void setSecondary_categories(String secondary_categories) {
        this.secondary_categories = secondary_categories;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMeta_keywords() {
        return meta_keywords;
    }

    public void setMeta_keywords(String meta_keywords) {
        this.meta_keywords = meta_keywords;
    }

    public String getMeta_description() {
        return meta_description;
    }

    public void setMeta_description(String meta_description) {
        this.meta_description = meta_description;
    }

    public String getFree_shipping() {
        return free_shipping;
    }

    public void setFree_shipping(String free_shipping) {
        this.free_shipping = free_shipping;
    }

    public String getFeature_comparison() {
        return feature_comparison;
    }

    public void setFeature_comparison(String feature_comparison) {
        this.feature_comparison = feature_comparison;
    }

    public String getAnalogue_tags() {
        return analogue_tags;
    }

    public void setAnalogue_tags(String analogue_tags) {
        this.analogue_tags = analogue_tags;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDetailed_image() {
        return detailed_image;
    }

    public void setDetailed_image(String detailed_image) {
        this.detailed_image = detailed_image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Option> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(ArrayList<Option> optionsList) {
        this.optionsList = optionsList;
    }

    public ArrayList<String> getImageList() {
        return imageList;
    }

    public void setImageList(ArrayList<String> imageList) {
        this.imageList = imageList;
    }
    

    
    
}
