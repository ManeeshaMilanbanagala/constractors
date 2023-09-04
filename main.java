package constractors;
import java.util.Scanner;
public class main {

	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		
		 String Name;
		 int age;
		 double no_of_km;
		 
		System.out.println("Enter your Name");
		Name = scn.nextLine();
		System.out.println("Enter your age");
		age = scn.nextInt();
		System.out.println("Enter Number of KM");
		no_of_km = scn.nextDouble();
		
		constractors nn = new constractors(Name,age,no_of_km);
		
		nn.calcu();
		nn.display();
		
	}
	
	
	
}
