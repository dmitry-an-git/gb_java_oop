package presenters;

import models.Table;

import java.util.Collection;

public interface View {

    /**
     * Отобразить список всех столиков
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    void showReservationResult(int reservationNo, int tableNo);

    /**
     * новая функуция для отражения результатов перебукинга
     * @param reservationNo
     */
    void showUpdatedReservationResult(int newReservationNo, int tableNo);

    /**
     * новая функция для отражения статуса бронирования
     * @param reservationNo
     * @param table
     * @param name
     * @param date
    */
    void showReservationStatus(int reservationNo, int table, String name, String date);

    /**
     * действие пользователя - запрос статуса существущей брони
     * @param observer
     */
    void reservationStatusRequest(int reservationNo);

    /**
     * Установить нового наблюдателя
     * @param observer наблюдатель (презентер)
     */
    void setObserver(ViewObserver observer);



}
