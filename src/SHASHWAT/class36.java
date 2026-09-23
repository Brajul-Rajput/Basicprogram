package SHASHWAT;

public class class36 {
    static void main() {
        int arr[] = {2, 4, 5, 11, 17, 3, 1};
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (mid != 0 && mid != arr.length-1 && arr[mid] > arr[mid + 1] && arr[mid] >arr[mid - 1]) {
                System.out.println(arr[mid]);
                break;
            } else if ( mid != arr.length-1&&arr[mid] < arr[mid + 1]  ) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        // System.out.println(-1);
    }
}
