
public class GCD {

	public static void main(String[] args) {
	
		System.out.println(greatestCD(13, 7));
		
	}
	
	public static int greatestCD(int a, int b){
		
		if(b == 0){
			return a;
		}
		else return greatestCD(b, a % b);
	}
}
