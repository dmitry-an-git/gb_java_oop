package employees;
/**
 * TODO: 1. Доработать самостоятельно в рамках домашней работы
 */

class Freelancer extends Employee{

    private double hours; // per month
    private double wage;  // per hour
    
    {
        description = "фрилансер";
    }

    public Freelancer(String name, String surName, double hours, double wage) {
        super(name, surName, hours*wage);
    }

    public Freelancer(String name, String surName, double hours, double wage, int age) {
        super(name, surName, hours*wage, age);
    }

    @Override
    public double calculateSalary() {
        return hours*wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
        calculateSalary(); // we need to update it after changing wage
    }

    public void setHours(double hours) {
        this.hours = hours;
        calculateSalary(); // we need to update it after changing hours 
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.calculateSalary(), calculateSalary());
    }
}
