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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode headCopy = head;
        int gcd = 0;
        
        while(head.next!=null){
            int first = head.val;
            int snd = head.next.val;
            
            for(int i = 1; i <= Math.min(first, snd); i++){
                if(first%i==0 && snd%i==0){
                    gcd = i;
                }
            }
            
            ListNode temp = head.next;
            ListNode newNode = new ListNode(gcd);
            head.next = newNode;
            newNode.next = temp;
            
            head = newNode.next;
            
            
        }
        
        
        
        
        
        return headCopy;
    }
}