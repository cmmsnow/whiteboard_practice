import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JeremySortTest {
    JeremySort jeremySort;
    int[] arr1;
    int[] arr2;
    int[] sorted1;
    int[] sorted2;

    public boolean isSorted(int[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1])
                return false;
        }
        return true;
    }

    @Before
    public void setup(){
        jeremySort = new JeremySort();
        arr1 = new int[] {5, 4, 3, 6, 7};
        arr2 = new int[] {-6, -8, -4, 1, -1};
        sorted1 = new int[]{4, 5, 6, 7, 8, 9, 10};
        sorted2 = new int[]{-9, -8, -7, -6, -5};
    }

    @Test
    public void bubbleSortMeTest1(){
        int[] changed = jeremySort.bubbleSortMe(arr1);
        Assert.assertTrue(isSorted(changed));
    }

    @Test
    public void bubbleSortMeTest2(){
        int[] original = new int[]{-8, -6, -4, -1, 1};
        int[] changed = jeremySort.bubbleSortMe(arr2);
        int expected1 = original[0];
        int actual1 = changed[0];
        Assert.assertEquals(expected1, actual1);
        int expected2 = original[1];
        int actual2 = changed[1];
        Assert.assertEquals(expected2, actual2);
        int expected3 = original[2];
        int actual3 = changed[2];
        Assert.assertEquals(expected3, actual3);
        int expected4 = original[3];
        int actual4 = changed[3];
        Assert.assertEquals(expected4, actual4);
        int expected5 = original[4];
        int actual5 = changed[4];
        Assert.assertEquals(expected5, actual5);
    }

    @Test
    public void optimizedBubbleSortMeTest1(){
        int[] changed = jeremySort.optimizedBubbleSortMe(arr1);
        Assert.assertTrue(isSorted(changed));
    }

    @Test
    public void optimizedBubbleSortMeTest2(){
        int[] changed = jeremySort.optimizedBubbleSortMe(arr2);
        Assert.assertTrue(isSorted(changed));
    }

    @Test
    public void binarySearchMeTest1(){
        boolean expected = true;
        //boolean actual = jeremySort.binarySearch(sorted1, );
        //Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchMeTest2(){}
}
