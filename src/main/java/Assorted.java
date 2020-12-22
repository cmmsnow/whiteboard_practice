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
     */
    //------------------------------------------------------------------------------------------------------------------
//    public int[] createOccurenceCounterArray(int[] input){  // original approach eh
//        int[] answer = new int[input.length];
//        for (int i=0; i<input.length; i++){
//            int counter = 1;
//            for (int j=0; j<input.length; j++){
//                if (i != j){
//                    if (input[i] == input[j]){
//                        counter++;
//                    }
//                }
//            }
//            answer[i] = counter;
//        }
//        return answer;
//    }

//    public int getNumOfDupesFromOccurrenceCounter(int[] input){
//        int counter = 0;
//        for (int i=0; i<input.length; i++){
//            counter += (input[i] - 1);
//        }
//        return counter;
//    }

//    public boolean isInArray(int inputNum, int[] inputArr){
//        int counter = 0;
//        System.out.println(inputArr);
//        for (int i=0; i<inputArr.length; i++){
//            if ((inputArr[i] == inputNum)) counter++;  //  wont work because array elements are not initialized, I believe
//        }
//        if (counter > 0) return true;
//        return false;
//    }

    //------------------------------------------------------------------------------------------------------------------
    public int getNumOfExtraTimesElemOccurs(int index, int[] input){
        int counter = 0;
        for (int i=0; i<input.length; i++){
            if ((index != i) && (input[index] == input[i])) counter++;
        }
        return counter;
    }

    public int getNumOfOccurrencesInArray(int[] input){
        int counter = 0;
        for (int i=0; i<input.length; i++){
            counter += getNumOfExtraTimesElemOccurs(i, input);
        }
        return counter;
    }

    public int[] removeDuplicates(int[] input){  // still working on this
        int numOfDupes = getNumOfOccurrencesInArray(input);
        int[] answer = new int[input.length - numOfDupes];
        int k=0;
        for (int i=0; i<input.length; i++){
            boolean alreadyInThere = false;
            for (int j=i; j>=0; j--){
                if (answer[j] == input[i]) alreadyInThere = true;
            }
            if (!alreadyInThere){
                answer[k] = input[i];
                k++;
            }
        }
        return answer;
    }
    //------------------------------------------------------------------------------------------------------------------

    //char[] charArray = new char[]{'a', 'c', 'b', 'a', 'c', 'd', 'x'};  // Peter O's answer for similar problem
//    public static void main(String args[] ) {
//        char[] newCharArr = removeDuplies(charArray);
//        for(char c : newCharArr) {
//            System.out.println(String.valueOf(c));
//        }
//    }
    public char[] removeDuplies(char[] arr) {
        boolean[] flags = new boolean[128];
        char[] newArr = new char[1];
        for(char c : arr) {
            if(checkMap(c, flags)) {
                newArr = addChar(newArr, c);
            }
        }
        return newArr;
    }
    public boolean checkMap(char aChar, boolean[] flags) {
        if(flags[aChar] == false) {
            flags[aChar] = true;
            return true;
        } else {
            return false;
        }
    }
    public char[] addChar(char[] arr, char aChar) {
        char[] returnArray = new char[arr.length+1];
        for(int i = 0; i < arr.length; i++) {
            returnArray[i] = arr[i];
        }
        returnArray[returnArray.length-1] = aChar;
        return returnArray;
    }

//----------------------------------------------------------------------------------------------------------------------
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
