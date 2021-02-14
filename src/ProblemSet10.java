import java.lang.String;
import java.util.Arrays;
public class ProblemSet10 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1, 7, 1, 3, 1};
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
    }

    public static int maxSpan(int[] numbers) {
        int span;
        int max = 0;
        if(numbers == null){
            return -1;
        } else if (numbers.length == 0){
            span = 0;
        } else if (numbers.length == 1){
            span = 1;
        } else {
            int currSpan = 0;
            for (int i = 0; i < numbers.length; i++) {  //for loop that addresses each value in numbers[]
                for (int j = i; j < numbers.length; j++) { // loop that starts at the current value in numbers[]
                    if (numbers[i] == numbers[j]) { // if j matches i, the span becomes distance between
                        currSpan = j - i + 1;
                    }
                }
                if (currSpan > max) {
                    max = currSpan;
                }
            }
            span = max;
        }
        return span;
    /*Plan:
    * Make variable for longest length set to 0
    * For loop for each value from its index to end of the array:
    * if values match, its span becomes difference between the two indexes
    * At the end of loop for the variable, the longest span becomes its final span
    * if this span is longer than the official span, it becomes the new official
    * At the end, longest span is returned
    * */
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