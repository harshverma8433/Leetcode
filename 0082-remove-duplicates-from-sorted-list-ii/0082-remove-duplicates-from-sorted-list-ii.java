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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        ListNode p1 = dummy;
        while(temp != null){
            if(temp.next != null && temp.next.val == temp.val){
                while(temp.next != null && temp.next.val == temp.val ){
                    temp = temp.next;

                }
                p1.next = temp.next;
                temp = p1.next==null ? null : p1.next;
            }
            else{
                p1 = p1.next;
                temp = temp.next;
            }
        }


    return dummy.next;

       
    }
}