package comparators;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import employees.Employee;

public class SortedTable {
    private Map<String,ComparatorBase> methods;
    private String[] keys;
    private ComparatorBase[] comparators; 

    {
        keys = new String[]{"name", "surname", "salary", "age"};
        comparators = new ComparatorBase[]{
            new ComparatorName(), 
            new ComparatorSurname(),
            new ComparatorSalary(),
            new ComparatorAge()
        };

        methods = new HashMap<>(); // may be better to make it static
        for (int i = 0; i < comparators.length; i++) {
            methods.put(keys[i],comparators[i]);
        }
    }

            
    public void table(Employee[] emp, String key) {

        if (methods.containsKey(key)) {
            ComparatorBase comparator = methods.get(key);
            System.out.printf("\n*** Массив сотрудников отсортирован %s ***\n\n", comparator.description);
            Arrays.sort(emp, comparator);

            // for (Employee employee : emp){
            //     System.out.println(employee);
            // }
        } else {
            System.out.printf("\n*** Неверный параметр сортировки: %s ***\n\n",key);
        }

    }
}
