package person;

public class testerPerson {
	
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.displayDetail();
		
		System.out.println("---------------------");
		Person p2=new Person("Rajat",24,"Amravati");
		p2.displayDetail();
		
		System.out.println("---------------------");
		Person p3=new Person();
		p3.setName("Rishi");
		p3.setAge(24);
		p3.setCity("Mumbai");
		System.out.println("Name: "+p3.getName());
		System.out.println("Age: "+p3.getAge());
		System.out.println("City: "+p3.getCity());
		
	}
}