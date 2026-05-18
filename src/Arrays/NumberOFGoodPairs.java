package Arrays;

public class NumberOFGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3,2};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i]==nums[j] )
                    ans++;
            }
        }
        return ans;
    }
}
