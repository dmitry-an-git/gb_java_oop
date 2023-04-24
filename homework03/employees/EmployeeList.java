package employees;

import comparators.SortedTable;

public class EmployeeList {
    
    
    public Employee[] lst; //its better to do it as a linked list. but lets adhere to the original 
    public EmployeeGenerator eg;
    public SortedTable st;

    {
        eg = new EmployeeGenerator();
        st = new SortedTable();
    }

    public void populate(int size){
        this.lst = eg.getArray(size);
    }

    public void printList(){
        for (Employee employee : lst) {
            System.out.println(employee);
        }
    }

    public Employee[] getLst() {
        return lst;
    }

    public void sort(String criteria) {
        this.st.table(this.getLst(), criteria);
    }


}
