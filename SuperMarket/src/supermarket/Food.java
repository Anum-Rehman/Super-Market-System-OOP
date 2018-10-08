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
public class Food extends Cosmetics{

    @Override
    public void addProducts(String Name, String Type, String Colour, String Quality, double Price) {
        super.addProducts(Name, Type, Colour, Quality, Price); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteProducts(String Name, String Type, String Colour, String Quality, double Price) {
        return super.deleteProducts(Name, Type, Colour, Quality, Price); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductsList sortProducts(Products[] Plist, String usercriteria) {
        return super.sortProducts(Plist, usercriteria); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Products searchProduct(Products[] PList, String UserCriteria) {
        return super.searchProduct(PList, UserCriteria); //To change body of generated methods, choose Tools | Templates.
    }
    
}
