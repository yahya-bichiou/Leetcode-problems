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
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        int i=0,calcul=0,maxsize=0;
        String sa1,sa2;
        ArrayList <Integer> Array1 = new ArrayList<>();
        ArrayList <Integer> Array2 = new ArrayList<>();
        ArrayList <Integer> FinalArray = new ArrayList<>();
        boolean happened = false;
        while (l1!=null)
        {
            Array1.add(l1.val);
            l1=l1.next;
        }
        while (l2!=null)
        {
            Array2.add(l2.val);
            l2=l2.next;
        }
        for(i=0; i<Math.min(Array1.size(), Array2.size()); i++)
        {
            calcul=Array1.get(i)+Array2.get(i);
            if (calcul > 9)
            {
                 if (happened)
                {
                    FinalArray.set(i,calcul%10+1);
                    happened = false;
                }
                else
                {
                    FinalArray.add(calcul%10);
                }
                FinalArray.add(1);
                happened = true;
            }
            else{
                if (happened)
                {
                    FinalArray.set(i,calcul+1);
                    happened = false;
                }
                else
                {
                    FinalArray.add(calcul);
                }
            }
        }
        if (Array1.size()>Array2.size())
        {
            int diff=Array1.size()-Array2.size();
            if ((diff+FinalArray.size())>Array1.size())
            {
                FinalArray.set(FinalArray.size()-1,Array1.get(diff));
                diff++;
            }
            for(i=diff; i<Array1.size(); i++)
            {
                FinalArray.add(Array1.get(i));
            }
        }
        else if (Array2.size()>Array1.size())
        {
            for(i=Array2.size()-Array1.size(); i<Array2.size(); i++)
            {
                FinalArray.add(Array2.get(i));
            }
        }
        Collections.reverse(FinalArray);
        curr = new ListNode(FinalArray.get(0),null);
        for (i=1; i<FinalArray.size(); i++){
            prev = curr;
            curr = new ListNode(FinalArray.get(i),prev);
        }
        finalList = curr;
        return finalList;
    }
}