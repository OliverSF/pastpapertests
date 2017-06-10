import java.util.*;
import java.io.*;
import java.text.*;

public abstract class PastPaper2015 implements Serializable{
	
	private String name;
	private String ppsNumber;
	private int employeeNumber;
	static int numberOfEmployees = 1;
	protected double pay;
	DecimalFormat format = new DecimalFormat("0.00");
	private transient String password;
	
	public PastPaper2015(){
		this.name = "";
		this.ppsNumber = "";
		this.employeeNumber = numberOfEmployees++;
		this.pay = 0;
	}
	
	public String getName(){
		return name;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getPPS(){
		return ppsNumber;
	}
	
	public void setPPS(String ppsNumber){
		this.ppsNumber = ppsNumber;
	}
	
	public int getEmployeeNumber(){
		return employeeNumber;
	}
	
	public String toString(){
		return getName() + " " + getPPS() + " " + getEmployeeNumber() + " " + format.format(pay);
	}
	
	abstract double earnings();
}
