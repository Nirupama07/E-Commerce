package src.services;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<Long, Product> products = new HashMap<>();
    private Long productIdCounter = 1L;

    public Product addProduct(Product product) {
        product.setId(productIdCounter++);
        products.put(product.getId(), product);
        return product;
    }

    public Product getProductById(Long id) {
        return products.get(id);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }
}
