import java.io.*;
import java.util.*;

class Factors {
  private static ArrayList <Integer> factors = new ArrayList<Integer>();

  public static void main(String[] args) {

    factors = factor(5);
    System.out.println(factors.toString());
    checkIfPrimeOrCompositeNumber(factors.size());
  }

  public static ArrayList<Integer> factor(int number){
    ArrayList <Integer> f = new ArrayList<Integer>();
    if(number==0){
      f.add(0);
      return f;
    }
    else{
      for(int i = 1; i<=number; i++){
        if(number%i==0){
          f.add(i);
        }
      }

    }
    return f; //to do
  }

  public static void checkIfPrimeOrCompositeNumber(int size){
    if(size > 2){
      System.out.println("Its, a Composite number");
    }
    else{
      System.out.println("Its, a Prime number");
    }
  }
}
