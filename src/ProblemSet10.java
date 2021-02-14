import java.lang.String;
import java.util.Arrays;
public class ProblemSet10 {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 2, 5};
       // int end = 20;
        System.out.println(Arrays.toString(fix45(numbers)));
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
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
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
    }

    public static int[] fix34(int[] numbers) {
   //////////////////////////////////////////////
    int threeCount = 0;
    int fourCount = 0;
    for(int i = 0; i < numbers.length; i++){
        if(numbers[i] == 3){
            threeCount ++;
        } else if(numbers[i] == 4){
            fourCount ++;
        } }
    //////////////////////////////////////////////
        boolean fourFirst = false;
    for(int j = 0; j < numbers.length; j++) {
        if (numbers[j] == 3) {
            break;
        }
        if (numbers[j] == 4) {
            fourFirst = true;
        }
    }
    //////////////////////////////////////////////
    boolean consecutive = false;
    boolean end = false;
    for(int k = 0; k < numbers.length-1; k++){
        if(numbers[k] == 3 && numbers[k+1] == 4){
            consecutive = true;
            break; } }

    if(numbers[numbers.length-1] == 3){
                end = true; }
    //////////////////////////////////////////////
        if(numbers == null || threeCount != fourCount || fourFirst == true || consecutive == true || end == true){
            return null; }
    //////////////////////////////////////////////
    int[] arr = new int[numbers.length];
    int arrIndex = 0;
    for(int l = 0; l < numbers.length; l++){
        if(numbers[l] != 3 && numbers[l] != 4){
          arr[arrIndex] = numbers[l];
          arrIndex ++;
        } else if(numbers[l] == 3){
            arr[arrIndex] = numbers[l];
            arr[arrIndex+1] = 4;
            arrIndex = arrIndex + 2;
        } }
        return arr;
    }

    public static int[] fix45(int[] numbers) {
    //////////////////////////////////////////////////
        int fourCount = 0;
        int fiveCount = 0;
        int otherCount = 0;
    for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 4){
                fourCount ++;
            } else if(numbers[i] == 5){
                fiveCount ++;
            }else{
                otherCount ++;
            }  }
    //////////////////////////////////////////////////
        boolean consecutive = false;
    for(int k = 0; k < numbers.length-1; k++){
            if(numbers[k] == 4 && numbers[k+1] == 4){
                consecutive = true;
                break; } }
    //////////////////////////////////////////////////
    if(numbers == null || fiveCount != fourCount || consecutive == true){
            return null; }
    //////////////////////////////////////////////////
    int[] arr = new int[numbers.length];
    int[] others = new int[otherCount];
    int otherIndex = 0;
    for(int i = 0; i < numbers.length; i++){
        if (numbers[i] != 4 && numbers[i] != 5){
            others[otherIndex] = numbers[i];
            otherIndex ++;
        }}

    for(int j = 0; j < numbers.length; j++){
        if (numbers[j] == 4){
            arr[j] = 4;
            arr[j+1] = 5; }}

    int newIndex = 0;
    for(int k = 0; k < numbers.length; k++){
        if (arr[k] == 0){
        arr[k] = others[newIndex];
        newIndex ++;
        }
    }

    return arr;
    /*Plan:
    *Rules, all numbers except 4's can move
    * 5 must be moved after 4
    * Make an array that is same length as numbers
    * array with all numbers that aren't fours or fives
    * In the new array, send fours to their original indexes and put a 5 directly after
    * Cycle through new array, in empty indexes, insert the next number
    * */
    }
/*
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