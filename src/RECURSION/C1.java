package RECURSION;

public class C1 {
    static void main() {

       numprint(5);
    }
    public static void numprint(int n) {
        if (n == 0) return;
        System.out.println(n);
        numprint(n-1);
    }


}
