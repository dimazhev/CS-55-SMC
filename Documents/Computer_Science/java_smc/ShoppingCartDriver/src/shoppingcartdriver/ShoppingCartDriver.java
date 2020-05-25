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
public class ShoppingCartDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer(1234, "Professor", "Dekhoda");
        ShoppingCart cart1 = c1.getShoppingCart();
        cart1.addItem(new Book("Game of Thrones", "A Story about an Iron Throne", 25.00, 700));
        cart1.printItems();
        cart1.addItem(new Movie("Avatar", "A movie about blue people", 25.00, 120));
        cart1.printItems();
        Item movie1= new Movie("Avengers", "Ironman Dies", 19.00, 155);
        cart1.addItem(movie1);
        cart1.printItems(); 
        Item CD1 = new CD("Toxicity","System of Downs 4th Album",12, 10);
        cart1.addItem(CD1);        
        cart1.printItems();
        cart1.removeItem(CD1);
        cart1.printItems();
        cart1.removeItem(movie1);
        cart1.printItems();
    }
    
}
