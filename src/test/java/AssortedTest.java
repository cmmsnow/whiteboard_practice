import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssortedTest {
    Assorted assorted;
    int[] ogArray;
    int[] array1;

    @Before
    public void setup(){
        assorted = new Assorted();
        ogArray = new int[]{1, 2, 3, 4};
        array1 = new int[]{1, 2, 3};
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
}
