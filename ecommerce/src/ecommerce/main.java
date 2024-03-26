package ecommerce;

import models.cart;
import models.orders;
import models.products;
import models.user;

public class main {

    public static void main(String[] args) {
        
        user user1 = new user("user1", "user1@gmail.com", "Address 1");
        user user2 = new user("user2", "user2@gmail.com", "Address 2");

        
        products product1 = new products(1, "Product 1", 10.00);
        products product2 = new products(2, "Product 2", 20.00);
        products product3 = new products(3, "Product 3", 30.00);

       
        orders order1 = new orders(1, user1);
        order1.addproducts(product1);
        order1.addproducts(product2);

        orders order2 = new orders(2, user2);
        order2.addproducts(product2);
        order2.addproducts(product3);

        
        cart cart = new cart(user1);
        cart.addproducts(product1);
        cart.addproducts(product3);
        cart.removeproducts(product1);
    }
}
