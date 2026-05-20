package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> target = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            target.add(index[i], nums[i]);
        }
        int[] ans = new int[n];
        for(int j = 0; j<n ; j++){
            ans[j] = target.get(j);
        }
        return ans;
    }
}
