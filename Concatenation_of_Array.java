public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int ans []= new int[2*nums.length]; 
        int len = nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];            
        }
        for(int i : ans){
            System.out.println(i);
        }
        
    }
}
