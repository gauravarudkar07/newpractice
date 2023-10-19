package Date;

public class Date {
	private int dd,mm,yy;
	
	public Date() {
		dd=25;
		mm=01;
		yy=1999;
	}
	public Date(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void setDay(int dd) {
		this.dd=dd;
	}
	public void setMonth(int mm) {
		this.mm=mm;
	}
	public void setYear(int yy) {
		this.yy=yy;
	}
	
	public int getDay() {
		return dd;
	}
	public int getMonth() {
		return mm;
	}
	public int getYear() {
		return yy;
	}

}
