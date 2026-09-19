package OOPS;
public class oops12 {
    int s=10,u=20;
    void mul(){
        System.out.println(s*u);
    }

}
class P extends oops12{
    int a=10,b=20;
    void sum(){
        System.out.println(a+b);
    }

}
class Q extends P{
    int x=20,y=50;
    void sub(){
        System.out.println(x-y);
    }

}
class R extends  Q{
    int p=30,q=3;
    void div(){
        System.out.println(p/q);
    }
    static void main() {
        R og=new R();
        og.sum();
        og.mul();
        og.div();
        og.sub();
    }

}
