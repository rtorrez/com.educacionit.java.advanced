
package com.educacionit.java.advanced.classes;


public class E {


    private int count = 10;

    private static final int sum = 20;


    public void method () {

        final int x = 0;

        class F {

            public void otherMethod () {

                System.out.println (count);
                System.out.println (sum);
                System.out.println (x);
            }
        }

        F f = new F ();

        f.otherMethod ();
    }

    public static void main (String[] args) {

        new E ().method ();
    }
}