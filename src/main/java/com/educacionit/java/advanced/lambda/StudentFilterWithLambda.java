
package com.educacionit.java.advanced.lambda;


import com.educacionit.java.advanced.beans.Student;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;


public class StudentFilterWithLambda {


    private static final Logger logger = Logger.getLogger (StudentFilterWithLambda.class);


	public StudentFilterWithLambda() {
		
		super ();
	}

	
	public static void main (String args[]) {
		
		
		// Stream
		List<Student> students = Arrays.asList (new Student("Homer Simpson", 39),
                                                new Student ("Bart Simpson", 10),
                                                new Student ("Marge Simpson", 36),
                                                new Student ("Ned Flanders", 60));

		List<String> namesByAge = students.stream ()
                .filter (p -> p.getAge() > 30)
                .map (Student::getName)
                .collect (toList ());

        logger.debug ("Stream : " + namesByAge);
    }
}