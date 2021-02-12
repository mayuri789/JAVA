package day13Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ProductDetails
{
	int id;
	String name;
	int price;
	
	
	
	public ProductDetails(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

class PriceComparator  implements Comparator<ProductDetails>
{
	@Override
	public int compare(ProductDetails o1, ProductDetails o2) {
		if(o1.price==o2.price)
			return 0;
		else if(o1.price > o2.price)
			return 1;
		return -1;
	}
	
}

class NameComparator implements Comparator<ProductDetails>
{

	@Override
	public int compare(ProductDetails o1, ProductDetails o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}







public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<ProductDetails> productlist = new ArrayList<ProductDetails>();
		productlist.add(new ProductDetails(1, "laptop", 56000));
		productlist.add(new ProductDetails(12, "mobile", 45000));
		productlist.add(new ProductDetails(6, "toy", 2300));
		
		
		for(ProductDetails p : productlist)
		{
			System.out.println(p.id +" "+ p.name +" "+ p.price);
		} 
		
		Collections.sort(productlist, new PriceComparator());
		
		System.out.println("====sort by price=====");
		for(ProductDetails p : productlist)
		{
			System.out.println(p.id +" "+ p.name +" "+ p.price);
		}
		
		
		System.out.println("====sort by name=====");
        Collections.sort(productlist,new NameComparator());
		
		System.out.println("sorting by name");
		for(ProductDetails p : productlist)
		{
			System.out.println(p.id +" "+ p.name +" "+ p.price);
		}
		
		
		
		
		
		
 	}

}
