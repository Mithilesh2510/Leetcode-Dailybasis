class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=nums[nums[i]];

        for(int i=0;i<n;i++)
            nums[i]=arr[i];

        return nums;
    }
}