package ru.geekbrains.lesson7.observer.observerparam;

import java.util.Random;

import ru.geekbrains.lesson7.observer.observer.Observer;
import ru.geekbrains.lesson7.observer.vacancy.MktPosition;

public class Candidate<T extends MktPosition> implements Observer {
    private String name;
    private double salary;
    private Integer skill;
    private T wantedPosition;
    private Random random;

    /**
     * конструктор без указания желаемой ЗП (она берется рандомно из рыночного интервала)
     * @param name
     * @param wantedPosition
     * @param skill
     */
    public Candidate(String name, T wantedPosition, Integer skill) {
        this.name = name;
        this.skill = skill;
        this.wantedPosition = wantedPosition;
        random = new Random();
        this.salary = random.nextDouble(wantedPosition.minSalary,wantedPosition.maxSalary);
    }
    /**
     * конструктор с указанием желаемой ЗП вручную
     * @param name
     * @param wantedPosition
     * @param salary
     * @param skill
     */
    public Candidate(String name, T wantedPosition, Integer salary, Integer skill) {
        this.name = name;
        this.wantedPosition = wantedPosition;
        this.salary = salary;
        this.skill = skill;
    }

    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("\t\t%s >>> Мне нужна эта работа! [%s - %.2f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("\t\t%s >>> Я найду работу получше! [%s - %.2f]\n", name, companyName, salary);
        }
    }

    public Integer getSkill() {
        return skill;
    }

    public String getName() {
        return name;
    }
    
    public MktPosition getWantedPosition() {
        return wantedPosition;
    }

}
