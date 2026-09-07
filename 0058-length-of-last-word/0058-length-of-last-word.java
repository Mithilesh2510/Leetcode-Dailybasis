class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        int len=s.length();
        for(int i=len-1;i>-1;i--){
            char ch=s.charAt(i);
            if(ch!=' ')
                count++;
            else if(count>0)
                break;
        }
        return count;
    }
}