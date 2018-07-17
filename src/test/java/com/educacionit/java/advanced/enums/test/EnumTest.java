
package com.educacionit.java.advanced.enums.test;


import java.util.*;

import org.apache.log4j.Logger;

import org.junit.Test;

import static  org.junit.Assert.*;

import com.educacionit.java.advanced.enums.*;


public class EnumTest {


    private static final Logger logger = Logger.getLogger (EnumTest.class);


    @Test
    public void testEnumSet () {

        EnumSet<Country> enumSet = EnumSet.of (Country.Argentina,
                                               Country.Colombia,
                                               Country.Uruguay,
                                               Country.Venezuela);

        assertFalse (enumSet.isEmpty ());

        enumSet.forEach ( e -> logger.debug (String.format ("%s [%s]", e.toString (), e.code ())));
    }

    @Test
    public void testEnumMap () {

        EnumMap<Country, String> enumMap = new EnumMap<> (Country.class);
        enumMap.put (Country.Argentina, "Buenos Aires");
        enumMap.put (Country.Colombia   , "Bogota");
        enumMap.put (Country.Uruguay, "Montevideo");
        enumMap.put (Country.Venezuela, "Caracas");

        assertFalse (enumMap.isEmpty ());
        enumMap.entrySet ().forEach ( e -> logger.debug (String.format ("%s [%s]", e.getKey ().toString (),
                e.getValue ())));
    }

    @Test
    public void testEnumValues () {

        for (Status status : Status.values () ) {

            logger.debug (status.toString ());
            assertNotNull (status);
        }
    }
}