package SHASHWAT;

import java.util.Scanner;

public class class6 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        System.out.println("number is "+num+" and digit count is "+countdigt(num));

    }
    static int countdigt(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
