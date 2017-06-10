import java.util.*;
import java.io.*;
import java.text.*;
public class PastPaperTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<PastPaper2015> array1 = new LinkedList <PastPaper2015>();
		
		array1.add(new PastPaperHourly());
		array1.add(new PastPaperCommission());
		
		
		for (PastPaper2015 p : array1){
			System.out.println("Enter your Name");
			p.setName(input.nextLine());
			System.out.println("Enter your PPS");
			p.setPPS(input.nextLine());
			
			if (p instanceof PastPaperHourly ){
				System.out.println("Enter Your Hours Worked");
				((PastPaperHourly) p).setHoursWorked(input.nextDouble());
				input.nextLine();
			}
			else if (p instanceof PastPaperCommission){
				System.out.println("Enter Your Sales");
				((PastPaperCommission) p).setSales(input.nextDouble());
				input.nextLine();
			}
			
			p.earnings();
		}
		
		PastPaperHourly emp1 = new PastPaperHourly();
		emp1.setName("Mary");
		emp1.setPPS("1120s");
		emp1.setHoursWorked(3223);
		emp1.earnings();
		
		array1.add(emp1);
		
		serialize(array1);
		deserialize(array1);
		
	}	
	public static void serialize(List<PastPaper2015> x) {
		try{
			System.out.println("Serialising the LinkedList");
			FileOutputStream fileStream = new FileOutputStream ("name.dat");
			ObjectOutputStream os = new ObjectOutputStream (fileStream);
			os.writeObject(x);
			os.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void deserialize(List<PastPaper2015> x){
		try{
			
			System.out.println("Deserialising the LinkedList");
			FileInputStream fileStream = new FileInputStream ("name.dat");
			ObjectInputStream os = new ObjectInputStream (fileStream);
			x = (LinkedList<PastPaper2015>)os.readObject();
		 
			for(PastPaper2015 p : x){
				System.out.println(p.toString());
			}
			
			os.close();
		}
	
		catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
