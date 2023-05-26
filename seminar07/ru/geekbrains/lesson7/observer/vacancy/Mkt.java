package ru.geekbrains.lesson7.observer.vacancy;

import java.util.ArrayList;
import java.util.List;

public class Mkt {
    
    public static List<MktPosition> jobs;

    public Mkt(){
        jobs = new ArrayList<>();
        // jobs.add(new MktCEO());
        // jobs.add(new MktMaster());
        // jobs.add(new MktTrainee());
    }

    public List<MktPosition> getJobs() {
        return jobs;
    }

    public void addPosition(MktPosition position){
        jobs.add(position);
    }
}
