class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.trim().split(" ");
        String ans = "";

        for(String word:arr){
            if(word.length()<=2)
                ans+=word.toLowerCase()+" ";
            else{
                ans+=Character.toUpperCase(word.charAt(0));
                ans+=word.substring(1).toLowerCase()+ " ";
            }
        }
        return ans.trim();
    }
}
 