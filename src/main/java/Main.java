public class Main {
    public static void main (String[] args) {
        // Basic variables
        String accountNumber = "123456789";
        double balance = 1500.75;
        int pin = 1234;

        // Transaction amounts Array
        int[] transactionAmounts = {200, -100, 50};

        // Operations with variables
        balance += transactionAmounts[0]; // Deposit
        if(balance > 0 && pin == 1234) {
            System.out.println("Access granted");
        }

        // Operators usage
        balance++; // Increment
        String status = (balance < 0) ? "Debt" : "Credit";
        System.out.println("Account Status: " + status);
    }
}
