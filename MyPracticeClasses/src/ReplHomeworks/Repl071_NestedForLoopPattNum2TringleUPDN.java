package ReplHomeworks;

public class Repl071_NestedForLoopPattNum2TringleUPDN {

	public static void main(String[] args) {

		for (int i = 7; i >= 2; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}