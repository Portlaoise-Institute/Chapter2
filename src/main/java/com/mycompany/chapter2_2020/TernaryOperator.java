package com.mycompany.chapter2_2020;

public class TernaryOperator {
  
    public static void main(String[] args) {
        //Declare and initialise 
        //two integer variables
        int num1 = 1357; //  1357/2 = 678 remainder is 1 
        int num2 = 2468;  // 2468/2 = 1234 remainder 0 
        
        //store test result
        String result=""; 
        
        //Determine whether the first integer
        //value 1357 is an odd or even number
        //       (1357 %2 !=0)-> ( 1 !=0 )-> true
        result = (num1 % 2 !=0) ? "Odd" : "Even";
        System.out.println(num1 + " is " + result);
        
        //Determine whether the second integer
        //value is an odd or even number
        result = (num2 % 2 !=0) ? "Odd" : "Even";
        System.out.println(num2 + " is " + result);                
                
    } //end main 
} //end class 
