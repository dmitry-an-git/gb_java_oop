package presenters;

import models.Reservation;
import models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;
    private Collection<Table> tables;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Загрузить список всех столиков
     */
    public void loadTables(){
        if (tables == null){
            tables = model.loadTables();
        }
    }

    /**
     * Отобразить список столиков
     */
    public void updateView(){
        view.showTables(tables);
    }

    /**
     * Отобразить результат бронирования столика
     * @param reservationNo номер брони
     */
    private void updateReservationStatusView(int reservationNo, int tableNo){
        view.showReservationResult(reservationNo, tableNo);
    }

    /**
     * Отобразить результат внесения изменений в бронирование
     * @param newReservationNo
     */
    private void updateChangeReservationStatusView(int newReservationNo, int tableNo){
        view.showUpdatedReservationResult(newReservationNo, tableNo);
    }

    /**
     * Показать данные по конкретной брони
     * @param reservationNo
     * @param table
     * @param name
     * @param date
     */
    private void updateReservationStatusRequestView(int reservationNo, int table, String name, String date){
        view.showReservationStatus(reservationNo,table,date,name);
    }

    /**
     * Получили уведомление о попытке бронирования столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(orderDate, tableNo, name);
        updateReservationStatusView(reservationNo, tableNo);
    }

    /**
     * Получили уведомление об изменении бронирования столика
     * @param oldReservation номер существующей брони
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int newReservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateChangeReservationStatusView(newReservationNo, tableNo);
    }
    
    /**
     * Получили сведения о запросе статуса брони
     * @param reservationNo номер существующей брони
     */
    @Override
    public void onReservationStatusRequest(int reservationNo){
        Reservation found = model.getReservationStatus(reservationNo);
        if (found == null){
            updateChangeReservationStatusView(-2, 0); // reusing old code
        } else {
            String date = found.getDate().toString();
            String name = found.getName();
            int table = found.getTable(); // !!!!
            updateReservationStatusRequestView(reservationNo, table, date, name);
        }
        //tellReservationStatusView(int reservationNo, Date reservationDate, int tableNo, String name);
    };
}
