class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);

        for(int x:map.keySet())
            set.add(map.get(x));

        return set.size()==map.size();
    }
}