package Arrays;
import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(shuffle(nums,5)));
    }
    static int[] shuffle(int[] nums, int n) {
        int [] ans = new int [2*n];
        int x = 0;
        int y = n;
        for(int i = 0; i<2*n; i++){
            if(i%2==0){
                ans[i]=nums[x];
                x++;
            }else{
                ans[i]=nums[y];
                y++;
            }
        }
        return ans;
    }
}
