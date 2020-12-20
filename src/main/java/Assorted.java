public class Assorted {
//    Jay's Mock Whiteboard
//    Given: an array of numbers
//    Task: add up the sums of all possible sub arrays
//    Example: {1, 2, 3, 4}
//	+1
//            +1+2
//            +1+2+3
//            +1+2+3+4
//            +2
//            +2+3
//            +2+3+4
//            +3
//            +3+4
//            +4
//            =50
    public int addEmAll(int[] input){
        int sum = 0;
//        for (int i=0; i<input.length; i++){
//            for (int j=0; j<input.length; j++){
//                if (i != j){
//                    sum += (input[i] + input[j]);
//                }
//            }
//        }
        // not what was asked ^^


//        for (int i=0; i<input.length; i++){
//            for (int j=i; j<input.length; j++){
//                if (i != j){
//                    sum += (input[i] + input[j]);
//                }
//            }
//        }
//        for (int i=input.length-2; i>=0; i--){ //-2 , not -1, bc you have already added 1, 2, 3, 4, the 1st time.
//            for (int j=i; j>=0; j--){
//                if (i != j){
//                    sum += (input[i] + input[j]);
//                }
//            }
//        }
        // this doesn't quite work either ^^


        //Think about checking for string[] palindrome situation

        return sum;
    }
}
