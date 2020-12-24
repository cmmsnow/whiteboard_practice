import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DolioQuestionsTest {
    DolioQuestions dolioQuestions;

    @Before
    public void setup(){
        dolioQuestions = new DolioQuestions();
    }

    @Test
    public void testFindCommon(){
        String[] array1 = new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        ArrayList<String> given = dolioQuestions.findCommon(array1, array2);
        Assert.assertEquals(given.get(0), "JAVA");
        Assert.assertEquals(given.get(1), "SQL");
        Assert.assertEquals(given.size(), 2);
    }

    @Test
    public void testSecondLargest1(){
        int[] array = new int[] {5, 8, 9, 3, 2, 1};
        int expected = 8;
        int actual = dolioQuestions.secondLargest(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSecondLargest2(){
        int[] array = new int[] {-5, -8, -9, -3, 2, -1};
        int expected = -1;
        int actual = dolioQuestions.secondLargest(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSecondLargest3(){
        int[] array = new int[] {-5, -8, -9, -3, -1};
        int expected = -3;
        int actual = dolioQuestions.secondLargest(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testnext1(){}

    @Test
    public void testnext2(){}
}
