import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Lambda Expression with comparator
class Employee{
    int empId = 0;
    String empName = null;

    Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public String toString(){
        return empName;
    }
}
public class LambdaExpression9 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(25,"Mansi"));
        al.add(new Employee(15, "Tanvi"));
        al.add(new Employee(22,"Disha"));

        System.out.println(al);
        Collections.sort(al,(obj1,obj2)->{
            return (obj1.toString().compareTo(obj2.toString()));
        });

        System.out.println(al);
    }
}
