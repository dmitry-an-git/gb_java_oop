package publisher;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import vacancy.*;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(Message vacancy) {
        Double salary = vacancy.getSalary();
        String nameCompany = vacancy.getNameCompany();
        String position = vacancy.getPosition().getTitle();
        Integer skill = vacancy.getSkill();

        System.out.printf("Ищем кандидатов: %s, %s, з/п: %.2f, требования: %d\n", nameCompany, position, salary, skill);
        for (Observer observer : observers){
            if (observer.getWantedPosition().getClass() != vacancy.getPosition().getClass()) {
                System.out.printf("\t%s рассматривает другую должность, оффер не отправляем.\n", observer.getName());
            } else {

                if (observer.getSkill()<vacancy.getSkill()) {
                    System.out.printf("\t%s недостаточно квалифицирован, оффер не отправляем.\n", observer.getName());
                } else { 
                    System.out.printf("\t%s достаточно квалифицирован, оффер отправляем.\n", observer.getName());
                    observer.receiveOffer(nameCompany, salary);
                }
            }
        
        }
    }
}
