package ap_qap1_timeclass;

public class TestTime {

    public static void main(String[] args) {
        // Initializes two Time instances
        Time time1 = new Time(0, 0, 0);
        Time time2 = new Time(0, 0, 0);

        // Sets the hour, minute, and second for times 1 & 2
        time1.setTime(21, 10, 15);
        time2.setTime(10, 20, 25);

        // Invokes the nextSecond() and previousSecond() methods on times 1 & 2
        // respectively
        time1.nextSecond();
        time2.previousSecond();

        // Displays the time in the hh:mm:ss format using the toString() method
        System.out.println();
        System.out.printf("Time 1 Final Time: %s\n", time1.toString());
        System.out.printf("Time 2 Final Time: %s\n", time2.toString());
        System.out.println();

    }

}
