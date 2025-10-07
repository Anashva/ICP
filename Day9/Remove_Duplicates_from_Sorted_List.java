package ICP;

public class Remove_Duplicates_from_Sorted_List {
    class  ListNode{
        int val;
        ListNode next;
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
            }
            else{
                head=head.next;
            }
        }
        return temp;
    }
}
