package ReplHomeworks;

import java.util.Scanner;

public class Repl038_LogicalOperator {

	public static void main(String[] args) {

		boolean weekend;
		String subject;

		Scanner scan = new Scanner(System.in);

		System.out.println("Is it weekend?");
		weekend = scan.nextBoolean();


		if (weekend == false) {
			subject = "Manual testing";
			System.out.println("Today you will be learning" + " " + subject);
		}
		else {
			subject= "Java";
			System.out.println("Today you will be learning" + " " + subject);
			
		}
	}
}