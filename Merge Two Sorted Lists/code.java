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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList <Integer> orderNode = new ArrayList<>();
        ListNode l = new ListNode();
        ListNode curr = new ListNode();
        ListNode prev = new ListNode();

        while (list1!=null){
            orderNode.add(list1.val);
            list1=list1.next;
        }
        while (list2!=null){
            orderNode.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(orderNode);
        Collections.reverse(orderNode);
        if (orderNode.size()!=0){
            curr = new ListNode(orderNode.get(0),null);
            for (int i=1; i<orderNode.size(); i++){
                prev = curr;
                curr = new ListNode(orderNode.get(i),prev);
            }
            l = curr;
        }
        else
        {
            return null;
        }
        return l;
    }
}