package EcommercePlatform;

public class Product {
	int productId;
    String productName;
    String category;
    static Product[] productArray = new Product[100];
    static Product[] sortedProductArray = new Product[100];

    Product(int id, String name, String cat) {
        productId = id;
        productName = name;
        category = cat;
    }
}
class Searching {
	Product linearSearch(Product[] products, int productId) {
		for(int i=0;i<products.length;i++) {
			if(products[i].productId == productId) return products[i];
		}
		return null;
	}
	Product binarySearch(Product[] products, int productId) {
		int i=0, j= products.length;
		while(i<=j) {
			int mid = (i+j)/2;
			if(products[mid].productId == productId) return products[mid];
			else if(products[mid].productId < productId) i = mid+1;
			else j = mid-1;
		}
		return null;
	}
}
