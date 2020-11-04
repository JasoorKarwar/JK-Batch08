package ReplHomeworks;

import java.util.Scanner;

public class Repl042_SwitchStatement {

	public static void main(String[] args) {

		String rollNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		rollNumber = scan.nextLine();

		switch (rollNumber) {

		case "101":
			rollNumber = "Student name: Ramesh";
			break;
		case "102":
			rollNumber = "Student name: Mahesh";
			break;
		case "103":
			rollNumber = "Student name: Mukesh";
			break;
		default:
			rollNumber = "Not found Student name: in Class";

		}

		System.out.println(rollNumber);
	}
}
