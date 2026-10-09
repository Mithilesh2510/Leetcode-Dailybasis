class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        for(int x:nums)
            sum+=x;

        Arrays.sort(nums);

        return sum-(nums.length*nums[0]);
    }
}