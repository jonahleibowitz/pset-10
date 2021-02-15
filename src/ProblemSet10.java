import java.lang.String;
import java.util.Arrays;
import java.util.ArrayList;
public class ProblemSet10 {

    public static void main(String[] args) {
        int n = 4;
       // int[] inner = {2,4,3};
        System.out.println(Arrays.toString(squareUp(n)));
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

    public static boolean canBalance(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }

        int[] front = new int[numbers.length];
        boolean equal = false;
        int numberSum = 0;
        int frontSum = 0;

        for(int i = 0; i < numbers.length; i++){
        frontSum=0;
        numberSum = 0;
        front[i] = numbers[i];
        numbers[i] = 0;

        for (int j = 0; j < numbers.length; j++) {
            numberSum += numbers[j];
        }
        for (int k = 0; k < front.length; k++) {
            frontSum += front[k];
        }
        if (frontSum == numberSum) {
            equal = true;
            break;
        }
    }
    return equal;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        boolean check = true;
   //////////////////////CHECKS///////////////////////////
    if(outer == null || outer == null || outer.length == 0 || inner.length == 0){
        return false;
    }
    for(int i = 1; i< outer.length; i++){
        if (outer[i] < outer[i-1]){
            check = false; } }
        for(int i = 1; i < inner.length; i++){
            if (inner[i] < inner[i-1]){
                check = false; } }
    //////////////////SOLUTION////////////////////////////
       // int finalJ = 0;
    for(int j = 0; j < outer.length; j++){
       // check= -1;
      //  finalJ = j;
        if(outer[j] == inner[0]){

            for(int k = 0; k < inner.length; k++){
                if(inner[k] != outer[j+k]){
                    check = false; } }
            break;
           //if(check == -2){ break;}
        }
    } return check;

    /*Plan:
    *Boolean check is set to true
    * For loop for Outer:
    *Look to see when a value matches [0] of inner
    * Once an outer value matches inner[0], check to see if the next two match,
    * Continue this search for as many values as inner has
    * If at any point, they don't match, break. check = false.
    * Otherwise, allow the loop to finish and check reamins true
    * Return check
    * */


    }

    public static int[] squareUp(int n) {
        if (n < 0) {
            return null;
        }
        ArrayList<Integer> squareList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] section = new int[n];
            int addOn = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (addOn < i + 1) {
                    section[j] = addOn + 1;
                    addOn++;
                }
            }
            for (int k : section) {
                squareList.add(k);
            }
        }

        int squared = n * n;
        int[] finalArray = new int[squared];
        for (int i = 0; i < squared; i++) {
            finalArray[i] = squareList.get(i).intValue();
        }
        return finalArray;
    }

    public static int[] seriesUp(int n) {
    if(n<0){
        return null; }

    ArrayList<Integer> series = new ArrayList<>();
    for(int i = 0; i < n; i ++){
        for(int j = 1; j < i + 2; j ++){
            series.add(j);}}

        int length = 0;
        for(int i = n; i >0 ; i--) {
            length += i;
        }

        int[] finalArray = new int[length];
        for(int i = 0; i < length; i++){
        finalArray[i] = series.get(i).intValue();
        }
        return finalArray;
    }
/*
    public static int maxMirror(int[] numbers) {
        if(numbers == null){return -1;}
        int[] front = new int[numbers.length/2];
        int[] back = new int[numbers.length/2];
        int backIndex =0;
    //////////////Making new arrays////////////////////////
        for(int i = numbers.length-1; i>(numbers.length/2)-1; i--){
            back[backIndex] = numbers[i];
            backIndex++;}

        for(int i = 0; i<(numbers.length/2); i++){
            front[i] = numbers[i];}
    ///////////////SOLUTION/////////////////////////////////////////////
        boolean match = false;
        int spanCount = 0;
        int firstMatch;
        for(int i = 0; i < front.length; i++){
            if(front[i] == back[i]){
                firstMatch = i;
                for(int j = i; j < back.length; j++){


                }
            }
            }
        }

            return spanCount;
        }*/
    /* Plan:
    * Look for all numbers that appear twice
    * Split array into half
    * Print second half into new array backwards
    * use for loop, check if two numbers have the same following numbers, carry this out
    *find difference of indexes to determine length
    * */


    public static int countClumps(int[] numbers) {
        if(numbers == null){return -1;}
        int clumpCount = 0;
        int currentI = 0;
    for(int i = 1; i < numbers.length; i++){
        if(numbers[i] == numbers[i-1]){
        clumpCount ++;
        } }
        for (int j = 2; j < numbers.length; j++)
            if(numbers[j] == numbers[j-2] && numbers[j] == numbers[j-1]){
                clumpCount--;
            }
        return clumpCount;
    }


}