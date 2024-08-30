//Lambda Expression using Collection
import java.util.Arrays;
import java.util.List;

// compareTo() : java.lang.Comparable
public class LambdaExpressions3 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(3,6,2,1,4,5,8);

        // Sort the numbers in list
        //numList.sort((a, b) -> a.compareTo(b));
        numList.sort(Integer::compareTo);        // shorthand notation for a lambda expression


        //numList.forEach(x-> System.out.println(x));
        numList.forEach(System.out::println);    // shorthand notation for a lambda expression
    }
}
