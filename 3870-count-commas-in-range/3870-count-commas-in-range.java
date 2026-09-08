class Solution {
    public int countCommas(int n) {
        // if(n>=1000 && n<=100000)
        //     return 
        // String s=String.valueOf(n);
        // if(s.length()<4)
        //     return 0;
        // else return 3;
        int count=0;
        for(int i=1000;i<=n;i++){
            count++;
        }
        return count;
    }
}