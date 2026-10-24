class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        int n1=nums1.length,n2=nums2.length;

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int n3=list.size();
        int[] arr=new int[n3];
        for(int i=0;i<n3;i++)
            arr[i]=list.get(i);

        return arr;
    }
}