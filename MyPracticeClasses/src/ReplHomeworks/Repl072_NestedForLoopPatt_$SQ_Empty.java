package ReplHomeworks;

public class Repl072_NestedForLoopPatt_$SQ_Empty {

	public static void main(String[] args) {

		int n=4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 || j == 1 || i == n || j == 4) {
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

