package GFG;

import java.util.Scanner;

public class GFG4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String strr="fjggnvsnramwqaxvbznvmrionlmmjfgdbcbzhseufn";
     //   String str=sc.next();
        int cout=0;
        for(int i=0;i<strr.length();i++){
           char ch=strr.charAt(i);
           if(ch=='a'||ch=='e' ||ch=='i' || ch=='o'|| ch=='u'){
cout++;
            }
        }
        System.out.println(cout);
    }
}
