package testenum3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 */
class TrainSchedule {
    private Train[] trains;

    TrainSchedule() {
        trains = new Train[0];
    }

    void addTrain() {
        System.out.println("Set the train schedule in the next format: ");
        System.out.println("NUMBER,DEPARTURE-ARRIVAL,DEPARTURE TIME-ARRIVAL TIME");


        // read new train info from keyboard
        Scanner sc = new Scanner(System.in);
        String trainString = sc.next();

        StringTokenizer st = new StringTokenizer(trainString, ",");


        // set trains O&D and time values
        Train newTrain = new Train(Integer.parseInt(st.nextToken()));
        newTrain.setStationDispatch(st.nextToken());
        newTrain.setStationArrival(st.nextToken());
        newTrain.setTimeDispatch(st.nextToken());
        newTrain.setTimeArrival(st.nextToken());


        // read days, add to array, set to train
        DayOfWeek[] inputDays = new DayOfWeek[0];

        int count = st.countTokens();

        for (int i = 0; i < count; i++) {
            String token = st.nextToken();

            for (DayOfWeek dayOfWeek : DayOfWeek.values()) {

                if (DayOfWeek.valueOf(token.toUpperCase()) == dayOfWeek) {
                    DayOfWeek[] tempDays = Arrays.copyOf(inputDays, inputDays.length + 1);
                    tempDays[tempDays.length - 1] = dayOfWeek;
                    inputDays = tempDays;
                }
            }
        }

        newTrain.setDays(inputDays);


        // extend train array + add new element
        Train[] tempTrains = Arrays.copyOf(trains, trains.length + 1);
        tempTrains[tempTrains.length - 1] = newTrain;

        trains = tempTrains;
    }

    void printTrains() {
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }


    void searchTrain(String stationDispatch, String stationArrival, DayOfWeek day){
        for (Train train : trains) {
            if (train.stationArrival.equals(stationArrival)) {
                for (DayOfWeek dayOfWeek : train.days) {
                    if(dayOfWeek.ordinal()>day.ordinal()){
                        System.out.println(train.toString());
                        break;
                    }
                }
            }
        }
    }

    class Train {
        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private DayOfWeek[] days;

        Train(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Train number " + number + "\n" +
                    "Origin '" + stationDispatch + '\'' +
                    ", Destination '" + stationArrival + '\'' + "\n" +
                    "departure at '" + timeDispatch + '\'' +
                    ", arrive at '" + timeArrival + '\'' + "\n" +
                    "on days: " + Arrays.toString(days);
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        void setDays(DayOfWeek[] days) {
            this.days = days;
        }

    }
}
