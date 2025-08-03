class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int j = 0;
        for(int i=0;i<nums1.length;i++){
            arr[j] = nums1[i];
            j++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[j] = nums2[i];
            j++;
        }

        Arrays.sort(arr);
        double res = 0;

        if(arr.length%2 != 0){
            res = arr[arr.length/2];
        }else{
            int v = arr.length/2;
            double s = arr[v-1] + arr[v];
            res = s/2;
        }

        return res;
    }
}