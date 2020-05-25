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
import java.util.ArrayList;
public class ShoppingCart {
   ArrayList <Item> items;
    public ShoppingCart(){
        items = new ArrayList <Item>();
    }
    
    public void addItem(Item object){
      items.add(object);
       }
    
    public void removeItem(Item object){
        items.remove(object);
    }
    
    
    public void printItems(){
        System.out.println("Printing items in the Shopping Cart: ");
        int price = 0;
        for (int i = 0; i < items.size(); i++){
            items.get(i)._toString();
            price += items.get(i).getPrice();
        }
        System.out.println("Total Price of cart: $" + price);
        System.out.println("----------------------");
    }
}
