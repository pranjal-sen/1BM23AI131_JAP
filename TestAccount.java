class LessBalanceException extends Exception {
    LessBalanceException (String msg) {
        super("Error: " + msg);
    }
}

class Account {
    private final int MINIMUM_AMOUNT = 500;
    private double balance;

    Account () {
        this.balance = MINIMUM_AMOUNT;
    }

    void withdraw(double amount) {
        try {
            if (this.balance - amount < MINIMUM_AMOUNT) {
                throw new LessBalanceException("Insufficient Balance");
            }
            this.balance -= amount;
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }
}


public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(500);
        acc1.displayBalance();
        acc1.withdraw(200);
        acc1.displayBalance();

        Account acc2 = new Account();
        acc2.deposit(200);
        acc2.displayBalance();
        acc2.withdraw(300);
        acc2.displayBalance();
    }
}

/*
OUTPUT
Balance: 1000.0
Balance: 800.0
Balance: 700.0
Error: Insufficient Balance
Balance: 700.0
 */
