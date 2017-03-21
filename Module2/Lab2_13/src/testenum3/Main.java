package testenum3;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        TrainSchedule trainSchedule = new TrainSchedule();

        trainSchedule.addTrain(); //23,Kyiv,Lviv,14:00,15:00,Monday,friday
        trainSchedule.addTrain(); //44,Odessa,Lviv,08:00,23:00,Tuesday,Sunday
        trainSchedule.addTrain(); //2,Lviv,Kyiv,07:00,15:15,Tuesday,Saturday
        trainSchedule.addTrain(); //15,Kharkiv,Odessa,23:55,07:20,Wednesday,FRIDAY,sunday
        trainSchedule.addTrain(); //25,Lviv,Kyiv,23:20,08:20,THURSDAY,saturday

        trainSchedule.printTrains();

        System.out.println();

        System.out.println("Search train: ");
        trainSchedule.searchTrain("Lviv", "Kyiv", DayOfWeek.THURSDAY);

    }
}
