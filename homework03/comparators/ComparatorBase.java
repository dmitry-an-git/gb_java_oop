package comparators;

import java.util.Comparator;
import employees.Employee;

public abstract class ComparatorBase implements Comparator<Employee> {
    
    public String description;

    @Override
    public abstract int compare(Employee o1, Employee o2);

}
