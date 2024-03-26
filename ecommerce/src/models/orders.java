package models;

import java.util.ArrayList;
import java.util.List;

public class orders {
    private int orderId;
    private user user;
    private List<products> products;
    
    public orders()
    {
    }

    public orders(int orderId, user user) {
        this.orderId = orderId;
        this.user = user;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public List<products> getProducts() {
		return products;
	}

	public void setProducts(List<products> products) {
		this.products = products;
	}

	public void addproducts(products products) {
        products.add(products);
    }
}

