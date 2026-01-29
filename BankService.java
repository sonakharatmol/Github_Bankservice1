public class BankService {

    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit must be positive");
            }
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                throw new IllegalArgumentException("Invalid withdrawal");
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(88800);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("Balance after deposit of 500: " + acc.getBalance());

        acc.withdraw(400);
        System.out.println("Balance after withdrawal of 300: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
