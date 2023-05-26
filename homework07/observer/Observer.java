package observer;

import vacancy.*;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(String companyName, double salary);

    Integer getSkill();

    String getName();

    MktPosition getWantedPosition();
}
