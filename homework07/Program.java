
import observer.*;
import observerparam.Candidate;
import publisher.*;
import vacancy.*;

public class Program {

    /**
     * TODO: Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * @param args
     */
    public static void main(String[] args) {

        // here we define a universe of job positions 
        // each instance contains a title and range of salaries
        MktCEO mktCEO = new MktCEO(); 
        MktMaster mktMaster = new MktMaster();
        MktTrainee mktTrainee = new MktTrainee();
        Mkt jobMarket = new Mkt(); // just a list with an imprint of current job market
        jobMarket.addPosition(mktCEO);
        jobMarket.addPosition(mktMaster);
        jobMarket.addPosition(mktTrainee);

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency, jobMarket);
        Company google = new Company("Google", jobAgency, jobMarket);
        Company yandex = new Company("Yandex", jobAgency, jobMarket);

        Master ivanov = new Master("Ivanov", 5); // the second parameter is the skill level
        Master sidorov = new Master("Sidorov", 4);
        Student petrov = new Student("Petrov", 6);
        CEO smirnov = new CEO("Smirnov", 5);
        Candidate<MktTrainee> andreev = new Candidate<>("Andreev", mktTrainee, 10000, 5); //parametrized

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(smirnov);
        jobAgency.registerObserver(andreev); //but works here as well, as it uses the same interface

        for (int i = 0; i < 5; i++){
            System.out.printf("Step %d\n",i+1);
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();

        }
        
    }

}
