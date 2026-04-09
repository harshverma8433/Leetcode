class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int v = map.get(nums[i]);
                v = v+1;
                map.put(nums[i] , v);
            }else{
                map.put(nums[i] , 1);

            }
        }


        map.forEach((key,value) -> {
            if(value>1){
                list.add(key);
                list.add(key);

            }else{
                list.add(key);

            }
        });

        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }

        return list.size();

        
        
    }
}