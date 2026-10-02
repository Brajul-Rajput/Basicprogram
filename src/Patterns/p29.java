package Patterns;

public class p29 {
   // import java.util.Scanner;

  //  public class Exercise3 {
        public static void main(String[] args) {
            int [] arr={1,2,3,5,6};
            for(int i=1;i<=arr.length;i++){
                if(i!=arr[i-1]){
                    arr[i-1]=i;
                    System.out.println(i);
                    break;
                }
            }

        }
    }



