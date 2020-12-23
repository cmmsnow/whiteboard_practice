import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListQsTest {
    LikedListQs likedListQs;
    LinkedList linkedList1;

    @Before
    public void setup(){
        likedListQs = new LikedListQs();
        linkedList1 = new LinkedList();
        linkedList1.add(4);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(10);
    }

    @Test
    public void testCountNodes(){
        int expected = 4;
        int actual = likedListQs.countNodes(linkedList1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddElement(){}

    @Test
    public void testReverseNodes(){}

    @Test
    public void testGetElementAt(){
        Object expected = 3;
        Object actual = likedListQs.getElementAt(linkedList1, 2);
        Assert.assertEquals(expected, actual);
    }
}
