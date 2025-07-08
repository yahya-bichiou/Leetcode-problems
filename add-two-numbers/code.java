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

        int index;
        List <Integer> finalList = new ArrayList <>();
        ListNode finalNode = new ListNode();
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        while (l1!=null && l2!=null){
            finalList.add(l1.val+l2.val);
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            finalList.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            finalList.add(l2.val);
            l2=l2.next;
        }
        for (int i=0; i<finalList.size()-1; i++){
            if (finalList.get(i)>9)
            {
                finalList.set(i,finalList.get(i)%10);
                finalList.set(i+1, finalList.get(i+1)+1);
            }
        }
        if (finalList.get(finalList.size()-1)>9)
        {
                finalList.set(finalList.size()-1,finalList.get(finalList.size()-1)%10);
                finalList.add(1);
        }
        Collections.reverse(finalList);
        curr = new ListNode(finalList.get(0),null);
        for (int i=1; i<finalList.size(); i++){
            prev = curr;
            curr = new ListNode(finalList.get(i),prev);
        }
        finalNode = curr;
        System.out.println(finalList);
        return finalNode;
    }
}