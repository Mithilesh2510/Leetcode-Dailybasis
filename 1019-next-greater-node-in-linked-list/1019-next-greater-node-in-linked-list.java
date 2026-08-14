/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int[] values = new int[size];
        temp = head;

        for (int i = 0; i < size; i++) {
            values[i] = temp.val;
            temp = temp.next;
        }

        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (values[j] > values[i]) {
                    ans[i] = values[j];
                    break;
                }
            }
        }

        return ans;
    }
}