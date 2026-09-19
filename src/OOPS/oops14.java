package OOPS;

public class oops14 {
    void dis(){
        System.out.println("welcome display text ");
    }



}
class sub1 extends oops14{
    void fist(){
        System.out.println("first display ");
    }



}
class sub2 extends oops14{
    void sec(){
        System.out.println("second display ");
    }


}
class sub3 extends oops14{
    void third(){
        System.out.println("third display ");
    }


}
class mm{
    static void main() {
        sub1 o=new sub1();
        sub2 t=new sub2();
        o.dis();
        o.fist();
        t.dis();
        t.sec();
    }
}