package ICP;

public class Palindrome_Linked_List {
    public class ListNode {
        int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) {
           this.val = val;
       }
       ListNode(int val, ListNode next) {
           this.val = val; this.next = next;
       }
  }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){//finding middle node
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        while(slow!=null){//reverse from middle second half
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }

}
