
package com.educacionit.java.advanced.lambda;


import java.util.List;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;


public class ConstructorMethodReference {


    private static final Logger logger = Logger.getLogger (ConstructorMethodReference.class);
	
	
	public ConstructorMethodReference () {
		
		super ();
	}

	
	private static void copyElements (final List<Integer> list,
									  final Supplier<Collection<Integer>> targetCollection) {

        Collection<Integer> l = targetCollection.get ();
        list.forEach (l::add);

		logger.debug ("foreach:: " + l);
    }
	
	
	public static void main (String args[]) {
        
		
		final List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
		// Method Reference
        copyElements (list, ArrayList::new);
        
        // Lambda expression
        copyElements (list, () -> new ArrayList ());
    }
}