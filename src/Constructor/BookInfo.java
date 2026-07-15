package Constructor;

public class BookInfo {
	int bookid;
	String title;
	String author;
	double price;
	
	public BookInfo() {
		bookid = 101;
		title = "Java Programing";
		author = "James Gosling";
		price = 650;
		
	}
	
		public void display() {
			System.out.println("Book Id: "+bookid);
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("Price: "+price);
		}
		
		public static void main(String[] args) {
			BookInfo b1 = new BookInfo();
			b1.display();
		}

}
