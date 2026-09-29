package Patterns;

public class p23 {
    static void main() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((char) (j + 64) + " ");
                }
            }
                System.out.println(" ");

        }
    }
}