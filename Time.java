package ap_qap1_timeclass;

public class Time {
    // Initializes the instance variables for the Time class
    int hour;
    int minute;
    int second;

    // Default parameterized constructor that initializes the hour, minute, and
    // second
    public Time(int hour, int minute, int second) {
        hour = this.hour;
        minute = this.minute;
        second = this.second;
    }

    // Getter methods for the instance variables of the Time class
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    // Setter methods for the instance variables of the Time class
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Returns a string representation of the Time instance
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // Increments the time by 1 second
    public Time nextSecond() {
        // Increments the second by 1
        second++;

        // Adds a minute if the second is 60 and sets the seconds to 0
        if (second == 60) {
            second = 0;
            minute += 1;
            // Adds an hour if the minute is 60 and sets the minutes to 0
            if (minute == 60) {
                minute = 0;
                hour++;
                // Sets the hour to 0 if the hour is 24
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Decrements the time by 1 second
    public Time previousSecond() {
        // Decrements the second by 1
        second--;

        // Subtracts a minute if the second is -1 and sets the second to 59
        if (second == -1) {
            second = 59;
            minute -= 1;
            // Subtracts an hour if the minute is -1 and sets the minute to 59
            if (minute == -1) {
                minute = 59;
                hour--;
                // Sets the hour to 23 if the hour is -1
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

}
