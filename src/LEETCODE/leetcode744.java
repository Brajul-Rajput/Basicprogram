package LEETCODE;

public class leetcode744 {
    static void main() {
        char arr[]={'a','b','c','d','d','k','x','y','z'};
        System.out.println(nextGreatestLetter(arr,'e'));
    }

        public static char nextGreatestLetter(char[] letters, char target) {
            int s = 0;
            int e = letters.length - 1;
            char ans = letters[0];
            while (s <= e) {
                int mid = (s + e) / 2;
                if (letters[mid] == target) {
                    ans = letters[mid];
                } else if (letters[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                    ans = letters[mid];
                }
            }
            return ans;
        }

}