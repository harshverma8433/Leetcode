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
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode listnode = new ListNode(-1);
        ListNode temp = head;
        ListNode ptr = head.next;
        while(ptr!=null){
            temp.next = listnode;
            listnode = temp;
            temp = ptr;
            ptr = ptr.next;
        }


        temp.next = listnode;
        head.next = null;
        return temp;
        



    }
}