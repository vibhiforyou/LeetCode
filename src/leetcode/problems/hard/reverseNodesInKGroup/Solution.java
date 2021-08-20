package leetcode.problems.hard.reverseNodesInKGroup;

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
    public ListNode reverseKGroup(ListNode head, int k) {
        int nodeCount = 0;
        ListNode t = head;

        while (t != null  && nodeCount<k) {
            t = t.next;
            nodeCount++;
        }
        if(nodeCount<k){
            return head;
        }

        int n=k;
        ListNode tail=head;
        ListNode front=reverseNode(head,n);
        tail.next=reverseKGroup(t,n);
        return front;
    }
    public ListNode reverseNode(ListNode head,int k){
        ListNode current= head;
        ListNode prev = null;
        ListNode next =head;

        while(k!=0)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            k--;
        }
        return prev;
    }

}

class MainClass {
    public static void main(String... args) {
        Solution solution = new Solution();
        ListNode node15 = new ListNode(5, null);
        ListNode node14 = new ListNode(4, node15);
        ListNode node13 = new ListNode(3, node14);
        ListNode node12 = new ListNode(2, node13);
        ListNode node11 = new ListNode(1, node12);
        ListNode head=solution.reverseKGroup(node11, 2);

        while(head!=null)
        {
            System.out.println(head.val);
            head=head.next;
        }
    }
}
