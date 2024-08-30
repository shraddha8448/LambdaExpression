// Lambda Expressions with parameters

@FunctionalInterface
interface MathOperations{
    int operation(int a, int b);
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        // Lambda Expressions
        MathOperations addition = (a, b)-> (int) a + b;
        MathOperations multiplication = (a,b)-> a*b;
        MathOperations division = (a,b) -> a/b;
        MathOperations substraction = (a,b)-> a-b;

        System.out.println("Addition: " + addition.operation(5, 3));
        System.out.println("Multiplication: " + multiplication.operation(5, 3));
        System.out.println("Division: " + division.operation(5, 3));
        System.out.println("Substraction: " + substraction.operation(5, 3));

    }
}
