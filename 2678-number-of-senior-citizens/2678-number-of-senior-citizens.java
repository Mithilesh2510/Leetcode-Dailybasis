class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(int i=0;i<details.length;i++){
            char[] arr=details[i].toCharArray();

            int x=(arr[11]-'0')*10+(arr[12]-'0');
            if(x>60)
                count++;
        }
        return count;
    }
}