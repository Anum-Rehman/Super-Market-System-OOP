/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.Scanner;

/**
 *
 * @author Lab User
 */
public class SuperMarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductsList mart=new ProductsList();
        try (Scanner sc=new Scanner (System.in)){
        final int mainmenuselection=askuserforchoice(sc,"1-Input,2-Sort Product,3-Search Product,4-Delete Product",4);
        switch (mainmenuselection){
    case 1:
    {
        System.out.println("How many Products you want to place??");
        int a=sc.nextInt();
        String line =sc.nextLine();
        for (int c=0;c<a;c++){
        System.out.println("Enter Product details:\t Brand \t Type \t color \t Quality \t Price");
        line =sc.nextLine();
        String [] split=line.split(" ");
        mart.addProducts(split[0], split[1], split[2], split[3],Double.parseDouble(split[4]) );}
        
        Cosmetics mart1=new Cosmetics();
        System.out.println("How many Cosmetics item you want to place??");
        a=sc.nextInt();
        for (int c=0;c<a;c++){
        System.out.println("Enter Cosmetics details:\t Brand \t Type \t color \t Quality \t Price");
        line =sc.nextLine();
        String [] split=line.split(" ");
        mart1.addProducts(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]));}
        
        Food mart2=new Food();
        System.out.println("How many Food Items you want to place??");
        a=sc.nextInt();
        for (int c=0;c<a;c++){
        System.out.println("Enter Item details:\t Brand \t Type \t color \t Quality \t Price");
        line =sc.nextLine();
        String [] split=line.split(" ");
        mart2.addProducts(split[0], split[1], split[2], split[3],Double.parseDouble(split[4]) );}
        
        Clothes mart3=new Clothes();
        System.out.println("How many clothes you want to place??");
        a=sc.nextInt();
        for (int c=0;c<a;c++){
        System.out.println("Enter Clothes details:\t Brand \t Type \t color \t Quality \t Price");
        line =sc.nextLine();
        String [] split=line.split(" ");
        mart3.addProducts(split[0], split[1], split[2], split[3],Double.parseDouble(split[4]) );}
        
        System.out.println("INPUT SUCCESSFUL & SHOWN BELOW");
        System.out.println(mart);
        System.out.println(mart1);
        System.out.println(mart2);
        System.out.println(mart3);
        
    }}
        }
    }
    
        public static int askuserforchoice (Scanner sc,String prompt,int maxvalue){
        System.out.println("Please select menu item");
        System.out.println(prompt);
int value=sc.nextInt();
while (value<1|| value>maxvalue){
System.out.println ("invalid menu item, please try again");
value=sc.nextInt();}

return value;
       
    
    }
    
}
