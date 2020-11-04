package ReplHomeworks;

import java.util.Scanner;

public class Repl063_ForLoopSeriesOfNum {

	public static void main(String[] args) {

		Scanner input;
		int x;
		System.out.print("In: ");
		input = new Scanner(System.in);
		x = input.nextInt();

		for (int a = 0; a < x; a++) {
			System.out.print(a + " ");
		}
	}
}
