/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       while(l1 != null)
          a[i++]=l1.val;
        while(l1 !=null)
          b[j++]=l2.val;

       ListNode l3;
       l3.val=a[i--]+b[j--];
       while(j>-1 && i>-1){
         int temp=a[i--]+b[j--];
         ListNode l4;
         l4.val=temp;
         l3.next=l4;
       }
       if(i>-1 ){
         int temp=a[i--];
         ListNode l4;
         l4.val=temp;
         l3.next=l4;
       }else if (j>-1){
         int temp=b[j--];
         ListNode l4;
         l4.val=temp;
         l3.next=l4;
       }


    }
}
