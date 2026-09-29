package Patterns;

public class p19 {
    static void main() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 1 || i == 3) {
                    System.out.print((char) (i + 96) + " ");
                }
               else{
                    System.out.print((char) (i + 64) + " ");

                }
            //    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
