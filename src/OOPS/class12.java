package OOPS;

public class class12 extends subb {
    int p=30,q=40,r;
    void da(){
        r=p-q;
        System.out.println(r);
    }

    static void main() {
       class12 obj=new class12();
       obj.sum();
       obj.da();
    }

}
class subb {
    int a=10,b=20,sum;

    void sum(){
        sum=a+b;
        System.out.println(sum);
    }

}


