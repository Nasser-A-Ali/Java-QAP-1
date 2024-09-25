package ap_qap1_accountclass;

public class TestAccount {

    public static void main(String[] args) {
        // Intializes two Account instances
        Account Acc1 = new Account("Acc1", "Account 1", 5000.00);
        Account Acc2 = new Account("Acc2", "Account 2", 4000.00);

        // Displays the balances of Accounts 1 & 2
        System.out.println();
        System.out.printf("Balance of Account 1: $%.2f\n", Acc1.getBalance());
        System.out.printf("Balance of Account 2: $%.2f\n", Acc2.getBalance());

        // Transfers $1000.00 from Account 1 to Account 2
        System.out.println();
        Acc1.transferTo(Acc2, 1000.00);

        // Displays the balances of Accounts 1 & 2
        System.out.println();
        System.out.printf("Balance of Account 1: $%.2f\n", Acc1.getBalance());
        System.out.printf("Balance of Account 2: $%.2f\n", Acc2.getBalance());

        // This is additional and is meant to display the rest of the added features of
        // this program

        // Attempts to transfer $5000.00 which is above the available balance
        System.out.println();
        Acc1.transferTo(Acc2, 5000.00);

        // Displays the account details for Accounts 1 & 2 using the toString() method
        System.out.println();
        System.out.println(Acc1.toString());
        System.out.println();
        System.out.println(Acc2.toString());
        System.out.println();
    }
}
