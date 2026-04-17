class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //  HashMap<String,List<String>> map = new HashMap<>();
        // for(String word : strs){
        //     char[] arr = word.toCharArray();
        //     Arrays.sort(arr);
        //     String sorted = new String(arr);

        //     map.computeIfAbsent(sorted , k->new ArrayList<>()).add(word);
        // }

        // return new ArrayList<>(map.values());


        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            int[] count = new int[26];
            for(char c : word.toCharArray()){
                count[c - 'a']++;
            }

            String sorted = Arrays.toString(count);

            map.computeIfAbsent(sorted , k->new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}