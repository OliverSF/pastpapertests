
public class PrimeNo {

	public static void main(String[] args) {
		
		System.out.println(isPrime(9));

	}
	
	public static boolean isPrime(int n) {
	    int i;
	    for (i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	        
	    }
	    return true;
	}
}
