package employees;
class Worker extends Employee{

    {
        description = "в штате";
    }

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

}