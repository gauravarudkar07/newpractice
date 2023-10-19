package student;

public class Student {
	private int rollNo;
	private float marks1,marks2,marks3;
	
	public void acceptInfo(int rno, float m1, float m2, float m3) {
		rollNo=rno;
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	public void displayInfo() {
		System.out.println("Roll No.: "+rollNo);
		System.out.println("Marks1: "+marks1);
		System.out.println("Marks2: "+marks2);
		System.out.println("Marks3: "+marks3);
		
		float sum=marks1+marks2+marks3;
		float per=sum/3;
		System.out.println("Total: "+sum);	
		System.out.println("Percentage: "+per);
		
		if(per>=81) {
			System.out.println("Grade: A");
		} else if(per>=61) {
			System.out.println("Grade: B");
		} else if(per>=41) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: D");
		}
	}
}