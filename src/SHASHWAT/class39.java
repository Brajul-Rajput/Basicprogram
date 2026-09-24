package SHASHWAT;

public class class39 {
    static void main() {


        int a = 13;
        int b = 18;

        System.out.println("a ="+a);
        System.out.println("b ="+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a ="+a);

        System.out.println("b ="+b);

        System.out.println("a ="+a);
        System.out.println("b ="+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a);
        System.out.println("b ="+b);

    }
}
