package ReplHomeworks;

import java.util.Scanner;

public class Repl081_ArrayOfIntSize5Scan {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            System.out.println( arr[j] * 10);
        }
    }
}
