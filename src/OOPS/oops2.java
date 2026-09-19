package OOPS;

public class oops2 {
    static void main() {
        testb bb=new testb();
        bb.prnt();
    }
}
class testb{
    String pen;
    String color;
    /*
    testb(){
        pen="ball";
        color="black";
    }
*/
    void prnt(){
        System.out.println("pen is "+pen);
        System.out.println("color is "+color);
    }
}
