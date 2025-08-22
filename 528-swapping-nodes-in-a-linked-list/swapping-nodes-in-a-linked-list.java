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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode head2 = head;
        ListNode first = null;
        ListNode second = null;
        while(head!=null){
            len++;
            if(len == k){
                first = head;
            }
            head = head.next;
        }
        int count =0;
        head = head2;
        while(count != len-k){
            head = head.next;
            count++;
        }
        second = head;
        count = first.val;
        first.val = second.val;
        second.val = count;
        return head2;
    }
}