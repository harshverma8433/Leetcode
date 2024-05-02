public class search_rotated_sorted_array {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        int res = search(nums, target);
        System.out.println(res);
        
    }

    public static int  search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >= nums[start]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

            else{
                if(nums[mid] <= target && target <= nums[end] ){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }



        }

        return -1;
    }
    
}
