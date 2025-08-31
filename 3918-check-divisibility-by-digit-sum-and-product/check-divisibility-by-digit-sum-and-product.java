class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int temp = n;
        while(temp != 0){
            int rev = temp %10;
            sum += rev;
            p *= rev;
            temp = temp/10;
        }
        return (n % (sum+p)) == 0;
    }
}