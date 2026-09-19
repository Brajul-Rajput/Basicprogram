package OOPS;
class super1{
    void prnt(){
        System.out.println("super 1");
    }
}
class super2{
    void pritn(){
        System.out.println("super 2");
    }

}

public class oops13 extends super1 {
    static void main() {
        super1 og=new super1();
        og.prnt();
    }
}

