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
public class TestBookShelf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book("The Litle Prince", "Antoine de Saint-Exupéry", "Jeffrey", 10, "11/20/1942");
        Book b2 = new Book("Abnormal psychology", "jordan peterson", "publisher 2", 11.5, "03/16/2019");
        Book b3 = new Book("The stranger", "Albert Camus", "publisher 3", 10.50, "08/23/2008");
        Book b4 = new Book("Notes from Underground", "Fyodor Dostoevsky", "publisher 4", 13, "07/06/1922");
        Book b5 = new Book("The daVinci Code", "Dan brown", "publisher 5", 100, "07/27/2017");
        
        BookShelf myShelf;
        myShelf = new BookShelf();
        myShelf.remove(b1);
        myShelf.add(b1);
        myShelf.add(b2);
        myShelf.add(b3);
        myShelf.add(b4);
        myShelf.add(b5);
        myShelf.remove(b3);
        b1.toString();
 Book b6 = new Book("Angels and Demons", "Dan brown", "publisher 7", 25, "06/03/2017");
    myShelf.add(b6);
    myShelf.toString();
    }
    
}
