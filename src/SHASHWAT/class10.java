package SHASHWAT;

import java.util.Scanner;

public class class10 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("number is odd "+num);
        }
        else{
            System.out.println("number is even "+num);
        }
    }
}
