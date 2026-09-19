package OOPS;

public class oops11 extends X {
    void sd() {
        a = 23;
        b = 34;
        System.out.println(a + b);
    }
    static void main() {
oops11 dd=new oops11();
dd.sg();
dd.sd();
    }
}
class X{
int a=2;
int b=3;
int sum=a+b;
void sg() {
    System.out.println(sum);
}
}