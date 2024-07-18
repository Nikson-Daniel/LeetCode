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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHeadPrev = new ListNode(0);
        ListNode returnNode = newHeadPrev;
        int val = 0;


        while (head!=null){

            if(head.val==0){
                ListNode newNode = new ListNode(val);
                newHeadPrev.next = newNode;
                newHeadPrev=newNode;
                val = 0;

            }else{
                val+=head.val;
            }
            head = head.next;
        }


        return returnNode.next.next;
    }
}