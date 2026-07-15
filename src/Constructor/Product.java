//Constructor Chaining

package Constructor;

public class Product {
	int oid;
	String oname;
	double price;
	
	public Product(int oid) {
		this.oid=oid;
		System.out.println("Order is created\noid: "+oid);
	}
	
	public Product(int oid,String oname) {
		this(oid);
		this.oname=oname;
		System.out.println("Order name: "+oname);
	}
	
	public Product(int oid,String oname,double price) {
		this(oid,oname);
		this.price = price;
		System.out.println("Order price: "+price);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product(101,"laptop",30000);
	}

}
