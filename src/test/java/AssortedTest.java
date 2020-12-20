import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssortedTest {
    Assorted assorted;
    int[] ogArray;
    int[] array1;
    int[] array2;

    @Before
    public void setup(){
        assorted = new Assorted();
        ogArray = new int[]{1, 2, 3, 4};
        array1 = new int[]{1, 3, 2, 4, 1};
        array2 = new int[]{-5, -1, -3, 2, 3};
    }

    @Test
    public void addEmAllTest(){
        int expected = 50;
        int actual = assorted.addEmAll(ogArray);
        Assert.assertEquals(expected, actual);
    }
}
