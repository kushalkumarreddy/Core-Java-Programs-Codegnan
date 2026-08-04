package StringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		
//		StringBuffer sb = new StringBuffer(); //empty string
//		System.out.println(sb); //prints empty string
//		
//		//append
//		sb.append("Java");
//		System.out.println(sb);
		
//		sb.append("Developer");
//		System.out.println(sb);
//		
//		//reverse
//		System.out.println(sb.reverse());
//		
//		//length
//		System.out.println(sb.length());
		
//		//insert
//		System.out.println(sb.insert(0, "core"));
		
		//capacity
//		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer();
		
		System.out.println(sb1.length()); //0
		System.out.println(sb1.capacity()); //16
		
		sb1.append("core java");
		System.out.println(sb1);
		System.out.println(sb1.length()); //9
		System.out.println(sb1.capacity()); //16
		
		//delete
		System.out.println(sb1);
		System.out.println(sb1.delete(2, 5)); //cojava
		
		
		
		
		
	
	}

}
