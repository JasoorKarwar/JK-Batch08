package ReplHomeworks;

public class Repl057_ForLoopOddNum {

	public static void main(String[] args) {
		
		//Create a for loop that prints out odd numbers from 5 to 22
		//Must not include the number 22 in the output 
		
		for(int b=5; b<22; b++) {
			if(b%2!=0) {
				System.out.println(b);
			}
		}
		
	}

}
