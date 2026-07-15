package Constructor;

public class Food {
	int oid;
	String res;
	String item;
	String add;
	
	public Food(int oid) {
		this.oid = oid;
		System.out.println("Food order started\nOrder Id: "+oid);
	}
	
	public Food(int oid,String res) {
		this(oid);
		this.res = res;
		System.out.println("Restaurant name: "+res);
	}
	
	public Food(int oid,String res,String item) {
		this(oid,res);
		this.item = item;
		System.out.println("Food Item: "+item);
	}
	
	public Food(int oid,String res,String item,String add) {
		this(oid,res,item);
		this.add = add;
		System.out.println("Delivery Address: "+add);
	}
	
	public static void main(String[] args) {
		Food f= new Food(1001, "Paradise", "Chicken Biryani", "Hyderabad");
	}

}
