package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name, tableNo);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Некорректный номер столика");
    }
    /**
     * DONE: Разработать самостоятельно
     * Поменять бронь столика
     * @param oldReservation номер старого резерва (для снятия)
     * @param reservationDate дата резерва столика
     * @param tableNo номер столика
     * @param name Имя
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        // first find old reservation
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    // second check if we can do new reservation and actually do it
                    int ans = reservationTable(reservationDate, tableNo,name);
                    if (ans > 0){ // if ok, delete 
                        table.getReservations().remove(reservation);
                    }
                    return ans; // so -1 if wrong new table (old reserve still in place), or # of a new reserve
                }
            }
        }
        return -2; // no such old reservation exists
    }

    /**
     * Получить данные по существующему бронированию
     * @param oldReservation номер существующего резерва
     */

    public Reservation getReservationStatus(int reservationNo){
        
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationNo) {
                    return reservation;
                }    
            }
        }
        return null;
    }

}
