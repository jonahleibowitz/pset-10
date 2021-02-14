import java.lang.String;
import java.util.Arrays;
public class ProblemSet10 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 1, 3};
       // int end = 20;
        System.out.println(maxSpan(numbers));
        //(Arrays.toString(
    }

    public static String[] fizzBuzz(int start, int end) {
    if (start >= end){
        return null;
    }
    int length = end - start;
    String[] finalArray = new String[length];
    int index = 0;
    for (int i = start; i < end; i++){
        String currentValue;
        if(i%3 != 0 && i%5 != 0) {
            currentValue = String.valueOf(i);
            finalArray[index] = currentValue;
            index ++;
        }
        else if(i%3 == 0 && i%5 != 0){
            finalArray[index] = "Fizz";
            index ++;
            }
        else if(i%5 == 0 && i%3 != 0){
            finalArray[index] = "Buzz";
            index ++;
        }
        else if(i%5 == 0 && i%3 == 0){
            finalArray[index] = "FizzBuzz";
            index ++;
        } }
        return finalArray;
    /*Plan:
    * 1, 2, 3, 4, 5, 6 (length = 6) index of 1 is 0 || length- (end)
    *
    * 5, 6, 7, 8, 9, 10 (length  = 6) index of 5 is 0 ||
    * */

    }

    public static int maxSpan(int[] numbers) {

    }
/*
    public int[] fix34(int[] numbers) {

    }

    public int[] fix45(int[] numbers) {

    }

    public boolean canBalance(int[] numbers) {

    }

    public boolean linearIn(int[] outer, int[] inner) {

    }

    public int[] squareUp(int n) {

    }

    public int[] seriesUp(int n) {

    }

    public int maxMirror(int[] numbers) {

    }

    public int countClumps(int[] numbers) {

    }

 */
}