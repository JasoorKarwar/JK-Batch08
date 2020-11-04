package ReplHomeworks;

import java.util.Scanner;

public class Repl039_LogicalOperator {

	public static void main(String[] args) {


		double grade;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your mark");
		grade = scan.nextDouble();


		if (grade >= 1 && grade<25) {
			System.out.println("Your grade is F");
		} else if (grade >= 25 && grade<=45) {
			System.out.println("Your grade is E");
		} else if (grade >= 45 && grade<=50) {
			System.out.println("Your grade is D");
		} else if (grade >= 50 && grade<=60) {
			System.out.println("Your grade is C");
		} else if (grade >= 60 && grade<=80) {
			System.out.println("Your grade is B");
		} else if (grade>80 && grade<=100) {
			System.out.println("Your grade is A");
		}
		else {
			System.out.println("Please enter valid mark");
			
		}
	}
}