/*
 * @(#OptionalFeatureTest.java 04/19/2018
 * Copyright 2018 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */

package com.educacionit.java.advanced.optionals;


// Packages and classes to import of jdk 1.8
import java.util.Optional;

// Packages and classes to import of log4j.
import com.educacionit.java.advanced.beans.Computer;
import org.apache.log4j.Logger;

// Packages and classes to import of junit 5.x
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Packages and classes to import of apache commons.
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;



public class OptionalFeatureTest {


    // Logger object.
    private static final Logger logger = Logger.getLogger (OptionalFeatureTest.class);


    // Public constructor declarations.
    /**
     *
     *  <p>Unique constructor with arguments.
     * */
    public OptionalFeatureTest() {

        // Call to super class.
        super ();
    }


    // Public instance method declarations.
    /**
     *
     *  <p>Method that test the is present method of Optional class.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Using isPresent Method. [Check]")
    public void isPresentCheckTest () {

        // Create a optional object.
        Optional<String> empty = Optional.empty ();

        // Check the test.
        Assertions.assertFalse (empty.isPresent (), "Optional is not present.");
    }

    /**
     *
     *  <p>Method that test the is present method of Optional class.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Using isPresent Method. [Value]")
    public void isPresentValueTest () {

        // Create a optional object.
        Optional<String> opt = Optional.of (randomAlphanumeric (10));

        // Check the test.
        opt.ifPresent ( name -> Assertions.assertFalse (name.isEmpty (), "Optional value is not present."));
    }

    /**
     *
     *  <p>Method that test if the value is present.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Checking String Value.")
    public void usingStringValueTest () {

        // Create a optional object.
        String name = randomAlphanumeric (10);
        Optional<String> opt = Optional.of (name);

        // Check the test.
        Assertions.assertEquals (String.format ("Optional[%s]", name), opt.toString(),
                "Optional String and String value are different.");
    }

    /**
     *
     *  <p>Method that test the ofNullable method of Optional class.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Checking Nullable Value. [OK]")
    public void usingNullableOKTest () {

        // Create a optional object.
        String name = null;
        Optional<String> opt = Optional.ofNullable (name);

        // Check the test.
        Assertions.assertEquals (String.format ("Optional.empty"), opt.toString(),
                "Optional String value is not null.");
    }

    /**
     *
     *  <p>Method that test the ofNullable method of Optional class.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Checking Nullable Value. [KO]")
    public void usingNullableKOTest () {

        // Create a optional object.
        String name = null;

        // Check the test.
        Assertions.assertThrows (NullPointerException.class, ()-> {

            Optional<String> opt = Optional.of (name);
            opt.toString();
        });
    }

    /**
     *
     *  <p>Method that test the default value.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Checking Default Value.")
    public void usingDefaultValue () {

        // Create a optional object.
        String name = null;
        Optional<String> opt = Optional.ofNullable (name);

        // Get the value.
        String value = opt.orElse (randomAlphanumeric (10));
System.out.println(value);
        // Check the test.
        Assertions.assertNotNull (value,"Optional value is not null.");
    }

    /**
     *
     *  <p>Method that test the default value.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Checking Default Value Again.")
    public void usingDefaultValueAganin () {

        // Create a optional object.
        String name = null;
        Optional<String> opt = Optional.ofNullable (name);

        // Get the value.
        String value = opt.orElseGet ( () -> randomAlphanumeric (10));

        // Check the test.
        Assertions.assertNotNull (value,"Optional value is not null.");
    }

    /**
     *
     *  <p>Method that check the exception values.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Checking Exception Value.")
    public void usingExceptionTest () {

        // Create a optional object.
        String name = null;

        // Check the test.
        Assertions.assertThrows (IllegalArgumentException.class,
                ()-> Optional.ofNullable (name).orElseThrow (IllegalArgumentException::new));
    }

    /**
     *
     *  <p>Method that use a filter for test a value.
     *
     *  @see Test
     *  @see DisplayName
     *  @throws Exception
     * */
    @Test
    @DisplayName ("Using Filters. [isPresent]")
    public void usingFiltersIsPresentTest () {

        // Create a model object.
        Computer computer = new Computer (100);

        // Check the test
        Assertions.assertTrue (Optional.ofNullable (computer)
                .map (Computer::getPrice)
                .filter (p -> p >= 100)
                .filter (p -> p <= 200)
                .isPresent(), "There is a computer with price 100 USD.");
    }
}