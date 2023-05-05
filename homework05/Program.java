

import models.Table;
import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        
        bookingPresenter.loadTables();
        bookingPresenter.updateView();
        System.out.println();
        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationStatusRequest(1001);
        bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
        bookingView.reservationStatusRequest(1002);
        System.out.println();
        System.out.println("Проверка перебронирования по старому номеру и несуществующему столику:");
        bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
        bookingView.changeReservationTable(1002, new Date(), 20, "Станислав");
        bookingView.reservationStatusRequest(1002);


    }

}
