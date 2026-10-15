class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    List<Integer> list = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = nums[0] + 1; i < nums[nums.length - 1]; i++) {
        boolean found = false;
        for (int x : nums) {
            if (x == i) {
                found = true;
                break;
            }
        }
        if (!found)
            list.add(i);
        }
    return list;
    }
}