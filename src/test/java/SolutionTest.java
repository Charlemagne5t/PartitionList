import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void partitionTest1(){
        int x = 3;
        ListNode actual = new ListNode(1);
        actual.next = new ListNode(4);
        actual.next.next = new ListNode(3);
        actual.next.next.next = new ListNode(2);
        actual.next.next.next.next = new ListNode(5);
        actual.next.next.next.next.next = new ListNode(2);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(3);
        expected.next.next.next.next.next = new ListNode(5);

        actual = new Solution().partition(actual, x);

        boolean result = compareLists(actual, expected);
        Assert.assertTrue(result);


    }

    private boolean compareLists(ListNode actual, ListNode expected) {
        while (actual !=null && expected != null){
            if(actual.val != expected.val){
                return false;
            }
            actual = actual.next;
            expected = expected.next;
        }

        return true;
    }
}
