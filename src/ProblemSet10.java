import java.lang.String;
import java.util.Arrays;
public class ProblemSet10 {

    public static void main(String[] args) {
        int[] numbers = {10, 10, 9, 9, 2};
       // int end = 20;
        System.out.println(canBalance(numbers));
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
    int otherCount = 0;
    for(int i = 0; i < numbers.length; i++){
        if(numbers[i] == 3){
            threeCount ++;
        } else if(numbers[i] == 4){
            fourCount ++;
        } else{
            otherCount ++;
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
        //////////////////////////////////////////////////
        int[] arr = new int[numbers.length];
        int[] others = new int[otherCount];
        int otherIndex = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] != 3 && numbers[i] != 4){
                others[otherIndex] = numbers[i];
                otherIndex ++;
            }}

        for(int j = 0; j < numbers.length; j++){
            if (numbers[j] == 3){
                arr[j] = 3;
                arr[j+1] = 4; }}

        int newIndex = 0;
        for(int k = 0; k < numbers.length; k++){
            if (arr[k] == 0){
                arr[k] = others[newIndex];
                newIndex ++;
            }
        }

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
    }

    public static boolean canBalance(int[] numbers) { //switch back to boolean
        if (numbers == null || numbers.length == 0) {
            return false; //switch back to false
        }

        int[] front = new int[numbers.length];      //new array front[] of same length as numbers[]
        boolean equal = false;                      //boolean that checks whether sums are equal
        int numberSum = 0;
        int frontSum = 0;                            //integers to hold sums of the two arrays


        for(int i = 0; i < numbers.length; i++){    //for loop that cycles through each index of numbers[]
        frontSum=0;
        numberSum = 0;
        front[i] = numbers[i];  //switch back to i                  //value of numbers is assigned to corresponding value in front
        numbers[i] = 0;                           //the same value in numbers is now 0 (the value has effectively swapped arrays)

        for (int j = 0; j < numbers.length; j++) {        //INSIDE THE FOR LOOP: all values of numbers[] are summed
            numberSum += numbers[j];
        }
        for (int k = 0; k < front.length; k++) {         //INSIDE THE FOR LOOP: all values of front[] are summed
            frontSum += front[k];
        }
        if (frontSum == numberSum) {                  //if the two sides add up to the same amount, equal = true,
            equal = true;
            break;                                      // and the loop ends.
        }
    }
    return equal;                               // returns the sum of numbers[] when the loop breaks

    /*Analysis:
    *Broke after first round of loop
    * Arrays switched values correctly
    * Sums should be- Front:2  Numbers: 4
    * Sums in reality- Front:4  Numbers: 4
    * */

    }
/*
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