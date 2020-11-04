package ClassTasks;

public class ContinueKeyword {

	public static void main(String[] args) {
		// I want to print numbers from 1 to 5 except number 3

		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("End of the loop");

		System.out.println();
		System.out.println("-------------------------------------");

		for (int a = 1; a <= 10; a++) {

			if (a == 3 || a == 7) {
				continue;
			}
			System.out.print(a + " ");
		}

		System.out.println();
		System.out.println("-------------------------------------------------");

		for (int b = 1; b <= 20; b++) {
			if (b == 5 || b == 10 || b == 20) {
				continue;
			}
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		for (int c = 10; c <= 80;) {
			c += 10;
			System.out.print(c + " ");
		}

		System.out.println();
		System.out.println("=================================================");

		for (int d = 1; d <= 50; d++) {
			if (d == 5 || d == 10 || d == 15) {
				continue;
			}
			System.out.print(d + " ");

		}
		System.out.println();
		System.out.println("-----------------------------------------------");

		for (int e = 1; e <= 50; e++) {
			if (e % 3 == 0) {
				continue;
			}
			System.out.print(e + " ");
		}

		System.out.println();
		System.out.println("-----------------------------------------------");

		// sum of even and odd numbers from 100 to 200

		int sumA = 0;
		int sumB = 0;

		for (int x = 100; x <= 200; x++) {
			if (x % 2 == 0) {
				sumA = x + sumA;
			} else {
				sumB = x + sumB;
			}
		}

		System.out.println("Sum of even numbers is " + sumA);
		System.out.println("Sum of odd numbers is " + sumB);

		System.out.println();
		System.out.println("-----------------------------------------------");

		// sum of even and odd numbers from 300 to 1000
		int sumY = 0;
		int sumZ = 0;

		for (int h = 300; h <= 1000; h++) {
			if (h % 2 == 0) {
				sumY = h + sumY;
			} else {
				sumZ = h + sumZ;
			}

		}
		System.out.println("Sum of even number "+sumY);
		System.out.println("Sum of even number "+sumZ);
		
		System.out.println();
		System.out.println("-----------------------------------------------");

		// sum of even and odd numbers from 20 to 80
		
		int sumEv=0;
		int sumOd=0;
		for (int cd=20; cd<=80; cd++) {
			if(cd%2==0) {
				sumEv=cd+sumEv;
			}else {
				sumOd=cd+sumOd;
			}
		}
		System.out.println("Sum of even number "+sumEv);
		System.out.println("Sum of even number "+sumOd);
	}
}
