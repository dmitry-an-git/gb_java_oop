package comparators;

import employees.Employee;

public class ComparatorSurname extends ComparatorBase{

    {
        description = "по фамилии";
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        int res = o1.getSurName().compareTo(o2.getSurName());
        if (res == 0){
            res = Double.compare( o2.calculateSalary(), o1.calculateSalary());
        }
        return res;
    }
}


