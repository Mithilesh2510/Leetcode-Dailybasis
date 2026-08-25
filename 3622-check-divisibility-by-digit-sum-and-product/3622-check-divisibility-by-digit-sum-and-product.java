class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int digit=0;
        int val=n;
        int mul=1;
        while(n!=0){
            digit=n%10;
            sum+=digit;
            mul*=digit;
            n/=10;
        }
        if(val%(sum+mul)==0) return true;
        return false;
    }
}