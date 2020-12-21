import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssortedTest {
    Assorted assorted;
    int[] ogArray;
    int[] array1;
    String christine;
    String shubham;
    int[] dupes1;
    int[] dupes2;

    @Before
    public void setup(){
        assorted = new Assorted();
        ogArray = new int[]{1, 2, 3, 4};
        array1 = new int[]{1, 2, 3};
        christine = "christine";
        shubham = "Shubham";
        dupes1 = new int[]{5, 5, 7, 3, 4, 3};
        dupes2 = new int[]{1, 2, 1, 3, 2, 3, 0};
    }

    @Test
    public void addEmAllTest1(){
        int expected = 50;
        int actual = assorted.addEmAll(ogArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addEmAllTest2(){
        int expected = 20;
        int actual = assorted.addEmAll(array1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findHighestCharTest1(){
        char expected = 't';
        char actual = assorted.findHighestChar(christine);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findHighestCharTest2(){
        char expected = 'u';
        char actual = assorted.findHighestChar(shubham);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesTest1(){
        int[] expected = new int[]{5, 7, 3, 4};
        int[] actual = assorted.removeDuplicates(dupes1);

        int expected1 = expected[0];
        int expected2 = expected[1];
        int expected3 = expected[2];
        int expected4 = expected[3];
        int expectedLength = expected.length;

        int actual1 = actual[0];
        int actual2 = actual[1];
        int actual3 = actual[2];
        int actual4 = actual[3];
        int actualLength = actual.length;

        Assert.assertEquals(expectedLength, actualLength);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void removeDuplicatesTest2(){
        int[] expected = new int[]{1, 2, 3, 0};
        int[] actual = assorted.removeDuplicates(dupes2);

        int expected1 = expected[0];
        int expected2 = expected[1];
        int expected3 = expected[2];
        int expected4 = expected[3];
        int expectedLength = expected.length;

        int actual1 = actual[0];
        int actual2 = actual[1];
        int actual3 = actual[2];
        int actual4 = actual[3];
        int actualLength = actual.length;

        Assert.assertEquals(expectedLength, actualLength);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void removeDupesByShuTest1(){
        int[] expected = new int[]{3, 4, 5, 7};
        int[] actual = assorted.removeDuplicatesByShu(dupes1);

        int expected1 = expected[0];
        int expected2 = expected[1];
        int expected3 = expected[2];
        int expected4 = expected[3];
        int expectedLength = expected.length;

        int actual1 = actual[0];
        int actual2 = actual[1];
        int actual3 = actual[2];
        int actual4 = actual[3];
        int actualLength = actual.length;

        Assert.assertEquals(expectedLength, actualLength);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void removeDupesByShuTest2(){
        int[] expected = new int[]{0, 1, 2, 3};
        int[] actual = assorted.removeDuplicatesByShu(dupes2);

        int expected1 = expected[0];
        int expected2 = expected[1];
        int expected3 = expected[2];
        int expected4 = expected[3];
        int expectedLength = expected.length;

        int actual1 = actual[0];
        int actual2 = actual[1];
        int actual3 = actual[2];
        int actual4 = actual[3];
        int actualLength = actual.length;

        Assert.assertEquals(expectedLength, actualLength);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }
}
