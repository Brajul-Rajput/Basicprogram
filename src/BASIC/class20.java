package BASIC;

import java.util.Scanner;

public class class20 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        System.out.println("enter the digit : ");
        int num2=sc.nextInt();
        System.out.println("select option :  add   sub  mul  div  mod");
      String s=sc.next();
      switch(s){
          case "add":
              System.out.println(num+num2);
              break;
          case "sub":
              System.out.println(num-num2);
              break;
          case "mul":
              System.out.println(num*num2);
              break;
          case "div":
              System.out.println(num/num2);
              break; case "mod":
              System.out.println(num%num2);
              break;
          default:
              System.out.println("error code ");
      }
    }
}
