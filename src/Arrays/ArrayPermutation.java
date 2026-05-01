package Arrays;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
