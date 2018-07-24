
package com.educacionit.java.advanced.beans;


public class Computer {

    private int price;


    public Computer () {

        super ();
    }

    public Computer (int price) {

        super ();

        this.price = price;
    }


    public int getPrice () {

        return this.price;
    }

    public void setPrice (int price) {

        this.price = price;
    }
}