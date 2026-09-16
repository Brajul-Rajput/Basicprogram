package LEETCODE;

public class leetcode34 {
    static void main() {
        int arr[] = {2, 2, 4, 4, 8, 12, 16};
        searchRange(arr, 4);

    }

    public static int[] searchRange(int[] nums, int target) {
       int res[]=new int[2];
       int frst=first(nums,4,true);
       int lst=last(nums,4,false);
        res[0]=frst;
        res[1]=lst;
       return res;
    }
         static int first(int[] nums, int target, boolean fist) {
            int s = 0;
            int e = nums.length - 1;
            int ans = -1;
            boolean isfirt = true;
            while (s <= e) {
                int mid = (s + e) / 2;
                if (nums[mid] == target) {
                    ans = mid;
                    if (isfirt) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    s = mid + 1;

                } else {
                    e = mid - 1;
                }

            }
       return  ans;
        }
         static int last(int[] nums, int target, boolean fist) {
            int s = 0;
            int e = nums.length - 1;
            int ans = -1;
            boolean isfrt = false;
            while (s <= e) {
                int mid = (s + e) / 2;
                if (nums[mid] == target) {
                    ans = mid;
                    if (isfrt) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    s = mid + 1;

                } else {
                    e = mid - 1;
                }

            }
            return ans;
        }


    }









