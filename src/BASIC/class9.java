package BASIC;

import java.sql.SQLOutput;
import java.util.Scanner;

public class class9 {
    static void main() {
        // check vowel or consonant
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character : ");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'
                ||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("character is vowel ");
        }
        else{
            System.out.println("character is consonat ");
        }

    }
}
