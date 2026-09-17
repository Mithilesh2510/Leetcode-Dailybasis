class Solution {
    public int minElement(int[] nums) {
        int sum=0;
        int digit=0;

        for(int i=0;i<nums.length;i++){
            sum=0;
            while(nums[i]!=0){
                digit=nums[i]%10;
                sum+=digit;
                nums[i]=nums[i]/10;
            }
            nums[i]=sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}