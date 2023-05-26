package publisher;

import observer.Observer;
import vacancy.*;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(Message vacancy);

}
