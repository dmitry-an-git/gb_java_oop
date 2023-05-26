package observer;

import mkt.MktMaster;
import mkt.MktPosition;

public class Master implements Observer {
    
    private String name;
    private double salary;
    private Integer skill;
    private MktPosition wantedPosition;


    public Master(String name, Integer skill) {
        this.name = name;
        this.skill = skill;
        salary = 80000;
        wantedPosition = new MktMaster();
     
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("\t\t%s >>> Мне нужна эта работа! [%s - %.2f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("\t\t%s >>> Я найду работу получше! [%s - %.2f]\n", name, companyName, salary);
        }
    }

    @Override
    public Integer getSkill() {
        return skill;
    }

    public String getName() {
        return name;
    }

    @Override
    public MktPosition getWantedPosition() {
        return wantedPosition;
    }
}
