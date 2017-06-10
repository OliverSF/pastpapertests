import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		int choice = 0; //declaring and initialising choice variable
		int temp;
		
		Scanner input = new Scanner(System.in);
		
		while (choice != 3) {
			
			//Output to console to inform user of how to operate program
			System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\n3. Exit");
			
			//Prompting user to enter data
			System.out.print("Enter your Choice: ");
			choice = input.nextInt(); //assigning user input to the Choice variable
			
			//Creating if statement for user input = 1 (ie Fahrenheit to Celsius)
			if (choice == 1) {
				System.out.print("Enter your Temperature: "); //Output to console to prompt user
				temp = input.nextInt();
				calculatetoCelsius(temp);

			}
			
			else if (choice == 2) {
				System.out.print("Enter your Temperature: ");
				temp = input.nextInt();
				calculatetoFahrenheit(temp);
			}
			
			else if (choice == 3) {
				System.out.println("Program Terminated"); //Output to console
			}
		
		}
		input.close();
	}
	public static void calculatetoCelsius(int x){
		int newtemp = ((int)((5.0/9.0)*(x - 32)));
		System.out.println(x + " Fahrenheit is " + newtemp + " Celsius");
	}
		
	public static void calculatetoFahrenheit(int x){
		int newtemp = ((int)((9.0/5.0)*x + 32));
		System.out.println(x + " Celsius is " + newtemp + " Fahrenheit");
	}
	
}