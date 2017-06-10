import java.util.Scanner;

public class insertiontest {

	public static void main(String[] args) {
		
		int [] num = new int[7];
		
		populateA(num);
		
		printA(num);
		
		InsertionSort(num);
		
		System.out.println("\n");
		printA(num);
		
	}
	
	public static void InsertionSort( int [ ] num)
	{
	     int j;                     // the number of items sorted so far
	     int temp;                // the item to be inserted
	     int i;  

	     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
	    {
	           temp = num[ j ];
	           for(i = j - 1; (i >= 0) && (num[ i ] > temp); i--)   // Smaller values are moving up
	          {
	                 num[ i+1 ] = num[ i ];
	          }
	         num[ i+1 ] = temp;    // Put the key in its proper location
	     }
	}
	
	public static int[] populateA(int[] B) {
		
		Scanner input2 = new Scanner(System.in); //Declaring and creating instance of the scanner class
		
		//Output to console to prompt user
		System.out.println("Please enter the numbers in your Array: ");
		
		//Creating for loop to populate the array
		for (int i = 0; i < B.length; i++) {
			
			//setting Array at index 'i' to user input
			B[i] = (int) (input2.nextInt());
		}
		input2.close(); //close input to avoid possible leak
		return B; //return populated array
	}
	
	public static void printA(int[] B) {
		
		//Creating for loop to traverse the Array
		for (int i = 0; i < B.length; i++) {
				System.out.print(B[i] + " "); //Printing out value at index 'i'
		}
	}
}
