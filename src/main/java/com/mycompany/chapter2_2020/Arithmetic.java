
package com.mycompany.chapter2_2020;

//Class Declaration 
public class Arithmetic {

    //Main Method
    public static void main(String[] args) {
     
        //Declare and initialise three integer 
        //variables for our calculations
        int num=100; int factor=20; int sum=0;
        
        //Perform addition and subtraction 
        //operations - displaying each result
        sum=num+factor; // 120 = 100+20
        System.out.println("Result add: "+sum);
                
        sum=num-factor; // 80  = 100-20
        System.out.println("Result sub: "+sum);
       
        //Perform multiplication and division 
        //operations - displaying each result
        sum=num*factor; // 2000 = 100*20
        System.out.println("Result mul: "+sum);
                
        sum=num/factor; // 5  = 100/20
        System.out.println("Result div: "+sum);
 
        //Perform modulus operator  
        //operations - displaying each result
        sum=num%factor; // 0 = 100%20
        System.out.println("Result modulus: "+sum);
        
        //num=100
        num++;  // num=101
        System.out.println("Num after increment: "+num);
        
        //sum=0
        sum--;   //sum=-1
        System.out.println("Sum after decrement: "+sum);
        
        
        
        
        
        
        
    } //end main 
    
} //end class
