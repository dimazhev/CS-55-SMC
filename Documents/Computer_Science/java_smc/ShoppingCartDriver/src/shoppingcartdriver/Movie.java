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
public class Movie extends Item{
    private int length;   // declare required instance variable for Movie
    
    //default constructor
    public Movie(){
        int length = 0;
    }
    //constructor with parameters
    public Movie(String title, String description, double price, int length){
        super(title, description, price);
        this.length = length;
    }
    //getters and setters
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    //my version of a toString method so that my program works properly
    @Override
    public void _toString(){
          System.out.println("Movie Information -- Title: "+ title+", Description: "+ description+ ", Length in minutes: " + length + ", Price: $"+ price);
    }
}
