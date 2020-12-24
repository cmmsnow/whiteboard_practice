import java.util.HashMap;

public class Assorted {
//----------------------------------------------------------------------------------------------------------------------
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
//----------------------------------------------------------------------------------------------------------------------
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
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Given an int array, return an array with duplicates removed
     */

    public int[] removeDuplicates(int[] input){
        int[] answerArr = new int[]{input[0]};
        for (int i=1; i<input.length; i++){
            if (!isPresent(input[i], answerArr)){                 //check if element already in answer array
                answerArr = addIntToArray(input[i], answerArr);   //if not, add it
            }
        }
        return answerArr;
    }

    public int[] addIntToArray(int element, int[] array){
        int[] answer = new int[array.length+1];
        for (int i=0; i<array.length; i++){
            answer[i] = array[i];
        }
        answer[answer.length-1] = element;
        return answer;
    }

    public boolean isPresent(int value, int[] input){
        for (int i=0; i<input.length; i++){
            if (input[i] == value) return true;
        }
        return false;
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
//----------------------------------------------------------------------------------------------------------------------
/**
 * Check if 2 strings are permutations of each other.
 * (Example:  "listen" and "silent"  <-- would return true)
 */

    public String sortString(String input){
        char[] stringArr = input.toCharArray();
        for (int i=0; i<stringArr.length-1; i++){
            boolean swapped = false;
            for (int j=0; j<stringArr.length-1-i; j++){
                if (stringArr[j] > stringArr[j+1]){
                    char temp = stringArr[j];
                    stringArr[j] = stringArr[j+1];
                    stringArr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        String sorted = "";
        for (char c : stringArr){
            sorted += c;
        }
        return sorted;
    }

    public boolean arePermutations(String input1, String input2){
        if (input1.length() != input2.length()){
            return false;
        } else {
            if (sortString(input1).equals(sortString(input2))) return true;
        }
        return false;
    }
}
