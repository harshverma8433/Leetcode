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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        
        while(head.val == val && head.next!=null){
            head = head.next;
        }

        if(head.val == val && head.next==null){
            return null;
        }
        if(head.val != val && head.next==null){
            return head;
        }

        ListNode temp = head;
        ListNode ptr = head.next;
        while(ptr.next!=null){
            if(ptr.val == val){
                ptr = ptr.next;
                temp.next = ptr;
            }else{
                temp = temp.next;
                ptr = ptr.next;
            }
        }

        if(ptr.val == val){
            temp.next = null;
        }

        return head;

        
    }
}