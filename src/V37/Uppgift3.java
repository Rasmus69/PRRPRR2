import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift3 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> jae = Nae();

		System.out.println(jae);

	}

	public static ArrayList<Object> Nae() {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random() * 10);
		ArrayList<Object> objekt = new ArrayList<Object>();
		for(int i = 0; i < random; i++) {
			System.out.println("Skriv ett ord.");
			Object in = (Object) sc.nextLine();
			objekt.add(in);
			
		}
		sc.close();
		return objekt;
		
	}

}
