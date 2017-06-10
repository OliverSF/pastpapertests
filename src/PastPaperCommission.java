
public class PastPaperCommission extends PastPaper2015 {

	private final double COMMISSION_RATE =.10;
	private double sales;
	
	public PastPaperCommission(){
		super();
	}
	
	public double getSales(){
		return sales;
	}
	
	public void setSales(double sales){
		this.sales = sales;
	}
	
	public double earnings(){
		
		pay = ((getSales())*COMMISSION_RATE);
		
		return pay;
	}
}
