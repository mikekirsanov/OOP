import models.TablesRepository;
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
        TablesRepository tablesRepository = new TablesRepository();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tablesRepository, bookingView);
        bookingPresenter.updateTablesView();
        bookingView.reservationTable(new Date(), 2, "Станислав");
        bookingView.changeReservationTable(1001, new Date(), 4, "Станислав");
    }

}
