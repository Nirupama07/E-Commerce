package src.services;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();
    private Long orderIdCounter = 1L;

    private UserService userService;
    private ProductService productService;

    public OrderService(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    public Order placeOrder(Long userId, List<Long> productIds) {
        User user = userService.getUserById(userId);
        if (user == null) {
            return null;
        }

        Order order = new Order(orderIdCounter++, user);
        for (Long productId : productIds) {
            Product product = productService.getProductById(productId);
            if (product != null) {
                order.getProducts().add(product);
            }
        }

        orders.add(order);
        return order;
    }

    public List<Order> getOrderHistory(Long userId) {
        List<Order> userOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUser().getId().equals(userId)) {
                userOrders.add(order);
            }
        }
        return userOrders;
    }
}
