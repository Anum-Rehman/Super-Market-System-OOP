/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author Lab User
 */
public class Products {
    private String ProductName;
    private String ProductType;
    private String ProductColour;
    private String ProductQuality;
    private double ProductPrice;
    
    public Products(){
        this.ProductName = ProductName;
        this.ProductType = ProductType;
        this.ProductColour = ProductColour;
        this.ProductQuality = ProductQuality;
        this.ProductPrice = ProductPrice;
    }
    
    public Products(String Name, String Type, String Colour, String Quality, double Price){
        this.ProductName = Name;
        this.ProductType = Type;
        this.ProductColour = Colour;
        this.ProductQuality = Quality;
        this.ProductPrice = Price;
    }
    
    public Products(Products originalProducts){
        this(originalProducts.ProductName, originalProducts.ProductType, originalProducts.ProductColour, originalProducts.ProductQuality, originalProducts.ProductPrice);
    }
    
    public String getProductName(){
         return ProductName;
    }
    
    public void setProductName(String Name){
        this.ProductName = Name;
    }
    
    public String getProductType(){
         return ProductType;
    }
    
    public void setProductType(String Type){
        this.ProductType = Type;
    }
    
    public String getProductColour(){
        return ProductColour;
    }
    
    public void setProductColour(String Colour){
        this.ProductColour = Colour;
    }
    
    public String getProductQuality(){
        return ProductQuality;
    }
    
    public void setProductQuality(String Quality){
        this.ProductQuality = Quality;
    }
    
    public double getProductPrice(){
        return ProductPrice;
    }
    
    public void setProductPrice(double Price){
        this.ProductPrice = Price;
    }
}
