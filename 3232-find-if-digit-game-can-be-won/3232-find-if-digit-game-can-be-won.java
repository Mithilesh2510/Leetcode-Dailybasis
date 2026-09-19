class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0,sum2=0;
        for(int b: nums){
            if(b<10)
                sum1+=b;
            else
                sum2+=b;
            
        }
        return sum1!=sum2;
    }
}