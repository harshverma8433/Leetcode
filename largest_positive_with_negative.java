import java.util.*;
public class largest_positive_with_negative{
    public static void main(String[] args) {
        int nums[] = {-1,10,6,7,-7,1};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                set.add(nums[i]);
            }
        }

        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                int temp = nums[i] * -1;
                if(set.contains(temp)){
                    if(temp > max){
                        max = temp;
                    }
                }
            }
        }

        System.out.println(set);
        System.out.println(max);
    }   
}