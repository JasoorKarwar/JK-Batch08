package ReplHomeworks;

import java.util.Scanner;

public class Repl037_LogicalOperator {

	public static void main(String[] args) {

		boolean thirsty;
		boolean sleepy;
		String drink = null;

		Scanner scan = new Scanner(System.in);

		System.out.println("Are you thirsty?");
		thirsty = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = scan.nextBoolean();

		if (thirsty == true && sleepy == false) {
			drink = "Water";
			System.out.println("Looks like you need to drink" + " " + drink);
		} else if (thirsty == true && sleepy == true) {
			drink = "Coffee";
			System.out.println("Looks like you need to drink" + " " + drink);
		} else if (thirsty == false && sleepy == false) {
			drink = "Nothing";
			System.out.println("Looks like you need to drink" + " " + drink);
		}
		else {
			drink = "Tea";
			System.out.println("Looks like you need to drink" + " " + drink);
			
		}
	}
}