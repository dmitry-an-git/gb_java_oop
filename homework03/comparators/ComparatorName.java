package comparators;

import employees.Employee;

public class ComparatorName extends ComparatorBase {

    {
        description = "по имени";
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0){
            res = Double.compare( o2.calculateSalary(), o1.calculateSalary());
        }
        return res;
    }
}


