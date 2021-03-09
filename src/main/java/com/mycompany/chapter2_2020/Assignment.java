
package com.mycompany.chapter2_2020;


public class Assignment {

   
    public static void main(String[] args) {
       
        //Declare and initialise two string variables
        String txt = "Super ";
        String lang = "Java";
        
        
        //Add and assign a String value 
        //Display the concatenated String results
        //txt = "Super " + "Java"  --> "Super Java" 
        txt += lang;  // txt = txt + lang 
        System.out.println(txt);
        
        
        
        //Declare and initialise 2 integer variables
        int sum = 10;   int  num = 20; 
        
        //Add and assign an int value
        //Display the result 
        //sum = sum+num
        sum += num;   // 30 = 10+20 
        System.out.println(sum);
        
        
        
        
    } //end main 
    
} //end class
