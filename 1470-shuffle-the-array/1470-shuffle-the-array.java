class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] l=new int[2*n];
        for(int i=0;i<n;i++){
            l[2*i]=nums[i];
            l[2*i+1]=nums[n+i];
        }
        return l;
    }
}