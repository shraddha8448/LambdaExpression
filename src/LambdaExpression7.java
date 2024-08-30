// Lambda Expressions with block of code
interface MathsOpration{
    int oprates(int a, int b);
}

public class LambdaExpression7 {
    public static void main(String[] args) {

        MathOperations add =(a,b)->{
            int ret = a +b;
            return ret;
        };

        MathOperations sub = (a,b)->{
            int ret =a-b;
            return ret;
        };

        System.out.println(add.operation(2,6));
        System.out.println(sub.operation(10,5));
    }
}
