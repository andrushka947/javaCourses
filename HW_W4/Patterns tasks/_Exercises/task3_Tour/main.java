package _Exercises.task3_Tour;

public class main {
    public static void main(String[] args) {

        Tour tour = Tour.buildTour().
                setFlightFrom(true).
                setFlightTo(true).
                setTransferFromAirport(false).
                setTransferToAirport(true).
                setHostelBooking(false).
                setInsurance(true).
                build();
        System.out.println(tour);

    }
}
