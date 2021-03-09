
package com.mycompany.chapter2_2020;


public class EscapingLiterals {

  
    public static void main(String[] args) {
        
        // Build a string variable
        // Contain a formatted table
        //title and column headings 
        
        String header = "\n\tNEW YORK 3-DAY FORECAST\n";
        header +="\n\tDay\t\tHigh\tLow\tConditions\n";
        header +="\t---\t\t----\t---\t----------\n";
        
        //String containing
        //formatted table cell data 
        //four column table 
        String forecast ="\tSunday\t\t68F\t48F\tSunny\n";
        forecast += "\tMonday\t\t71F\t57F\tSunny\n";
        forecast += "\tTuesday\t\t71F\t50F\tCloudy\n";
        
        
        //Output the forecast
        System.out.print(header+forecast);
        
        
    } //end main 
    
} //end class
