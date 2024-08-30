
//Lambda Expression using Collection
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class LambdaExpression4 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Shreya","Diksha","Ritu","Dipali","Shravani");

        nameList.sort((name1,name2)->Integer.compare(name1.length(),name2.length()));

        nameList.forEach(System.out::println);
    }
}
