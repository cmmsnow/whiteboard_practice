import java.util.HashMap;

public class Assorted {
/**
 * AddEmAll:    Jay's Mock Whiteboard
 *              Given: an array of numbers
 *              Task: add up the sums of all possible sub arrays
 *              Example: {1, 2, 3, 4}
 * 	            +1
 *              +1+2
 *              +1+2+3
 *              +1+2+3+4
 *              +2
 *              +2+3
 *              +2+3+4
 *              +3
 *              +3+4
 *              +4
 *              =50
 */
    public int addEmAll(int[] input){
        int sum = 0, temp = 0;
        /**
         * this works:
         */
        for (int i=0; i<input.length; i++){
            temp = 0;
            for (int j=i; j<input.length; j++){
                temp += input[j];
                sum += temp;
            }
        }

        /**
         * Shu's answer. This works & makes most sense:
         */
//        for (int i = 0; i < input.length ; i++) {
//            for(int j= 0; j<input.length; j++){
//                for(int k=i;k<=j; k++){
//                    sum += input[k];
//                }
//            }
//        }

        /**
         * this works but I don't understand why:
         */
//        for (int i=0; i<input.length; i++) {
//            sum += (input[i] * (i + 1) * (input.length - i));
//        }

        return sum;
    }

    /**
     * Given: String with only alphabetic characters
     * Return: highest character
     * Input: xyzx
     * Output: z
     */
    public char findHighestChar(String str){
        char answer = str.charAt(0);
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) > answer) answer = str.charAt(i);
        }

//        char[] strArr = str.toCharArray();  //another option that works
//        for (int i=0; i<strArr.length; i++){
//            if (strArr[i] > answer) answer = strArr[i];
//        }

        return answer;
    }

    /**
     * Given an int array, return an array with duplicates removed
     *
     * public int[] removeDuplicates(int[] array){  SHU'S ANSWER
     * //{1,1,2, ,5,3, 5}
     * int count = 0;
     * for(int i=0; i< array.length; i++){ //1
     * for(int j=0; j< array.length; j++){
     * if((array[i] == array[j]) && (i != j)){
     * count++;
     * }
     * }
     * int [] result = new int [array.length- count];
     * int k = 0;
     * for(int i=0; i< result.length; i++){
     * for(int j=0; j< array.length; j++){
     * if(array[i] != array [j]){
     * result [k] = array[i];
     * k++;
     * }
     * } return result;
     * }
     */
    public int[] createOccurenceCounterArray(int[] input){
        int[] answer = new int[input.length];
        for (int i=0; i<input.length; i++){
            int counter = 1;
            for (int j=0; j<input.length; j++){
                if (i != j){
                    if (input[i] == input[j]){
                        counter++;
                    }
                }
            }
            answer[i] = counter;
        }
        return answer;
    }

    public int getNumOfDupesFromOccurrenceCounter(int[] input){
        int counter = 0;
        for (int i=0; i<input.length; i++){
            counter += (input[i] - 1);
        }
        return counter;
    }

    public boolean isDuplicate(int inputNum, int[] inputArr){
        int counter = 0;
        for (int i=0; i<inputArr.length; i++){
            if (inputArr[i] == inputNum) counter++;
        }
        if (counter > 1) return true;
        return false;
    }

//    public int[] removeDuplicates(int[] input){  // still working on this
//        int[] dupeCountAr = createOccurenceCounterArray(input);
//        int numOfDupes = getNumOfDupesFromOccurrenceCounter(dupeCountAr);
//        int[] answer = new int[input.length - numOfDupes];
//        for (int i=0; i<input.length; i++){
//            if (dupeCountAr[i] )
//        }
//    }


//    public int[] removeDuplicates(int[] array) {  // Shu's 1st answer // does not work
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if ((array[i] == array[j]) && (i != j)) count++;
//            }
//        }
//        int[] result = new int[array.length - count];
//        int k = 0;
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] != array[j]) {
//                    result[k] = array[i];
//                    k++;
//                }
//            }
//        }
//        return result;


    public int[] removeDuplicatesByShu(int[] array) {  // Shu's 2nd answer -- this removes dupes AND sorts the array
            HashMap<Integer, Integer> countNumbers = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (countNumbers.containsKey(array[i])){
                countNumbers.put(array[i], countNumbers.get(array[i]+1));
            } else {
                countNumbers.put(array[i], 1);
            }
        }
        int[] result = new int[countNumbers.size()];
        int j =0;
        for (Integer i: countNumbers.keySet()) {
            result[j] = i;
            j++;
        }
        return result;
    }

}
