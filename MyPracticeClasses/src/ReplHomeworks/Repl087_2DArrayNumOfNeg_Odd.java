package ReplHomeworks;

public class Repl087_2DArrayNumOfNeg_Odd {

	public static void main(String[] args) {

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
		};
	int negOdd=0;
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[i].length; j++){
			if (a[i][j]<0 && a[i][j]%2!=0){
				negOdd=negOdd+1;
			}
		}
	}
	System.out.println(negOdd);

		}
	}


