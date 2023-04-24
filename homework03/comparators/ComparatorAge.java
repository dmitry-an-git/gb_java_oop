package comparators;

import employees.Employee;

public class ComparatorAge extends ComparatorBase{
    
    {
        description = "по возрасту";
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare( o2.getAge(), o1.getAge());
    }
}
