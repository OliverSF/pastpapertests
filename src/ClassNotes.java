
public class ClassNotes {

	public static void main(String[] args) {
				
				String s1 = "Java";
				//String s2 = "Java";
				String s2 = new String("Java");
					
				if (s1 == s2)
				    System.out.println("s1 = s2");
				else
				    System.out.println("s1 != s2");
					
				if (s1.equals(s2))
				    System.out.println("s1 = s2");
				else
				    System.out.println("s1 != s2");
					
	}
}