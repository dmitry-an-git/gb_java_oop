package employees;
public abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surName;
    protected double salary;
    protected int age; 
    protected String description;

    public Employee(String name, String surName, double salary) {
        this(name, surName, salary, 0);
    }

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-15s %10.2f     %-10s", name+" "+surName, description, salary, ageToString(age));
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.calculateSalary(), calculateSalary());
    }

    public String ageToString(int age){
        switch (age%10) {
            case 1:
                return String.format("%d год", age);
            case 2:
            case 3:
            case 4:
                return String.format("%d года", age);
            case 5:
            case 6:
            case 7: 
            case 8:              
            case 9:              
            case 0:
                return String.format("%d лет", age);
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDescription() {
        return description;
    }
    
}