/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbookshelf;

import java.util.ArrayList;

/**
 *
 * @author Sharkbait
 */
public class BookShelf {
    private int counter = 0;
    private final int MAX_CAPACITY = 5;
    private ArrayList<Book> bookList = new ArrayList<>();
    
    
    void add(Book newBook){
        if (isFull()){
            System.out.println("Book cannot be added! Your bookshelf is full");
        }
        if (bookList.isEmpty() || !isDuplicate(newBook)){
            bookList.add(newBook);
            counter++;
            System.out.println("Book " + newBook.toString() + 
                    "has been added to the shelf! Total number of books is " 
                    + counter);
        } 
    }
    
    void remove(Book b) {
        if (bookList.isEmpty()){
            System.out.println("The bookshelf is already empty! Nothing to remove");
            
        }
        if (bookList.contains(b)) {
            bookList.remove(b);
            counter--;
            System.out.println("Book " + b.toString() + 
                    " has been removed from the shelf! Total number of books is " 
                    + counter);
        } 
        else{
            System.out.println("The Book " + b.getTitle() + 
                    " cannot be removed because it is not on the shelf");
        }
    }
    
    public boolean isFull(){
        if (counter == MAX_CAPACITY){
            return true;
            
        } 
        return false;
    }
   
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    
    @Override
    public String toString() {
        String bookInfo = "";
        for (Book b : bookList) {
            bookInfo += b.toString() + " ";
        }
        return bookInfo;
    }
    
    public boolean isDuplicate(Book book) {
        if (bookList.contains(book)){
            System.out.println("Book " + book.toString() + "is already on"
                    + "the shelf");
            return true;
        }
        return false;
    }
}
