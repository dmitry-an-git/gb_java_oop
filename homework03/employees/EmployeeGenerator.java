package employees;
import java.util.Random;

public class EmployeeGenerator {
    
    private Random r;
    private String[] names; 
    private String[] surNames;

    {
        names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        r = new Random();
    }

    public Employee get(){
        if (r.nextBoolean()) {
            return getFreelancer();
        } else {
            return getWorker();
        }
    }

    public Employee getWorker(){
        double salary = r.nextInt(20, 120)*1000;
        int age = r.nextInt(18,65);
        return new Worker(names[r.nextInt(10)], surNames[r.nextInt(10)], salary, age);
    }

    public Employee getFreelancer(){
        int wage = r.nextInt(200, 300);
        int hours = r.nextInt(100, 300);
        int age = r.nextInt(18,65);
        return new Freelancer(names[r.nextInt(10)], surNames[r.nextInt(10)], hours, wage, age);
    }

    public Employee[] getArray(int size){
        Employee[] lst = new Employee[size];
        for (int i = 0; i < size; i++) {
            lst[i] = get();
        }
        return lst;
    }


        
}
