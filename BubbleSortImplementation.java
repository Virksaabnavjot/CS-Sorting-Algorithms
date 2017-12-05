import java.io.*;
import java.util.*;

class BubbleSortImplementation {

  public static void print(String output){
    System.out.println(output);
  }//print method

  public static void main(String[] args) {
    int []numbers = {7,4,6,10,2,5,3};
    //expected result = 2,3,4,5,6,7,10
    bubbleSort(numbers);

    print(Arrays.toString(numbers));
  }//main method

  public static void bubbleSort(int []numbers){

    int n;
    n = numbers.length-2;

    Boolean swapped = true;

    while(swapped){
      swapped = false;
      int temp = 0;
      for(int i=0; i <= n; i++){
        if(numbers[i] > numbers[i+1]){
          temp = numbers[i];
          numbers[i] = numbers[i+1];
          numbers[i+1] = temp;

          swapped = true;

        }//if statement
      }//for loop

    }//while loop

  }//bubble sort
}//the end
