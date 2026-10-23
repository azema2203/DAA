class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        int length = 0;
        for (ListNode p = head; p != null; p = p.next) length++;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int size = 1; size < length; size *= 2) {
            ListNode prev = dummy;
            ListNode cur = dummy.next;

            while (cur != null) {
                ListNode left = cur;
                ListNode right = split(left, size);   
                cur = split(right, size);             
                prev = merge(left, right, prev);
            }
        }

        return dummy.next;
    }

   
    private ListNode split(ListNode head, int n) {
        if (head == null) return null;
        for (int i = 1; i < n && head.next != null; i++) {
            head = head.next;
        }
        ListNode rest = head.next;
        head.next = null;   
        return rest;
    }

    private ListNode merge(ListNode l1, ListNode l2, ListNode prev) {
        ListNode cur = prev;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 != null) ? l1 : l2;

        while (cur.next != null) cur = cur.next;
        return cur;
    }
}