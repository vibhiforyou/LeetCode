package leetcode.problems.hard.mergedKSortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> elementList = new ArrayList<>();

        for (ListNode node : lists
        ) {
            while (node != null) {
                elementList.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(elementList);

        ListNode head = new ListNode(0, null);
        ListNode temp = head;
        for (int i : elementList) {
            temp.next = new ListNode(i, null);
            temp = temp.next;
        }
        return head.next;
    }
}

class MainClass {
    public static void main(String... args) {
        Solution solution = new Solution();
        ListNode node13 = new ListNode(5, null);
        ListNode node12 = new ListNode(4, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node23 = new ListNode(4, null);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);

        ListNode node32 = new ListNode(6, null);
        ListNode node31 = new ListNode(2, node32);

        ListNode[] listNode = new ListNode[]{node11, node21, node31};

        ListNode head = solution.mergeKLists(listNode);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
