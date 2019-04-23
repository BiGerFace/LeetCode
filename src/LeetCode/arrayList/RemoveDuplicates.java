package arrayList;


import java.util.List;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 15:52 2019-4-23
 * @Modified By:
 **/
public class RemoveDuplicates {
    /**
     * Given a linked list,reverse the nodes of a linked list k at a time and return its modified list.
     * k is a positive integer and is less than or equal to the length of the linked list.If the number of nodes
     * is not a multiple of k then left-out nodes in the end should remain as it is.
     * <p>
     * Example:Given this linked list:1->2->3->4->5
     * For k=2,you should return :2->1->4->3->5
     * For k=3,you should return :3->2->1->4->5
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.nextNode = head;
        int count = 0;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            count++;
            ListNode next = cur.nextNode;
            if (count == k) {
                pre = reverse(pre, next);
                count = 0;
            }
            cur = next;
        }
        return dummy.nextNode;
    }

    private static ListNode reverse(ListNode pre, ListNode end) {
        if (pre == null || pre.nextNode == null) {
            return pre;
        }
        ListNode head = pre.nextNode;
        ListNode cur = pre.nextNode.nextNode;
        while (cur != end) {
            ListNode next = cur.nextNode;
            cur.nextNode = pre.nextNode;
            pre.nextNode = cur;
            cur = next;
        }
        head.nextNode = end;
        return head;
    }


    public static void main(String[] args) {
        ListNode data = new ListNode(6);
        ListNode resultData = reverseKGroup(data, 2);
        System.out.println("result:" + resultData.toString());
    }


}

class ListNode {
    int val;
    ListNode nextNode;

    ListNode(int val) {
        this.val = val;
        this.nextNode = null;
    }
}