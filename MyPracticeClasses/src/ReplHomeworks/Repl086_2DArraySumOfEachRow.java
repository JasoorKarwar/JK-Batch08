package ReplHomeworks;

public class Repl086_2DArraySumOfEachRow {

    public static void main(String[]args){

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        for(int i = 0; i < 4; i++){
            int sum = 0;
            for(int j = 0; j < 3; j++){
                sum = sum + a[i][j];
            }
            System.out.println(sum);
        }
        System.out.println();
        System.out.println("======================Another Way===============================");


        int rows, cols, sumRow, sumCol;
        rows = a.length;
        cols = a[0].length;
        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);
        }




    }
    }

