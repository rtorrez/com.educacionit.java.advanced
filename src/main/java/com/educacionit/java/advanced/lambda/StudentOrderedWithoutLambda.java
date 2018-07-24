
package com.educacionit.java.advanced.lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import com.educacionit.java.advanced.beans.Student;


public class StudentOrderedWithoutLambda {


    private static final Logger logger = Logger.getLogger (StudentOrderedWithoutLambda.class);


	public StudentOrderedWithoutLambda() {
		
		super ();
	}

	
	public static void main (String args[]) {
		
		
		// Stream
		List<Student> students = Arrays.asList (new Student("Homer Simpson", 39),
                                                new Student ("Bart Simpson", 10),
                                                new Student ("Marge Simpson", 36),
                                                new Student ("Ned Flanders", 60));

		// forEach equivalent
		List<Student> filteredStudent = new ArrayList<> ();
		students.forEach (p -> {
		
			if (p.getAge() > 30) {
		        filteredStudent.add (p);
		    }
		});
		
		Collections.sort (filteredStudent, (a, b) -> b.getAge ().compareTo (a.getAge ()));
		List<String> namesSortedByAgeForEach = new ArrayList<> ();
		filteredStudent.forEach (p -> namesSortedByAgeForEach.add (p.getName ()));
        logger.debug ("forEach : " + namesSortedByAgeForEach);
    }
}