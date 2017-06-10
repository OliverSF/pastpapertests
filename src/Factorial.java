
public class Factorial {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++)
			System.out.println ( i + "! = " + factorialLoop(i));
			}
	
	public static int findFactorial (int number)
	{
		if (( number == 1) || (number == 0))
			return 1;
		else
			return (number * findFactorial (number-1));
	}
	
	public static int factorialLoop(int number){
		
		if ((number == 1) || (number == 0)){
			return 1;
		}	
		else {
			int result = 1;
			for (int i = 1; i <= number; i++){
				result = result*(i);
				
			}
			return result;
			
		}
				
	}
	
}


