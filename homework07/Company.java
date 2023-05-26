
import java.util.List;
import java.util.Random;

import publisher.Publisher;
import vacancy.*;

public class Company {

    private Random random;
    private String nameCompany;
    private Publisher jobAgency;
    private List<? extends MktPosition> slots;


    public Company(String nameCompany, Publisher jobAgency, Mkt jobMarket) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
        this.slots = jobMarket.getJobs();
        random = new Random();

    }
    /**
     * компания выбирает должность из существующих на рынке
     * заработную плату из рыночного интервала для данной должности (рандом)
     * уровень требований к кандидату (рандом от 1 до 10)
     * упаковывает все в оффер и отправляет в агентство
     */

    public void needEmployee(){
        int randomIndex = random.nextInt(slots.size());
        MktPosition slot = slots.get(randomIndex);
        int skill = random.nextInt(1,11);
        double salary = random.nextDouble(slot.minSalary, slot.maxSalary);
        Vacancy vacancy = new Vacancy(nameCompany, slot, salary, skill);
        jobAgency.sendOffer(vacancy);
    }
}
