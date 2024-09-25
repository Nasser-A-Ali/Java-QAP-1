package ap_qap1_accountclass;

public class Account {
    // Initializes the instance variables for the Account class
    String id;
    String name;
    double balance = 0;

    // Default parameterized constructor that only initializes the id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overloaded parameterized constructor that initializes the id, name, and
    // balance
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods for the instance variables of the Account class
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    // Setter methods that manipulate the balance of the Account instance
    public double credit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double debit(double amount) {
        if (amount <= this.balance) {
            balance -= amount;
        } else {
            // The "\u001B[31m" is an ANSI escape code that changes the text colour to red
            // The "\u001B[0m" is an ANSI escape code that resets the text color
            System.out.println("\u001B[31mAmount exceeded balance.\u001B[0m");
        }

        return this.balance;
    }

    // Transfers the specified amount from the current Account instance to another
    // specified Account instance
    public double transferTo(Account account, double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            account.balance += amount;
            // The "\u001B[32m" is an ANSI escape code that changes the text colour to green
            // The "\u001B[0m" is an ANSI escape code that resets the text color
            System.out.printf("\u001B[32m$%.2f has been transferred to %s successfully.\n\u001B[0m", amount,
                    account.getName());
        } else {
            System.out.println("\u001B[31mAmount exceeded balance.\u001B[0m");
        }

        return this.balance;
    }

    // Returns a string representation of the Account instance
    public String toString() {
        return String.format("Account:%nID: %s%nName: %s%nBalance: $%.2f", this.id, this.name, this.balance);
    }

}
