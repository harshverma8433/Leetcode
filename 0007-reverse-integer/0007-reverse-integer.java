class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int copy_x = x;
        if(x<0){
            copy_x = -1*copy_x;
        }
        while(copy_x>0){
            int r = copy_x%10;
            reverse = reverse*10 + r;
          
            copy_x = copy_x/10;
        }

 if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            return 0;
        }
        if(x<0){
            return (int)(-1*reverse);
        }

        return (int) reverse;
    }
}