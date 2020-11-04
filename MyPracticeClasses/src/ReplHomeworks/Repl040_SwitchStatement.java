package ReplHomeworks;

import java.util.Scanner;

public class Repl040_SwitchStatement {

	public static void main(String[] args) {

		Scanner scan;
		String name;
		String assignment;

		scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		name = scan.nextLine();

		switch (name) {

		case "1":
			assignment = "Java";
			break;

		case "2":
			assignment = "SDLC";
			break;

		case "3":
			assignment = "Selenium";
			break;

		case "4":
			assignment = "every";
			break;
		default:
			assignment = "Invalid instructor selected";
		}
		System.out.println("Will take care of" + assignment+ "Assignment");
	}
}
