class Solution {
    public int countEven(int num) {
        int sum=0;
        int count=0;
 
        for(int i=1;i<=num;i++){
            int temp=i;
            while(temp>0){
                int digit=temp%10;
                sum+=digit;
                temp/=10;
            }
            if(sum%2==0)
                count++;
            else 
                sum=0;

        }
        return count;
    }
}