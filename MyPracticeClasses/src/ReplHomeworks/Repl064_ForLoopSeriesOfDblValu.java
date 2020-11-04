package ReplHomeworks;

import java.util.Scanner;

public class Repl064_ForLoopSeriesOfDblValu {

	public static void main(String[] args) {

		  Scanner input;
		     int end;
		    System.out.print("Int:");
		    input=new Scanner(System.in);
		    end=input.nextInt();
		   
		    for(int i=0; i<end*2; i++) {
		    	
		    	System.out.print(i+" ");
		    }
	}
}
