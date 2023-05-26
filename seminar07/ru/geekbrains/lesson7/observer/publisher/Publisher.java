package ru.geekbrains.lesson7.observer.publisher;

import ru.geekbrains.lesson7.observer.observer.Observer;
import ru.geekbrains.lesson7.observer.vacancy.Vacancy;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(Vacancy vacancy);

}
