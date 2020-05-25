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
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private ShoppingCart _shoppingCart;
    // default constructor
   public Customer(){
       id = 0;
       firstName = null;
       lastName = null;
       _shoppingCart = new ShoppingCart();
   }
   
   //constructor with parameters
    public Customer(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        _shoppingCart = new ShoppingCart();
    }
    //setters and getters
    public int getID(){
        return id;
    }
   
    public void setID(int id){
        this.id = id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public ShoppingCart getShoppingCart(){
        return _shoppingCart;
    }
    
    public void setShoppingCart(ShoppingCart _shoppingCart){
        this._shoppingCart = _shoppingCart;
    }
}
