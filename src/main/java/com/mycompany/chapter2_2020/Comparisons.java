
package com.mycompany.chapter2_2020;


public class Comparisons {

 
    public static void main(String[] args) {
     
        //Declare and initialise two String variables
        String txt = "Super ";   String lang ="Java";
        
        //initialise a boolean variable to store the 
        //result of the comparison for equality 
        //and inequality
        boolean state = (txt == lang);   // false 
        //Output the result of equality comparison
        System.out.println("Result of Equality: "+state);
        
        //check for inequality
        state = (txt != lang);   // true
        System.out.println("Result of Inequality: "+state); 
        
        /**  Use less than and greater than operators with numbers **/
        
        final int DOZEN = 12;
        final int SCORE = 20; 
        state = (DOZEN > SCORE);    //false 
        System.out.println("Dozen>Score: "+state);
        
        state = (DOZEN<SCORE);  //true 
        System.out.println("Score<Dozen: "+state);
        
        
        
    } //end main 
    
} //end class
