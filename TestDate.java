package ap_qap1_dateclass;

public class TestDate {

    public static void main(String[] args) {
        // Intializes a Date instance
        Date testDate = new Date(5, 8, 1997);

        // Displays the date in the dd/mm/yyyy format using the toString() method
        System.out.println();
        System.out.printf("Created Date Object: %s\n", testDate.toString());
        System.out.println();
    }
}
