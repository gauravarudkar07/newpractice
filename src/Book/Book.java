package Book;

public class Book {
	
	private String bName;
	private int bId;
	private String bAuthor;
	private float bPrice;
	
	public Book(){
		bName="Sham_Chi_Aai";
		bId=101;
		bAuthor="SaneGuruji";
		bPrice=150;
	}
	
	public Book(String bName,int bId,String bAuthor,float bPrice){
		this.bName=bName;
		this.bId=bId;
		this.bAuthor=bAuthor;
		this.bPrice=bPrice;
	}
	
	public void displayDetail() {
		System.out.println("Book Name : "+bName);
		System.out.println("Book ID : "+bId);
		System.out.println("Book Author : "+bAuthor);
		System.out.println("Book Price : "+bPrice);
	}
	
	public void setName(String bName) {
		this.bName=bName;
	}
	public void setId(int bId) {
		this.bId=bId;
	}
	public void setAuthor(String bAuthor) {
		this.bAuthor=bAuthor;
	}
	public void setPrice(float bPrice) {
		this.bPrice=bPrice;
	}
	public String getName() {
		return bName;
	}
	public int getId() {
		return bId;
	}
	public String getAuthor() {
		return bAuthor;
	}
	public float getPrice() {
		return bPrice;
	}
	

}
