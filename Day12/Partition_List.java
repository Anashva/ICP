package ICP;

import java.util.*;
public class Partition_List {
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode st=new ListNode(0);
            ListNode ed=new ListNode(0);
            ListNode d1=st;
            ListNode d2=ed;
            while(head!=null){
                if(head.val<x){
                    d1.next=head;
                    d1=d1.next;
                }
                else{
                    d2.next=head;
                    d2=d2.next;
                }
                head=head.next;
            }
            d2.next=null;
            d1.next=ed.next;
            return st.next;
        }
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
