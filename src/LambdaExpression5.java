import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

public class LambdaExpression5 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Shweta", 21),
                new Person("Rutuja", 23),
                new Person("Tejaswini", 22)
        };

        // Sort people based on age using a lambda expression
        Arrays.sort(people, (p1, p2) -> Integer.compare(p1.age, p2.age));

        // Print sorted people
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
