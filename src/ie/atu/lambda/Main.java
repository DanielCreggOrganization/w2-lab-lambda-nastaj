package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Traditional way using an anonymous class
          // Using a lambda expression
          Runnable task = () -> System.out.println("Thread is running");
        
          Thread thread = new Thread(task);
          thread.start();

          Runnable secondTask = () -> System.out.println("Hello from the thread");
          secondTask.run();

        // Define a lambda to reverse a string. Function<String, String> defines a function that takes a String as input and returns a String as output
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();

        // Define a lambda to convert a string to uppercase
        Function<String, String> toUpperCase = s -> s.toUpperCase();

        // Combine lambdas
        Function<String, String> combinedOperation = reverse.andThen(toUpperCase);

        // Apply the combined operation
        System.out.println("Result: " + combinedOperation.apply("Lambda"));

        // DIY
        Function<String, String> trim = s -> s.trim();
        
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        Function<String, String> combined = trim.andThen(toLowerCase);

        System.out.println(combined.apply("     Jakub   "));
    }
}