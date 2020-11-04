package ReplHomeworks;

public class Repl061_ForLoopMultiplicationTable {

	public static void main(String[] args) {
		// Write a program that uses for loop to prints multiplication of
		// number 3 from 1 to 10
		int num1 = 3;
		int result;

		for (int i = 1; i <= 10; i++) {
			result = i * num1;
			System.out.println(num1 + " * " + i + " = " + result);
		}
	}
}
