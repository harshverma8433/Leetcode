public  class Build_Array_from_Permutation{
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] nums1 = new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            nums1[c++] = nums[nums[i]];
        }

        for(int i : nums1){
            System.out.println(i);
        }
    }
    
}
