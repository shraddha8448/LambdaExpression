// Runnable with annonymous Inner Class and
// Runnable With Lambda Expression

public class LambdaExpression8 {
    public static void main(String[] args) {

        // Runnable With Annonymous Inner Class
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(obj1);
        t1.start();

        Thread t2 = new Thread(obj2);
        t2.start();

        // Runnable With Lambda Expression
        Runnable obj3 = ()->{
            System.out.println(Thread.currentThread().getName());
        };

        Thread t3 = new Thread(obj3);
        t3.start();
    }
}
