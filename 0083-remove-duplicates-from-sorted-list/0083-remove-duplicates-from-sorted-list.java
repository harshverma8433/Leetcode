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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ptr = head;
        ListNode temp = head;
        while(temp.next!=null){
            if(ptr.val == temp.val){
                temp = temp.next;
                ptr.next = temp;
            }
            else{
                ptr = ptr.next;
            temp = temp.next;
            }

        }

        if(ptr.val == temp.val){
            ptr.next = null;
        }

        return head;
    }
}