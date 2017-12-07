import java.io.*;
import java.util.*;

class Factors {

  public static void main(String[] args) {

    ArrayList <Integer> factors = new ArrayList<Integer>();

    factors = factor(225);
    System.out.println(factors.toString());
    checkIfPrimeOrCompositeNumber(factors.size());

    factors = factor(17);
    System.out.println(factors.toString());
    checkIfPrimeOrCompositeNumber(factors.size());

    factors = factor(12);
    System.out.println(factors.toString());
    checkIfPrimeOrCompositeNumber(factors.size());

    factors = factor(3/2);
    System.out.println(factors.toString());
    checkIfPrimeOrCompositeNumber(factors.size());

  }

  public static ArrayList<Integer> factor(int number){

    ArrayList <Integer> f = new ArrayList<Integer>();

    if(number==0){
      return f;
    }else{
      for(int i = 1; i<=number; i++){
        if(number%i==0){
          f.add(i);
        } //end of if statement
      } //end of for loop
    }//end of else
    return f;
  }

  public static void checkIfPrimeOrCompositeNumber(int size){

    if(size > 2){
      System.out.println("Its, a Composite number");
    }else if(size==2){
      System.out.println("Its, Neither");
    }else{
      System.out.println("Its, Neither");
    }
  }

}
