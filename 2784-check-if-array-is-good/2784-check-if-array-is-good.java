class Solution {
    public boolean isGood(int[] nums) {
        int maxi=nums[0];
        int len=nums.length;

        for(int x:nums){
            if(x>maxi)
                maxi=x;
        }
        int count=0;

        for(int x:nums){
            if(x==maxi)
                count++;
        }

        HashSet<Integer> set=new HashSet<>();

        for(int x:nums)
            set.add(x);

        int len1=set.size();

        if(count==2 && len==maxi+1 && len1==maxi)
            return true;

        return false;

    }
}