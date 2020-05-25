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
public class CD extends Item{
    private int trackCount;  // declare required instance variable for CD
    
    //default constructor
    public CD(){
        trackCount = 0;
    }
    // constructor with parameters
    public CD(String title, String description, int trackCount, double price){
        super(title, description, price);
        this.trackCount = trackCount;
    }
    //getters and setters
    public int getTrackCount(){
        return trackCount;
    }
    public void setTrackCount(int trackCount){
        this.trackCount = trackCount;
    }
    
    ////my version of a toString method so that my program works properly
    @Override
    public void _toString(){
         System.out.println("CD Information -- Title: " + title + ", Description: "+ description + ", track Count: " + trackCount + ", Price: $"+price);
    }
}
