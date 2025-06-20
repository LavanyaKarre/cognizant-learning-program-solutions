package InventoryManagementSystem;
import java.util.*;

public class Product {
	int productId;
	String productName;
	int quantity;
	double price;
	static HashMap<Integer, Product> products = new HashMap<>();
	
	Product(int productId, String productName, int quantity, double price){
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	static void addProduct(Product p) {
		products.put(p.productId, p);
	}
	
	static void updateProduct(int productId, int quantity, double price) {
		if(products.containsKey(productId)) {
			Product p = products.get(productId);
			p.price = price;
			p.quantity = quantity;
		}else {
			System.out.println("Product Id is not found");
		}
	}
	
	static void deleteProduct(int productId) {
		if(products.containsKey(productId)) {
			products.remove(productId);
		}else {
			System.out.println("Product Id is not found");
		}
	}
}
