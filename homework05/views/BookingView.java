package views;

import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;

    /**
     * Отобразить список столиков
     * @param tables список столиков
     */
    public void showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println("\t"+table);
        }
    }

    /**
     * Отобразить результат бронирования
     * @param reservationNo номер брони
     */
    @Override
    public void showReservationResult(int reservationNo, int tableNo) {
        if (reservationNo > 0){
            System.out.printf("Столик #%d успешно забронирован. Номер брони: #%d\n", tableNo, reservationNo);
        }
        else {
            System.out.println("Ошибка бронирования столика.");
        }
    }

    /**
     * Отобразить результат перебронирования
     */
    @Override
    public void showUpdatedReservationResult(int newReservationNo, int tableNo) {
        if (newReservationNo == -2) {
            System.out.println("Неверный номер брони.");
        } else if (newReservationNo == -1) {
            System.out.println("Неверный номер нового столика. Старая бронь в силе.");
        } else {
            System.out.printf("Столик #%d успешно перебронирован. Номер брони: #%d\n", tableNo, newReservationNo);
        }
    }

    /** Отобразить статус резерва */
    @Override
    public void showReservationStatus(int reservationNo, int table, String name, String date){
        System.out.printf("Номер брони: %d, столик: %d, клиент: %s, дата: %s\n", 
                    reservationNo, 
                    table, 
                    name, 
                    date);
    };
    /**
     * Установить наблюдателя
     * @param observer наблюдатель (презентер)
     */
    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования),
     * бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку перебронирования)
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        //DONE: Обратиться к наблюдателю, указать на процедуру изменения бронирования столика
        observer.onChangeReservationTable(oldReservation,reservationDate,tableNo,name);
    }

    /**
     * Действие клиента (пользователь хочет узнать статус брони по номеру)
     * @param oldReservation идентификатор бронирования (существующий)
     */
    public void reservationStatusRequest(int reservationNo){
        observer.onReservationStatusRequest(reservationNo);
    };
}
