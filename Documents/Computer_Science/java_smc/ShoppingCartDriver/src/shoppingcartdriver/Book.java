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
public class Book extends Item{
    private int pageCount;  // declare required instance variable for Book
    
    //default constructor
    public Book(){
        pageCount = 0;
    }
    //constructor with parameters
    public Book(String title, String description, double price, int pageCount){
        super(title, description, price);
        this.pageCount = pageCount;
    }
    //getter and setter
    public int getPageCount(){
        return pageCount;
    }
    
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    
    
    ////my version of a toString method so that my program works properly
    @Override
    public void _toString(){
        System.out.println("Book Information -- Title: "+title+", Description: "+description+", Page Count: "+pageCount+", Price: $"+price);
    }
}
