package ap_qap1_dateclass;

public class Date {
    // Initializes the instance variables for the Date class
    int day;
    int month;
    int year;

    // Parameterized constructor that initializes day, month, and year
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter methods for the instance variables of the Date class
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    // Setter methods for the instance variables of the Date class
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns a string representation of the Date instance
    public String toString() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }

}
