class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int digit=0;
        int sum=0;

        while(n>0){
            digit=n%10;
            sum=sum*10+digit;
            n/=10;
        }

        return Math.abs(a-sum);
        

    }
}