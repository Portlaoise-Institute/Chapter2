
package com.mycompany.chapter2_2020;


public class OperatorPrecedence {

  
    public static void main(String[] args) {
       
        //Evaluate an expression using 
        //the default operator precedence
        //Display result 
        // 16x2=32, +24 = 56 
        int sum = 32 - 8 + 16 * 2; 
        System.out.println("Default operator "
                + "precedence: "+ sum);
        
        //Evaluate the same expression
        //give addition and subtraction precedence
        //over the multiplication 
        // 24+16=40, x2 = 80 
        sum = (32 - 8 + 16) * 2;
        System.out.println("Addition/Sub Precedence: "
                +sum);
        
        //Addition precedence over the subtraction
        // then multiplication 
        //32-(24) =8, x2  = 16 
        sum = (32 - (8+16)) *2; 
        System.out.println("Addition, Sub, Mul: "+sum);
        
    } //end main 
    
} //end class
