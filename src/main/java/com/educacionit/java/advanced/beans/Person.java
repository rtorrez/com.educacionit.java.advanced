/*
 * @(#Person.java 05/10/2017
 * Copyright 2015 Byte21, Inc. All rights reserved.
 * byte21/CONFIDENTIAL
 * */

package com.educacionit.java.advanced.beans;


// Packages and classes to import of apache commons.
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;


public class Person {
 
    
    // Private instance fields declarations.
    // Person name.
    private String name = "";
    
    // Person age.
    private int age = 0;
 
    
    // Public constructor declarations.
    /*
     * Constructor without parameters.
     **/
    public Person () {
        
        // Call to super class.
        super ();
    }
 
    /*
     * Constructor with parameters.
     *
     * @param name Person name.
     * @param age Person age.
     **/
    public Person (String name, int age) {
        
        // Call to super class.
        super ();
 
        // Set the internal values.
        this.name = name;
        this.age = age;
    }

    
    // Public instance method declarations.
    /**
     * 
     *  <p>Method that return the person name.
     * 
     *  @return The person name.
     */
    public String getName () {
        
        // Return the value.
        return this.name;
    }

    /**
     * 
     *  <p>Method that set the person name.
     * 
     *  @param name The person name.
     */
    public void setName (String name) {
        
        // Set the value.
        this.name = name;
    }

    /**
     * 
     *  <p>Method that return the person age.
     * 
     *  @return The person age.
     */
    public int getAge () {
        
        // Return the value.
        return this.age;
    }

    /**
     * 
     *  <p>Method that set the person name.
     * 
     *  @param age The person name.
     */
    public void setAge (int age) {
        
        // Set the value.
        this.age = age;
    }
    
    
    // Public instance method declarations extended of java.lang.Object
    /* (non-Javadoc)
     * @see java.lang.Object#equals (java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        
        // Return my implementations.
        if (!(obj instanceof Person)) {
            return false;
        }
      
        if (this == obj) {
            return true;
        }
        
        final Person otherObject = (Person) obj;

        return new EqualsBuilder ()
              .append (this.age, otherObject.getAge ())
              .append (this.name, otherObject.getName ())
              .isEquals ();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode ()
     */
    @Override
    public int hashCode () {
        
        // Return my implementation.
        return new HashCodeBuilder ()
                   .append (this.age)
                   .append(this.name)
                   .toHashCode ();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
        
        // Return my implementation.
        return new ToStringBuilder(this)
                   .append ("Age", this.age)
                   .append ("Name", this.name)
                   .toString ();
    }
    
    
    // Public static methods declarations.
    /**
     * <p>Method that compare two object by name and age
     * 
     * @param p1 Person 1.
     * @param p2 Person 2.
     * @return Result compare.
     */
    public static int compareByNameThenAge (Person p1, Person p2) {
        
        // Compare to by names and age.
        if (p1.getName ().equals (p2.getName ())) {
            return p1.getAge () - p2.getAge ();
        } else {
            return p1.getName ().compareTo (p2.getName ());
        }
    }
}