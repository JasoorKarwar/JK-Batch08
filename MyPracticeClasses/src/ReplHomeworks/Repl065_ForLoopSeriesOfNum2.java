package ReplHomeworks;

import java.util.Scanner;

public class Repl065_ForLoopSeriesOfNum2 {

	public static void main(String[] args) {

		Scanner input;
		int x;
		System.out.print("In: ");
		input = new Scanner(System.in);
		x = input.nextInt();

		for (int i = x - 1; i >= 0; i--) {
			System.out.print(i+" ");
		}

	}
}
