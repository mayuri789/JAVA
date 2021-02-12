package day13Collection;

import java.util.ArrayList;

class Product
{
	int productId;
	 String productName;
	 String productDescription;
	public Product(int productId, String productName, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		
		
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + "]";
	}
	 
	 
	 
}

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> product= new ArrayList<Product>();
		product.add(new Product(1,"mobile","45000rs"));
		product.add(new Product(2,"tv","90000rs"));
		product.add(new Product(3,"fridge","50000rs"));
		
		for(Product y: product) 
		{
			System.out.println();
		}

 
	}

}
