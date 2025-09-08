class Solution {
    public int mySqrt(int x) {
        int l=0;int h=x;
        int ma=0;
        while(l <= h){
            int mid = l+(h-l)/2;
            long sq= (long)mid*mid;
            if(sq == x){
                return mid;
            }
            else if(sq < x){
                ma=mid;
                 l = mid+1;
            }
            else{
                h= mid-1;
            }
        }
        return ma;
    }
}