/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.Arrays;

/**
 *
 * @author Lab User
 */
public class ProductsList {
    Products[] PList;
    public int ObjectCounter;
    
    public ProductsList(){
        PList = new Products[2];
        ObjectCounter = 0;
    }

    public void addProducts(String Name, String Type, String Colour, String Quality, double Price)
    {
        if (this.ObjectCounter == PList.length);
        increaseSize();
        
        PList[this.ObjectCounter] = new Products(Name,Type,Colour,Quality,Price);
        ObjectCounter++;
    }
    
    public boolean deleteProducts(String Name, String Type, String Colour, String Quality, double Price)
    {    
        int loc = this.findProducts(Name,Type,Colour,Quality,Price);
        
        if (loc == -1)
        {
            System.out.println("Product Not Found");
            return false;
        }
        
        else
        {
            for (int i = 0; i < this.ObjectCounter; i++)
            {
                Name = PList[i].getProductName();
                this.PList[i-1].setProductName(Name);
                
                Type = PList[i].getProductType();
                this.PList[i-1].setProductType(Type);
                
                Colour = PList[i].getProductColour();
                this.PList[i-1].setProductColour(Colour);
                
                Quality = PList[i].getProductQuality();
                this.PList[i-1].setProductQuality(Quality);
                
                Price = PList[i].getProductPrice();
                this.PList[i-1].setProductPrice(Price);
            }
            
            this.PList[ObjectCounter-1] = null;
            ObjectCounter--;
            
            return true;
        }
        }
    
    public Products searchProduct(Products[] PList,String UserCriteria)
    {
        
        Products [] tempOutput = new Products[PList.length]; 
                  
                   switch (UserCriteria)
                   {
                       case "Name,Price":
                       {
                           int loc = this.findProducts(String Name, double Price);
                           
                           if (loc == -1)
                           {
                               System.out.println("Product Not Found");
                           }
                           
                           else
                           {
                               for (int i = loc+1; i < this.ObjectCounter; i++)
                               {
                                   Products TempProduct = new Products(this.PList[i].getProductName(),
                                                                       this.PList[i].getProductType(),
                                                                       this.PList[i].getProductColour(),
                                                                       this.PList[i].getProductQuality(),                 
                                                                       this.PList[i].getProductPrice());
                               return TempProduct;
                               }
                           }
                           break;
                       }
                       
                       case "Name,Colour":
                       {
                           
                           int loc = this.findProducts(Name,Colour);
                           
                           if (loc == -1)
                           {
                               System.out.println("Product Not Found");
                           }
                           
                           else
                           {
                               for (int i = loc+1; i < this.ObjectCounter; i++)
                               {
                                   Products TempProduct = new Products(this.PList[i].getProductName(),
                                                                       this.PList[i].getProductType(),
                                                                       this.PList[i].getProductColour(),
                                                                       this.PList[i].getProductQuality(),                 
                                                                       this.PList[i].getProductPrice());
                               return TempProduct;
                               }
                           }
                           break;
                       }
                   }
                   return null;
    }
    

