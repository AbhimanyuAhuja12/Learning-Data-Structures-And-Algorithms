public class MergeSort {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.helper();
    }

    public void helper() {
        ListNode fourth = new ListNode(3, null);
        ListNode third = new ListNode(1, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(4, second);

        ListNode sortedHead = sortList(head);
        printList(sortedHead);
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;

        return slow;
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    public void printList(ListNode head) {
        ListNode temp=head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }



    public class ListNode {
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
}
