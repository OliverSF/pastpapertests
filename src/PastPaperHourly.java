
public class PastPaperHourly extends PastPaper2015{
	
	final int PAY_PER_HOUR = 15;
	private double hoursWorked;
	
	
	public PastPaperHourly(){
		super();
	}
	
	public double getHoursWorked(){
		return hoursWorked;
	}
	
	public void setHoursWorked(double hoursWorked){
		this.hoursWorked = hoursWorked;
	}
	
	public double earnings(){
		
		pay = ((getHoursWorked()*PAY_PER_HOUR));
		return pay;
	}
}
