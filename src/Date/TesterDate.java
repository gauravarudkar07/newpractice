package Date;

public class TesterDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1;
		d1=new Date();
		System.out.println("Day : "+d1.getDay());
		System.out.println("Month : "+d1.getMonth());
		System.out.println("Year : "+d1.getYear());
		System.out.println("------------------");
		
		d1.setDay(9);
		d1.setMonth(11);
		d1.setYear(2000);
		System.out.println("Day : "+d1.getDay());
		System.out.println("Month : "+d1.getMonth());
		System.out.println("Year : "+d1.getYear());
	}

}
