package person;

public class Person {
	
	private String name;
	private int age;
	private String city;
	
	public Person() {
		name="Rahul";
		age=26;
		city="pune";
	}
	public Person(String name,int age,String city) {
		this.name=name;
		this.age=age;
		this.city=city;
		 
	}
	public void displayDetail() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setCity(String city) {
		this.city=city;
	}
}
