package ReplHomeworks;

import java.util.Scanner;

public class Repl044_SwiStaCars {

	public static void main(String[] args) {

		String car;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		car = scan.nextLine();

		switch (car) {

		case "BMW":
			car = "german car";
			break;
		case "Toyota":
			car = "japanese car";
			break;
		case "Maserati":
			car = "italian car";
			break;
		default:
			car = "unknown";

		}
		System.out.println("Your favorite car is "+car);
	}

}
