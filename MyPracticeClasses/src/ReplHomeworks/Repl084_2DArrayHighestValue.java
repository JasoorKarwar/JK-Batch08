package ReplHomeworks;

public class Repl084_2DArrayHighestValue {

    public static void main(String[]args){

        int[][] a = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };
        int highest = 0;
        for (int row = 0; row<3; row++){
            for (int col=0; col<4; col++){
                if (a[row][col]>highest){
                   highest=a[row][col];
                }
            }
        }
        System.out.print(highest);
    }
}
