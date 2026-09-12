package SHASHWAT;

import java.sql.SQLOutput;
import java.util.Scanner;

public class class9 {
    static void main() {
        //reverse the number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int unit=num%10;
            rev=rev*10+unit;
            num=num/10;
        }
        System.out.println("after reverse "+rev);
    }
}
