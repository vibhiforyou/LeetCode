package leetcode.problems.easy.mergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode result=head;

        while (temp1 != null && temp2 != null) {
            if(temp1.val<temp2.val){
                head.next=temp1;
                head=temp1;
                temp1=temp1.next;
            }
            else
            {
                head.next=temp2;
                head=temp2;
                temp2=temp2.next;
            }
        }
        while (temp1!=null){
            head.next=temp1;
            head=temp1;
            temp1=temp1.next;
        }

        while (temp2!=null){
            head.next=temp2;
            head=temp2;
            temp2=temp2.next;
        }
        return result.next;
    }
}

class MergeTwoSortedLists {
    public static void main(String... args) {
        Solution solution = new Solution();
        ListNode l13 = new ListNode(4, null);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);

        ListNode l23 = new ListNode(4, null);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);

//        ListNode head=solution.mergeTwoLists(l11, l21);
//
//        while(head!=null)
//        {
//            System.out.println(head.val);
//            head=head.next;
//        }

        ListNode head1=solution.mergeTwoLists(null, null);
        while(head1!=null)
        {
            System.out.println(head1.val);
            head1=head1.next;
        }

    }
}
