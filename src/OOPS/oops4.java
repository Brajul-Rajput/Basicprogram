package OOPS;

import javax.swing.*;

public class oops4 {
    static void main() {
c5 ds=new c5(23,"aligarh","brajul");
ds.shh();
    }
}
class c5{
    int x;
    String n;
    String c;
    c5(int a,String city,String name){
        x=a;
     n=name;
     c=city;
    }
    void shh(){
        System.out.println(x);
        System.out.println(n);
        System.out.println(c);
    }
}
