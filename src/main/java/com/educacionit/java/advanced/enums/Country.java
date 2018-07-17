
package com.educacionit.java.advanced.enums;


public enum Country {

    Argentina ("AR"),
    Venezuela ("VZLA"),
    Colombia ("CO"),
    Uruguay ("UY");


    private String code;


    Country (String code) {

        this.code = code;
    }

    public String code () {

        return code;
    }
}