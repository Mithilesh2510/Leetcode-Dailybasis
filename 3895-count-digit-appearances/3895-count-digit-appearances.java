class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        digit=(char)(digit+'0');

        for(int i=0;i<nums.length;i++)
            sb.append(nums[i]);

        String s=sb.toString();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == digit) {
                count++;
            }
        }
        return count;
    }
}