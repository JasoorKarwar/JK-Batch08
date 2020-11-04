package ReplHomeworks;

import java.util.Scanner;

public class Repl045_SwiStaDaysOfWeek {

	public static void main(String[] args) {

		String day;
	    
		   Scanner scan=new Scanner (System.in);
		   System.out.println("Input a number between 1-7");
		   day=scan.nextLine();
		   
		   switch(day){
		     case"1":
		       day="Monday";
		       break;
		    case"2":
		       day="Tuesday";
		       break;
		    case"3":
		    	day="Wednesday";
		       break;
		    case"4":
		    	day="Thursday";
		       break;
		    case"5":
		    	day="Friday";
		       break;
		    case"6":
		    	day="Saturday";
		       break;
		    case"7":
		    	day="Sunday";
		       break;

		    default:
		    	day="Invalid";
		   }
		   System.out.println(day); 

	}

}
