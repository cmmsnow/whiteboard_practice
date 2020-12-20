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
         * this works - don't fully get it:
         */
        for (int i=0; i<input.length; i++){
            temp = 0;
            for (int j=i; j<input.length; j++){
                temp += input[j];
                sum += temp;
            }
        }

        /**
         * Shu's answer. This works & I get it:
         */
//        for (int i = 0; i < input.length ; i++) {
//            for(int j= 0; j<input.length; j++){
//                for(int k=i;k<=j; k++){
//                    sum += input[k];
//                }
//            }
//        }

        /**
         * this works but I dont get it at all:
         */
//        for (int i=0; i<input.length; i++) {
//            sum += (input[i] * (i + 1) * (input.length - i));
//        }

        return sum;
    }
}
