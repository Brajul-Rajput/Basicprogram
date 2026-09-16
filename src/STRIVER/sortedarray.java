package STRIVER;

public class sortedarray {
    static void main() {
        int arr[] = {1, 2, 3, 4, 4, 5, 6,};
        int arr2[]={1,2,3,4,2,1,3};
        System.out.println(sorted(arr2));

        System.out.println(sorted(arr));

    }

    public static boolean sorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >=arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}


