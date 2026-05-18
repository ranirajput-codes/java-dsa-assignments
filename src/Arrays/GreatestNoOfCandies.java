package Arrays;
import java.util.List;
import java.util.ArrayList;

public class GreatestNoOfCandies {
    public static void main(String[] args) {
        int[]candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int n = candies.length;
        List <Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i = 0; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i = 0; i < n; i++ ){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
