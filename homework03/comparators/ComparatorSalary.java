package comparators;

import employees.Employee;

public class ComparatorSalary extends ComparatorBase {

    {
        description = "по доходу";
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Double.compare( o2.calculateSalary(), o1.calculateSalary());
        if (res == 0) {
            res = o1.getSurName().compareTo(o2.getSurName());
        }
        return res;
    }
}

