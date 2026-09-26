package Patterns;

import java.util.Scanner;

public class p9 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("row input ");
        int row=sc.nextInt();
        System.out.println("col input ");
        int col=sc.nextInt();
        System.out.println("matrix elemnet input ");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("+++++++++++++++++++++++++++");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("+++++++++++++++++++++++++++");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if (i == 1 && j == 1 || i == 1 && j == 2 || i == 2 && j == 1 || i == 2 && j == 2) {
                    System.out.println(" ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }

                //System.out.println();
            }
        }

    }
}
