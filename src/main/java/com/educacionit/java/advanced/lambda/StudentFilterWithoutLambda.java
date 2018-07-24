
package com.educacionit.java.advanced.lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.educacionit.java.advanced.beans.Student;


public class StudentFilterWithoutLambda {


    private static final Logger logger = Logger.getLogger (StudentFilterWithoutLambda.class);


	public StudentFilterWithoutLambda () {
		
		super ();
	}

	
	public static void main (String args[]) {
		
		
		// Stream
		List<Student> students = Arrays.asList (new Student("Homer Simpson", 39),
                                                new Student ("Bart Simpson", 10),
                                                new Student ("Marge Simpson", 36),
                                                new Student ("Ned Flanders", 60));

		// forEach equivalent
		List<String> filteredStudent = new ArrayList<> ();
		students.forEach (p -> {
		
			if (p.getAge() > 30) {
		        filteredStudent.add (p.getName ());
		    }
		});
        logger.debug ("Stream : " + filteredStudent);
    }
}