package ReplHomeworks;

import java.util.Scanner;

public class Repl079_ForLoopDaysofWeekWithScanner {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String[] array=new String[7];

		for(int i=0; i<array.length; i++) {
			System.out.println("Please enter day "+ (i+1)+ " of the week");
			array[i]=scan.nextLine();
		}
		for (int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}

	}
	}


