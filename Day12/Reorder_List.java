package ICP;


import java.util.*;
public class Reorder_List {
    class  ListNode{
        ListNode next;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        temp=head;
        while(!st.isEmpty() && temp!=st.peek()){
            ListNode next=temp.next;
            ListNode last=st.pop();
            if(temp==last){
                break;
            }
            temp.next=last;
            last.next=next;
            temp=next;
        }
        if(temp!=null){
            temp.next=null;
        }
    }
}
