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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        int count = 0;
        while(temp!=null){
            count++;
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        int maxsum = 0;
        for(int i = 0; i<count/2; i++){
            int currsum = temp.val + st.peek();
            maxsum = Math.max(maxsum, currsum);
            temp = temp.next;
            st.pop();
        }
        return maxsum;
    }
}