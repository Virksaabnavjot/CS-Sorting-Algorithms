import java.io.*;
import java.util.*;

public class RecursionAndIterationExample{

  public static void main(String[] args) {

    System.out.println("Answer: "+iterativeFactorialUsingForLoop(6));

  }//main method

  public static void recursiveFactorial(int number){

  }//recursive method/function

  public static int iterativeFactorialUsingForLoop(int number){
    int factorial = 1; //Since, 0! = 1

    System.out.println("Factorial of: "+number+ "!");
      int stepCount = 0;
      for(int i = number; i > 0; i--){
        factorial = factorial * i;
        stepCount++;
        System.out.println("Step: "+(stepCount)+" ---> "+factorial+ " = " +factorial+ " * " +(i-1)+"!");
      }//for loop


   return factorial;
  }//iterative method

}//end of class
