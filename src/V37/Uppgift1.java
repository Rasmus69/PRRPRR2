import java.util.Scanner;

public class Uppgift1 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = Nae(sc);
		
		System.out.println("Det totala är " + total);

	}

	public static int Nae(Scanner sc) {
		int total = 0;
		int i=0;
		int random = (int)(Math.random() * 10);
		while(i < random) {
			System.out.println("Skriv in ett heltal");
			int in = sc.nextInt();
			total += in;
			i++;
			
		}
		
		return total;
	}

}
