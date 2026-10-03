package Patterns;

public class p32 {
    public static void main(String[] args) {

        String s = "The  quick  brown fox jumps over the lazy dog, "
                + "but a vexed zebra quietly watches from a nearby hill. "
                + "Amazingly few farmers can jinx such a quirky, blazing wind, "
                + "yet five dozen big boxes of mixed pickles waited for their owner.";

                boolean found = true;

                for (int i = 0; i < s.length(); i++) {

                    char ch = s.charAt(i);

                    if (!Character.isLetter(ch) && ch != ' ') {
                        found = false;
                        break;
                    }
                }

                System.out.println(found);
            }
        }

