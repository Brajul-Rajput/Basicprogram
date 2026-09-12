package BASIC;
import java.util.*;
public class evenodd {
    static void main() {
        // 2 even
        // 3 odd
         Scanner sc=new Scanner (System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even number is : "+num);
        }
        else{
            System.out.println("Odd number is : "+num);
        }
    }
}
