package SHASHWAT;

import java.util.Scanner;

public class class11 {
    static void main() {
        // find the power 2^4=16
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit  : ");
        int num=sc.nextInt();
        System.out.println("enter the power of the digit : ");
        int pow=sc.nextInt();
        int res=(int)Math.pow(num,pow);
        System.out.println(res);

    }
}
