/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdriver;

/**
 *
 * @author Dmitriy Zhevelev
 */

public class Item {
    protected String title;
    protected String description;
    protected double price;
    //default constructor
    public Item(){
        title = null;
        description = null;
        price = 0;
    }
    //constructor with parameters
    public Item(String title, String description, double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }
    //setters and getters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    //toString overroad the actual java method and was not working with my code so I changed it to a 
    //void function named _toString to properly display the information
   public void _toString(){
       System.out.println("Item[Title: "+ title+", Description: "+ description+ ", Price: $"+price+"]");
    }
}
