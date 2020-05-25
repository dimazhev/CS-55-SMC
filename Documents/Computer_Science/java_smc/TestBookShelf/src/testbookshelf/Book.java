/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbookshelf;

/**
 *
 * @author Sharkbait
 */
public class Book  {
     private String _title, _author, _publisher;
    private double _price;
    private String _copyright;
    
   //constructor
    public Book (String title, String author, String publisher, double price, String copyright){
        _title = title;
        _author = author;
        _publisher = publisher;
        _price = price;
        _copyright = copyright;
    }
    //getters 
    public String getTitle(){
        return _title;
    }
    public String getAuthor(){
        return _author;
    }
    public String getPublisher(){
    return _publisher;
    }
    public double getPrice(){
        return _price;
    }
    public String getCopyright(){
        return _copyright;
    }
    
    //setters 
    public void setTitle(String title){
        _title = title;
    }
    public void setAuthor(String author){
        _author = author;
    }
    public void setPublisher(String publisher){
        _publisher = publisher;
    }
    public void setPrice(double price){
        _price = price;
    }
    public void setCopyright(String copyright){
        _copyright = copyright;
    }
   public boolean equals(Book b){
      return _title.equals(b._title) &&
              _author.equals(b._author) &&
              _publisher.equals(b._publisher) &&
              _price == b._price &&
              _copyright.equals(b._copyright); 
   }
    
    @Override
    public String toString(){
        return "(Title: " + _title + "\nAuthor: " + _author + "\nPublisher: " + _publisher + 
                "\nPrice: " + _price + "\nCopyright: " + _copyright + ")\n";
    }

}
