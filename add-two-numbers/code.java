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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalList = new ListNode(0,null);
        int i;
        StringBuilder sb;
        String sl1 = "";
        String sl2 = "";
        while (l1!=null)
        {
            sl1=sl1+l1.val;
            l1=l1.next;
        }
        while (l2!=null)
        {
            sl2=sl2+l2.val;
            l2=l2.next;
        }
        sb = new StringBuilder(sl1);
        sl1 = sb.reverse().toString();
        sb = new StringBuilder(sl2);
        sl2 = sb.reverse().toString();
        long il1 = Long.parseLong(sl1);
        long il2 = Long.parseLong(sl2);
        long res = il1+il2;
        String text = Long.toString(res);
        System.out.println(res);
        ListNode prev = new ListNode();
        ListNode curr = new ListNode(text.charAt(0)-'0',null);
        for (i=1; i<text.length(); i++){
            prev = curr;
            curr = new ListNode(text.charAt(i)-'0',prev);
        }
        finalList = curr;
        return finalList;
    }
}