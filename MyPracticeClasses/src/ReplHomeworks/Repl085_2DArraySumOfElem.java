package ReplHomeworks;

public class Repl085_2DArraySumOfElem {

    public static void main(String[]args){

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum= 0;
        for (int m=0; m<a.length; m++){
            for (int n=0; n<a[m].length; n++){
                sum+=a[m][n];

                }

            }
        System.out.println(sum);

        }

    }

