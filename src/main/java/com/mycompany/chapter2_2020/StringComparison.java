package com.mycompany.chapter2_2020;

public class StringComparison {

    public static void main(String[] args) {
    
        //Declare and initialise 
        //two String objects
        String emp1 = "Fred Smith";
        String emp2 = "fred smith";
                     
        //Check the contents of 
        //the two strings are the same 
        if (emp1.equalsIgnoreCase(emp2))
        {
            System.out.println("The same");
        }
        else
        {
            System.out.println("Not the same");
        } //end if 
        
        
    } //end main 
    
} //end class 
