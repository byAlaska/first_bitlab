package bitlab.askar.Module1.Others;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [][]array = new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array[i][j] = in.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if ((i==j) || (i+j==n-1)){
                    System.out.print("X ");
                }else{
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
