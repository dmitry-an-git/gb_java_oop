import employees.*;

public class MainClass {

    public static void main(String[] args) {

        int size = 10; 
        EmployeeList el = new EmployeeList();

        el.populate(size);
    
        el.sort("name");
        el.printList();

        el.sort("surname");
        el.printList();

        el.sort("salary");
        el.printList();

        el.sort("age");
        el.printList();

        el.sort("wrongname");
        
    }

}








