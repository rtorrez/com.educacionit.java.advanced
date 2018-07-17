
package com.educacionit.java.advanced.enums;


public enum Status {

    HIGH {

        @Override
        public String asLowerCase () {

            return HIGH.toString ().toLowerCase ();
        }
    },

    MEDIUM {

        @Override
        public String asLowerCase () {

            return MEDIUM.toString().toLowerCase ();
        }
    },

    LOW {

        @Override
        public String asLowerCase () {

            return LOW.toString().toLowerCase ();
        }
    };

    public abstract String asLowerCase ();
}