    public ProductsList sortProducts(Products[]Plist,String usercriteria) {
     
        Products [] tempOutput = new Products[PList.length]; 
                   
                   switch (usercriteria)
                   {
                       case "Name":
                       
                           String [] NameArray = new String[ObjectCounter];
                           for(int i = 0; i < this.ObjectCounter; i++)
                           {
                               NameArray[i] = PList[i].getProductName();
                           }
                         Arrays.sort(NameArray);
                           for (int i = 0; i < this.ObjectCounter; i++){
                               int idx = this.findProducts1(NameArray[i]);
                               tempOutput[i] = new Products (PList[idx].getProductName(),
                                                             PList[idx].getProductType(),
                                                             PList[idx].getProductColour(),
                                                             PList[idx].getProductQuality(),
                                                             PList[idx].getProductPrice());
                           }                           
                            break;
    
                       case "Type":
                       
                           String [] TypeArray = new String[ObjectCounter];
                           for(int i = 0; i < this.ObjectCounter; i++)
                           {
                               TypeArray[i] = PList[i].getProductType();
                           }
                         Arrays.sort(TypeArray);
                           for (int i = 0; i < this.ObjectCounter; i++){
                               int idx = this.findProducts2(TypeArray[i]);
                               tempOutput[i] = new Products (PList[idx].getProductName(),
                                                             PList[idx].getProductType(),
                                                             PList[idx].getProductColour(),
                                                             PList[idx].getProductQuality(),
                                                             PList[idx].getProductPrice());
                           }
                            break;
    
                      case "Colour":
                       
                           String [] ColourArray = new String[ObjectCounter];
                           for(int i = 0; i < this.ObjectCounter; i++)
                           {
                               ColourArray[i] = PList[i].getProductColour();
                           }
                         Arrays.sort(ColourArray);
                           for (int i = 0; i < this.ObjectCounter; i++){
                               int idx = this.findProducts3(ColourArray[i]);
                               tempOutput[i] = new Products (PList[idx].getProductName(),
                                                             PList[idx].getProductType(),
                                                             PList[idx].getProductColour(),
                                                             PList[idx].getProductQuality(),
                                                             PList[idx].getProductPrice());
                           }
                           
                            break;
                            
                      case "Quality":
                       
                           String [] QualityArray = new String[ObjectCounter];
                           for(int i = 0; i < this.ObjectCounter; i++)
                           {
                               QualityArray[i] = PList[i].getProductQuality();
                           }
                         Arrays.sort(QualityArray);
                           for (int i = 0; i < this.ObjectCounter; i++){
                               int idx = this.findProducts4(QualityArray[i]);
                               tempOutput[i] = new Products (PList[idx].getProductName(),
                                                             PList[idx].getProductType(),
                                                             PList[idx].getProductColour(),
                                                             PList[idx].getProductQuality(),
                                                             PList[idx].getProductPrice());
                           }
                           
                            break;
                            
                            case "Price":
                       
                           double [] PriceArray = new double[ObjectCounter];
                           for(int i = 0; i < this.ObjectCounter; i++)
                           {
                               PriceArray[i] = PList[i].getProductPrice();
                           }
                         Arrays.sort(PriceArray);
                           for (int i = 0; i < this.ObjectCounter; i++){
                               int idx = this.findProducts5(PriceArray[i]);
                               tempOutput[i] = new Products (PList[idx].getProductName(),
                                                             PList[idx].getProductType(),
                                                             PList[idx].getProductColour(),
                                                             PList[idx].getProductQuality(),
                                                             PList[idx].getProductPrice());
                           }
                           
                            break;
                   }
                   
                   ProductsList outL = new ProductsList();
                   outL.PList = tempOutput;
                   outL.ObjectCounter = ObjectCounter;
                   return outL;              
    }
    
   
    private void increaseSize()
    {
        Products[] tempreference = new Products[this.PList.length*2];
        
        for(int p = 0; p < this.ObjectCounter; p++)
        {
            tempreference[p] = PList[p];
        }
        this.PList = tempreference;
    }
    
    private int findProducts(String Name, String Type, String Colour, String Quality, double Price)
    {
        for (int i = 0; i < this.ObjectCounter; i++)
        {
            if (PList[i].getProductName().equals(Name) && PList[i].getProductType().equals(Type) && PList[i].getProductColour().equals(Colour) && PList[i].getProductQuality().equals(Quality) && PList[i].getProductPrice() == (Price))
                return i;
        }
        return -1;
    }
    
    private int findProducts(String Name, double Price)
    {
        for (int i = 0; i < this.ObjectCounter; i++)
        {
            if (PList[i].getProductName().equals(Name) && PList[i].getProductPrice() == (Price))
                return i;
        }
        return -1;
    }
    
    
    private int findProducts1(String NameArray)
    {
        for(int i = 0; i < ObjectCounter; i++)
        if(PList[i].getProductName().equals(NameArray))
            return i;
    
    return -1;
    }
    
    private int findProducts2(String TypeArray)
    {
        for(int i = 0; i < ObjectCounter; i++)
        if(PList[i].getProductType().equals(TypeArray))
            return i;
    
    return -1;
    }
    
    private int findProducts3(String ColourArray)
    {
        for(int i = 0; i < ObjectCounter; i++)
        if(PList[i].getProductColour().equals(ColourArray))
            return i;
    
    return -1;
    }
    
    private int findProducts4(String QualityArray)
    {
        for(int i = 0; i < ObjectCounter; i++)
        if(PList[i].getProductQuality().equals(QualityArray))
            return i;
    
    return -1;
    }
    
    private int findProducts5(double PriceArray)
    {
        for(int i = 0; i < ObjectCounter; i++)
        if(PList[i].getProductPrice() == (PriceArray))
            return i;
    
    return -1;
    }
}
