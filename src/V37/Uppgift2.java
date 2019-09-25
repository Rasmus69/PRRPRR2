import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		System.out.println("Skriv in ett ord");
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		
		String reverseStr = reverse(in);
		System.out.println("Result: " + reverseStr);
	}
	
	public static String reverse(String str) {
			String stringReversed ="";
			
			for(int i = str.length() - 1; i>=0; i--) {
				
				stringReversed = stringReversed + str.charAt(i);
				
			}
			
			return stringReversed;
			
		}
	}