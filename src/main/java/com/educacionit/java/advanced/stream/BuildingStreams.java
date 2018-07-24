
package com.educacionit.java.advanced.stream;


import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.*;
import java.nio.charset.Charset;
import java.nio.file.*;


public class BuildingStreams {


    public static void main (String...args) throws Exception{
        
        // Stream.of
        Stream<String> stream = Stream.of ("Java 8", "Lambdas", "Functional", "Stream");
        stream.map (String::toUpperCase).forEach (System.out::println);
        System.out.println ("*******************************************************************");
        System.out.println ();

        // Stream.empty
        Stream<String> emptyStream = Stream.empty ();

        // Arrays.stream
        int[] numbers = {2, 3, 5, 7, 11, 13};
        System.out.println (Arrays.stream (numbers).sum ());
        System.out.println ("*******************************************************************");
        System.out.println ();

        // Stream.iterate
        Stream.iterate(0, n -> n + 2)
              .limit(10)
              .forEach(System.out::println);
        System.out.println ("*******************************************************************");
        System.out.println ();

        // Random stream of doubles with Stream.generate
        Stream.generate(Math::random)
              .limit(10)
              .forEach(System.out::println);
        System.out.println ("*******************************************************************");
        System.out.println ();

         long uniqueWords = Files.lines (Paths.get (System.getProperty ("user.dir").concat("/data/data.txt")), Charset.defaultCharset())
                                 .flatMap (line -> Arrays.stream (line.split(" ")))
                                 .distinct ()
                                 .count ();

         System.out.println ("There are " + uniqueWords + " unique words in data.txt");
         System.out.println ("*******************************************************************");
         System.out.println ();
    }
}
