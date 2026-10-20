class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int max=Integer.MIN_VALUE;
        // int index=-1;
        // int i=0;
        // while(k!=0){
        //     max=Integer.MIN_VALUE;
        //     index=-1;
        //     for(i=0;i<nums.length;i++){
        //         if(nums[i]>max || index==-1){
        //             max=nums[i];
        //             index=i;                    
        //         }
        //     } 
        //     nums[index]=Integer.MIN_VALUE;  
        //     k--;
        // }
        // return max;
        Arrays.sort(nums);
        return nums[nums.length - k];

    }
}