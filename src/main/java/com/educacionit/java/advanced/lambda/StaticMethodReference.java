
package com.educacionit.java.advanced.lambda;


import java.util.List;
import java.util.Arrays;

import org.apache.log4j.Logger;


public class StaticMethodReference {


    private static final Logger logger = Logger.getLogger (StaticMethodReference.class);
	
	
	public StaticMethodReference () {
		
		super ();
	}
	
	
	public static void main (String args[]) {
		
		
        List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Method reference
        list.forEach (StaticMethodReference::print);
        
        // Lambda expression
        list.forEach (number -> StaticMethodReference.print (number));
        
        // Normal
        for (int number: list) {
           
        	StaticMethodReference.print (number);
        }
    }
	
    public static void print (final int number) {
    
    	logger.debug ("I am printing: " + number);
    }
}