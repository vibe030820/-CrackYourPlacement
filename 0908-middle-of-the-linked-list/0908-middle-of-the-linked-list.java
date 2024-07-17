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
    public ListNode middleNode(ListNode head) {
        int c=0;
                int mid=0;
        ListNode cur=head;
        while(cur.next!=null){
        cur=cur.next;
        c++;}
        if(c%2==0)
        mid=c/2;
        else
        mid=c/2 + 1;
        int i=0;
        while(mid>0){
            
            head=head.next;
            mid--;
            
        }
        return head;
    }
}