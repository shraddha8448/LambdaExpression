// Simple example of Lambda Expressions

@FunctionalInterface  // interface having only one abstract method
interface Demo1{
    void demo1Info();
}
public class LambdaExpession1 {
    public static void main(String[] args) {
        Demo1 obj = ()-> System.out.println("Demo1 class Info...");
        obj.demo1Info();
    }
}
