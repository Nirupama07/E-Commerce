package ecommerce;

public class Main {
    public static void main(String[] args) {
     
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService(userService, productService);

      
        User user = userService.register(new User(null, "user123", "password"));

 
        productService.addProduct(new Product(null, "Product 1", 10.99));
        productService.addProduct(new Product(null, "Product 2", 15.99));

      
        List<Long> productIds = List.of(1L, 2L); 
        Order order = orderService.placeOrder(user.getId(), productIds);

        if (order != null) {
            System.out.println("Order placed successfully!");
            System.out.println("Order ID: " + order.getId());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
        } else {
            System.out.println("Failed to place order!");
        }
    }
}
