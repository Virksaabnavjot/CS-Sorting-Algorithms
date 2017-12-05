import java.io.*;
import java.util.*;

public class RecursionAndIterationExample{

  public static void main(String[] args) {

    System.out.println("Answer: "+iterativeFactorialUsingForLoop(6));

    System.out.println("Answer: "+iterativeFactorialUsingWhileLoop(4));

    System.out.println("Answer: "+recursiveFactorial(56));

  }//main method

  public static long recursiveFactorial(int number){

    if(number == 1){
      return 1;
    }else{
      //System.out.println(number * recursiveFactorial(number-1));
      return (number * recursiveFactorial(number-1));

    }


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
 }//iterative method - for loop

  public static int iterativeFactorialUsingWhileLoop(int number){

    int factorial = 1;
    int stepCount = 0;
    int n = number;

    System.out.println("Factorial of: "+number+ "!");
    int i = 1;
    while(i <= number){
      factorial = factorial * n;
      stepCount++;
      i++;
      System.out.println("Step: "+(stepCount)+" ---> "+factorial+ " = " +factorial+ " * " +(n-1)+"!");
    }//end of while loop

    return factorial;

  }//iterative method - while loop

}//end of class
