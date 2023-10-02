package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(52.0, 25.0, true, 20.0);
        System.out.println(getRoomInfo(room));
        decreaseTemperatureAndPrintInfo(room);
        decreaseTemperatureAndPrintInfo(room);
        decreaseTemperatureAndPrintInfo(room);
        decreaseTemperatureAndPrintInfo(room);
        decreaseTemperatureAndPrintInfo(room);
        decreaseTemperatureAndPrintInfo(room);
    }

    private static void decreaseTemperatureAndPrintInfo(Room room) {
        System.out.println("*************************");

        if (!room.hasAirConditioner()) {
            System.out.println("Brak klimatyzatora w pomieszczeniu, nie ma możliwość obniżenia temperatury.");
            return;
        }

        double temperatureBeforeDecrease = room.getCurrentTemperature();

        if (room.decreaseTemperature()) {
            System.out.println("Udało się obniżyć temperaturę z " + temperatureBeforeDecrease +
                    " stopni do " + room.getCurrentTemperature() + " stopni");
        } else {
            System.out.println("Temperatura pomieszczenia przed próbą jej obniżenia była już równa dolnemu limitowi, " +
                    "\nnie została więc obniżona i wynosi nadal " + room.getCurrentTemperature() + ".");
        }
    }

    private static String getRoomInfo(Room room) {
        String airConditioningInfo;
        if (room.hasAirConditioner()) {
            airConditioningInfo = "posiada klimatyzator";
        } else {
            airConditioningInfo = "nie posiada klimatyzatora";
        }

        return "Pokój ma " + room.getArea() + "m^2, " + airConditioningInfo +
                ". Aktualna temperatura to " + room.getCurrentTemperature() +
                ". Dolny limit temperatury to " + room.getTemperatureLowerLimit() + " stopni.";
    }
}
