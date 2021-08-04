package leetcode.problems.medium.addTwoNumbers;


//Definition for singly-linked list.
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }
        if (carry > 0)
        {
            dummy.next=new ListNode(carry);

        }
        return head.next;
    }
}

class MainClass {
    public static void main(String args[]){

        ListNode node19= new ListNode(9,null);
        ListNode node18= new ListNode(9,node19);
        ListNode node17= new ListNode(9,node18);
        ListNode node16= new ListNode(9,node17);
        ListNode node15= new ListNode(9,node16);
        ListNode node14= new ListNode(9,node15);
        ListNode node13= new ListNode(9,node14);
        ListNode node12= new ListNode(9,node13);
        ListNode node11= new ListNode(9,node12);
        ListNode head1= new ListNode(1,node11);

//
//        ListNode node23= new ListNode(9,null);
//        ListNode node22= new ListNode(9,node23);
//        ListNode node21= new ListNode(9,node22);
        ListNode head2= new ListNode(9,null);

        Solution solution= new Solution();
        ListNode head=solution.addTwoNumbers(head1,head2);

        while(head!=null)
        {
            System.out.println(head.val);
            head=head.next;
        }


    }
}