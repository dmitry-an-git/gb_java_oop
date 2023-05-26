package ru.geekbrains.lesson7.observer.observer;

import ru.geekbrains.lesson7.observer.vacancy.*;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(String companyName, double salary);

    Integer getSkill();

    String getName();

    MktPosition getWantedPosition();
}
