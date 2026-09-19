package OOPS;

public class oops7 {
    static void main() {
       c8 d=new c8(12,"black");
       c8 df=new c8(d);
    }
}
class c8{
    int a;
    String color;
    c8(int nums,String cl){
        a=nums;
        color=cl;
        System.out.println(a+" "+color);
        System.out.println("prameter consurctor ");
    }
    c8(c8 ref){
        a=ref.a;
        color=ref.color;
        System.out.println("copy constuctor value ");
        System.out.println(a+" "+color);


    }
}
