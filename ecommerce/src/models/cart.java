package models;

import java.util.ArrayList;
import java.util.List;

class cart {
    private user user;
    private List<products> products;

    public cart(user user) {
        this.user = user;
        this.products = new ArrayList<>();
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

	public void addProducts(products products) {
        products.add(products);
    }

    public void removeProducts(products products) {
        products.remove(products);
    }
}
