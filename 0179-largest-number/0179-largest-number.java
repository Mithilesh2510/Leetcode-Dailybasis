class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> l = new ArrayList<>();
        String res = "";

        for (int x : nums)
            l.add(String.valueOf(x));

        Collections.sort(l, (a, b) -> (b + a).compareTo(a + b));

        if (l.get(0).equals("0"))
            return "0";

        for (int i = 0; i < l.size(); i++)
            res += l.get(i);

        return res;
    }
}
