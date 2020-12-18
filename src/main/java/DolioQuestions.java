import java.util.ArrayList;


/**
 * from group whiteboard session 12/18/2020
 */

public class DolioQuestions {
    //Write a Java program to find the common elements between two arrays (string values)
    //Array1 : [Python, JAVA, PHP, C#, C++, SQL]
    //Array2 : [MySQL, SQL, SQLite, Oracle, PostgreSQL, DB2, JAVA]
    //Common element is : [JAVA, SQL]
    public ArrayList<String> findCommon(String[] arr1, String[] arr2){
        ArrayList<String> answer = new ArrayList<>();


        return answer;
    }


    //Write a Java program to find the second largest element in an array
    //Original numeric array : [10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
    //Second largest value: 2458
    public int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] >= largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[1] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    //Write code to check two Strings to see if they are anagrams or not. Return TRUE if yes, FALSE if not.


    //Write code to check if a String is palindrome or not. Return TRUE if yes, FALSE if not.
}
