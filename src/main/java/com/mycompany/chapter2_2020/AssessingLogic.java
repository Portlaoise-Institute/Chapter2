
package com.mycompany.chapter2_2020;


public class AssessingLogic {

 
    public static void main(String[] args) {
        
        //Declare and initialise two boolean
        //variables
        boolean yes = true;
        boolean no = false; 
        
        //Check to see if both conditions true
        boolean result = (yes && yes); //true&&true =true
        System.out.println("Result Yes&&Yes: "+result);
        
        result = (yes && no); //true&&false = false
        System.out.println("Result Yes&&No: "+result);
        
        //Check to see if either condition is true
        result = (yes || yes); // true || true = true
        System.out.println("Yes||Yes: "+result);
        
        result = (yes || no); // true || false = true
        System.out.println("Yes||No: "+result);
        
        result = (no || no); // false || false = false
        System.out.println("No||No: "+result);
        
        //Show the original value and show the inverse value
        result = yes; //true     
        System.out.println("Original: "+result);
        result = !yes; //false 
        System.out.println("Inverse: "+result);
        
        
        
        
    } // end main 
    
} //end class 
