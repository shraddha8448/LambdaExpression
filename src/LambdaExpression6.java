// Lambda Expression on Runnable Interface

public class LambdaExpression6 {

    public static void main(String[] args) {

        System.out.println("Before creating Thread :" + Thread.currentThread().getName());
        // Lambda expression implementing Runnable
        Runnable runnable = () ->{
            System.out.println("My Thread : "+ Thread.currentThread().getName());
            System.out.println("Running in a thread!");
            System.out.println(Thread.currentThread().getName() + " Ended...");
        } ;
        // Creating and starting a new thread with the lambda expression
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName() + " Ended...");
    }
}
