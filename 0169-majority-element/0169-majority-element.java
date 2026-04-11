class Solution {
    public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 int v = map.get(nums[i]);
//                 map.put(nums[i] , v+1);
//             }else{
//                 map.put(nums[i] , 1);
//             }
//         }


//        int maxValue = 0;
//     int maxKey = 0;

// for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//     if (e.getValue() > maxValue) {
//         maxValue = e.getValue();
//         maxKey = e.getKey();
//     }
// }


//         return maxKey;

Arrays.sort(nums);
return nums[nums.length/2];
    }
}