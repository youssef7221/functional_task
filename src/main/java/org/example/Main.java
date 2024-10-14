package org.example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {

        // Assigning Function to variables
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        System.out.println(add.apply(3, 50));


        //Function as Arguments
        Consumer<String> sendWelcomeMail = mail -> System.out.println("MAILING " + mail);
        register("Youssef", sendWelcomeMail);


        //Function as a return type
        Function<Integer, Integer> multiplyBy5 = multiplyBy(5);
        System.out.println(multiplyBy5.apply(10));
    }




    public static void register(String name, Consumer<String> callback) {

        String email = name + "@gmail.com";
        callback.accept(email);
    }



    public static Function<Integer, Integer> multiplyBy(int x) {return y -> x * y;}
}