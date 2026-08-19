package HomeWork16;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class MyStepdefs {

    @Дано("в ресторане есть свободный столик на {int} человека")
    public void creatingTable(int countPerson) {
        System.out.println(MessageFormat.format("В ресторане есть свободный столик на {0} человека"
                , countPerson));
    }

    @И("клиент хочет сделать бронь на {int} человека в {string}")
    public void bookTable(int countPerson, String timeBocking) {
        System.out.println(MessageFormat.format("Клиент хочет сделать бронь на {0} человека в {1}"
                , countPerson, timeBocking));
    }

    @Когда("клиент отправляет запрос на бронирование")
    public void sendBookingRequest() {
        System.out.println("Клиент отправляет запрос на бронирование");
    }

    @Тогда("система подтверждает успешное бронирование стола")
    public void bookingConfirmation() {
        System.out.println("Система подтверждает успешное бронирование стола");
    }

    @Дано("в ресторане нет свободных столиков для бронирования")
    public void noCreatingTable() {
        System.out.println("В ресторане нет свободных столиков для бронирования");
    }

    @Тогда("система отказывает в бронировании")
    public void bookingRefusal() {
        System.out.println("Система отказывает в бронировании");
    }

    @Дано("у клиента уже есть успешно забронированный столик на {int} человека в {string}")
    public void creatingTableReservation(int countPerson, String timeBocking) {
        System.out.println(MessageFormat.format
                ("у клиента уже есть успешно забронированный столик на {0} человека в {1}"
                        , countPerson, timeBocking));
    }

    @Когда("клиент отправляет запрос на отмену бронирования")
    public void bookingCancellationRequest() {
        System.out.println("Клиент отправляет запрос на отмену бронирования");
    }

    @Тогда("система подтверждает отмену")
    public void bookingCancellationConfirmation() {
        System.out.println("Система подтверждает отмену");
    }

    @И("статус столика меняется на {string}")
    public void changingTableStatus(String statusBocking) {
        System.out.println(MessageFormat.format("Статус столика меняется на {0}", statusBocking));
    }

    @Дано("ресторан {string} открыт")
    public void restaurantOpen(String restaurantName) {
        System.out.println(MessageFormat.format("Ресторан {0} открыт", restaurantName));
    }

    @И("в ресторане есть {int} столов на {int} человека")
    public void numberTablesPeople(int countTable, int person) {
        System.out.println(MessageFormat.format("В ресторане есть {0} столов на {1} человека"
                , countTable, person));
    }

    @Когда("клиент отправляет запрос на бронирование на {int} человека в {string}")
    public void tableReservationSpecificNumberOfPeopleSpecificTime(int people, String timeReserve) {
        System.out.println(MessageFormat.format(
                "Клиент отправляет запрос на бронирование на {0} человека в {1}", people, timeReserve
        ));
    }

    @Дано("клиент уже успешно забронировал столик на {int} человека в {string}")
    public void successfulTableReservationSpecificNumberGuestsSpecificTime(int people, String timeReserve) {
        System.out.println(MessageFormat.format(
                "Клиент уже успешно забронировал столик на {0} человека в {1}", people, timeReserve
        ));
    }

    @Тогда("система выдает результат: {string}")
    public void systemOutput(String result) {
        System.out.println(MessageFormat.format("система выдает результат: {0}", result));
    }

    @И("система выдает параметры теста: количество гостей: {int} , ожидаемый ответ: {string}")
    public void extractingVariablesFromRequest(int people, String param) {
        System.out.println(MessageFormat.format(
                "Система выдает параметры теста: количество гостей: {0} , ожидаемый ответ: {1}", people, param
        ));
    }

    @Дано("в ресторане есть столики:")
    public void addingTables(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            String number = columns.get("номер");
            String numberGuests = columns.get("вместимость");

            System.out.println(MessageFormat.format("За столиком номер: {0}, помещается: {1} гостя"
                    , number, numberGuests));
        }
    }

    @И("статус столика под номером {int} меняется на {string}")
    public void changeTableStatusByNumber(int tableNumber, String statusBocking) {
        System.out.println(MessageFormat.format(
                "Статус столика под номером {0} меняется на {1}", tableNumber, statusBocking));
    }

    @И("клиент оставляет пожелание к брони:")
    public void specialRequest(String message) {
        System.out.println(MessageFormat.format(
                "Клиент оставляет пожелание к брони: {0}", message
        ));
    }

    @И("пожелание клиента сохранено в базе")
    public void specialRequestSaved() {
        System.out.println("Пожелание клиента сохранено в базе");
    }
}
