import java.util.*;

public class LeapYearTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your Year");
		int x = input.nextInt();
		
		if(((x % 4 == 0) && (x % 100 != 0) ) || ((x % 4 == 0) && (x % 100 == 0) && (x % 400 == 0))){
			System.out.println("This is a leap Year!");	
		}
		else{
			System.out.println("This is not a Leap Year");
		}
		
		input.close();
	}

}
