package publisher;

import observer.Observer;
import vacancy.Vacancy;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(Vacancy vacancy);

}
