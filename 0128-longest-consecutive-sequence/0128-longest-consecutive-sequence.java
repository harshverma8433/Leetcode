class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length == 0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int co = 1;
        // int max = 1;
        // for(int i=0;i<nums.length-1;i++){

        //     if(nums[i] == nums[i + 1]) {
        //         continue;
        //     }

        //     else if(nums[i]+1 == nums[i+1]){
                
        //         co++;
        //         if(co > max){
        //             max = co;
        //         }
        //     }else{
        //         co = 1;
        //     }
        // }
        // return max;

        if(nums.length<2){
            return nums.length;
        }

        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i : nums){
            map.put(i,false);
        }

        int max = -1;
        for(int i : nums){
            int currLen = 1;
            
            int next = i+1;
            while(map.containsKey(next) && map.get(next) == false){
                currLen++;
                map.put(next , true);
                next++;
            }

                        
            int prev = i-1;
            while(map.containsKey(prev) && map.get(prev) == false){
                currLen++;
                map.put(prev , true);
                prev--;
            }

            max = Math.max(currLen,max);
        }

        return max;
    }
}