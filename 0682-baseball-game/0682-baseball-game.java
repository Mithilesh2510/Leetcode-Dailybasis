class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+"))
                s.push(Integer.parseInt(operations[i]));
            else if(operations[i].equals("C"))
                s.pop();
            else if(operations[i].equals("D"))
                s.push(s.peek()*2);
            else{
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
                
            }
        }
        for(int x:s)
            sum+=x;
        return sum;
    }
}
