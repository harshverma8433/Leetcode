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
    public ListNode swapPairs(ListNode head) {
        int size = 0;
        ListNode ptr = head;
        while(ptr!=null){
            size++;
            ptr = ptr.next;
        }

        ptr = head;


        for(int i=0;i<size/2;i++){
            int swap = ptr.val;
            ptr.val = ptr.next.val;
            ptr.next.val = swap;
            ptr = ptr.next.next;
        }

        return head;
    }
}