class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        int move=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=max)
                move=move+(max-nums[i]);
        }

        return move;
    }
}