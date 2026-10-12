class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:nums1)
            l.add(x);
        for(int x:nums2)
            l.add(x);
        
        Collections.sort(l);
        int n=l.size()/2;
        int len=l.size();
        double sum=0;


        if(len%2==0)
            sum=(l.get(n)+l.get(n-1))/2.0;
        else 
            sum=l.get(n);

        return sum;
    }
}