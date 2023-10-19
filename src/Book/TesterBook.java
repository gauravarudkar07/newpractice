package Book;

public class TesterBook {

	public static void main(String[] args) {
	
		Book b1=new Book();
		b1.displayDetail();
		System.out.println("**************************");
		
		Book b2=new Book("C++",201,"Stroutp",200);
		b2.displayDetail();
		System.out.println("**************************");
		
		Book b3=new Book();
		b3.setName("JAVA");
		b3.setId(301);
		b3.setAuthor("Vaishnaw");
		b3.setPrice(300);
		b3.getName();
		b3.getId();
		b3.getAuthor();
		b3.getPrice();
	}

}
