public class Find_First_and_Last_Position_of_Element_in_Sorted_Array{
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,2};
        int target = 6;
        int[] arr = {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0] = i;
                break;
            }

        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                arr[1] = i;
                break;
            }
        
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}
