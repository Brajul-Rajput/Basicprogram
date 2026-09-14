package BASIC;

public class class35 {

    public static void main(String[] args) {
        // Armstrong
        arstong(13);
    }

    public static void arstong(int num) {
        int count = 0;
        int res = 0;
        int copy = num;

        // Count digits
        while (num > 0) {
            num /= 10;
            count++;
        }

        System.out.println("Count = " + count);

        // Calculate Armstrong value
        num = copy;

        while (num > 0) {
            int unit = num % 10;
            res = res + (int) Math.pow(unit, count);
            num /= 10;
        }

        System.out.println("Result = " + res);

        //num=copy;
        if (copy == res) {
            System.out.println("amstromg");
        }
        else {
            System.out.println("not");
        }
    }
}
