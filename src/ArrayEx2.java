import java.util.Scanner;
import java.util.Arrays;


public class ArrayEx2 {
    public static void main(String[] args) {
       /*
        //1. print a String in reverse
        String word = "WELCOME";
        char [] stringChar = word.toCharArray();
        for(int i = 6 ; i >= 0; i--){
            System.out.print(stringChar[i]);
        }



        //2.find the length of an input string
        String words = "This is a string";
        // convert the string to char
        char [] charWords = words.toCharArray();
        //declare a counter
        int count = 0;
        //loop through the array and increment count for each letter
        for(int i = 0; i < charWords.length; i++){
             count++;
        }
        System.out.println("The length of the string is: " + count);



       //3. Ask the user input 10 values - check for duplicates
        Scanner key = new Scanner(System.in);
        //create the array to be filled by the user
        int [] numInput = new int[10];

        //loop through the array to fill in the values in the array
        for (int i = 0; i < 10; i++ ){
            System.out.println("Please enter number " + (i + 1) + ":");
            int input = key.nextInt();
            numInput[i] = input;
        }

        //loop through the array and compare the values
        System.out.println("The array elements without the duplicates are:");
        for (int i = 0; i < 10; i++ ) { //outer loop
            for (int j = i + 1; j < 10; j++) {//inner loop
                if (numInput[i] == numInput[j]) {
                    numInput[i] = 0;
                } //end-if
            }//end - inner loop
            if (numInput[i] != 0) {
                System.out.print(numInput[i] + " ");
            }
        }//end - otter loop



       //4. program that will print out all pairs from arrays 1 and 2 that gives a sum of 13
        int array1 [] = new int[]{1,7,6,5,9};
        int array2 [] = new int[]{2,7,6,3,4};

        int sum = 0;
        for (int i = 0; i < 5; i++) { //outer
            for (int j = i; j < 5; j++) { //inner
                if ((array1[i] + array2[j] == 13)) {

                    System.out.println("(" + array1[i] + "," + array2[j] + ")");

                } //end if
            }//end inner
        }//end outer


        */

       //5.user to enter 10 values. Output the total number of odd and even values in the array.










    }//en main method
} //end main class
