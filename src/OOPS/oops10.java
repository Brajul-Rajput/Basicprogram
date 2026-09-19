package OOPS;

public class oops10 {
    static {
        System.out.println("static block hai !!");
    }


    static void main() {
       c11 g=new c11(12);
       g.sd();
    }
}
class c11{
    static {
        int a=10;
        System.out.println("static block "+a);
    }
    static {
        System.out.println("seoncd staticn");
    }
    {
        float b=20.05f;
        System.out.println("instance block "+b);
    }
    int c;
    c11(int x){
        c=x;
        System.out.println("constructor "+c);
    }
    String name;
    int age ;
    void sd(){
        age=23;
        name="brajul";
        System.out.println(age+" "+name);
    }

}


