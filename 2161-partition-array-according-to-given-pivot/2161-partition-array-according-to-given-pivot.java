class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count=0;
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot)
                l1.add(nums[i]);
            else if(nums[i]<pivot)
                l2.add(nums[i]);
            else
                count++;
        }
        int index=0;
        for(int i=0;i<l2.size();i++)
            nums[index++]=l2.get(i);
        while(count!=0){
            nums[index++]=pivot;
            count--;
        }
        
        for (int i=0;i<l1.size();i++)
            nums[index++]=l1.get(i);
        
        return nums;
    }
}