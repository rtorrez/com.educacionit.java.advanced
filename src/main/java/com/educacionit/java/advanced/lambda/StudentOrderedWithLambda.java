
package com.educacionit.java.advanced.lambda;


import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import org.apache.log4j.Logger;

import com.educacionit.java.advanced.beans.Student;


public class StudentOrderedWithLambda {


    private static final Logger logger = Logger.getLogger (StudentOrderedWithLambda.class);
	
	
	public StudentOrderedWithLambda() {
		
		super ();
	}

	
	public static void main (String args[]) {
		
		
		// Stream
		List<Student> students = Arrays.asList (new Student("Homer Simpson", 39),
                                                new Student ("Bart Simpson", 10),
                                                new Student ("Marge Simpson", 36),
                                                new Student ("Ned Flanders", 60));

		List<String> namesSortedByAge = students.stream ()
                .filter (p -> p.getAge() > 30)
                .sorted (comparing (Student::getAge).reversed ())
                .map (Student::getName)
                .collect (toList ());

        logger.debug ("Stream : " + namesSortedByAge);
    }
}