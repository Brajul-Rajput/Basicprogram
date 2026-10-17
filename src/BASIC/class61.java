package BASIC;

public class class61 {
    static void main() {
        int arr[] = {2, 6, 8, 15, 34, 60};

        int s = arr[0];
        int e = arr.length - 1;
        while (s <= e) {
            int mid1 = s + (e - s) / 3;
            int mid2 = e - (e - s) / 3;
            int target = 15;
            if (target <= arr[mid1]) {
                s = arr[0];
                mid1 = mid1 - 1;
                System.out.println();
            }
            else if (target >= mid2) {
                mid2 = mid2 + 1;
                e = arr.length - 1;
            }
            else {
                mid1 = mid1 + 1;
                mid2 = mid2 - 1;
            }

        }
    }
}


