import java.util.*;

/**
 * ATM
 */
interface ATM {
    void withdraw(int amount);

    void deposit(int amount);

    void checkBalance();
}

class BankAccount implements ATM {
    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Transaction failed!!");
            System.out.println("enter valid amount!!");
        }
        this.balance -= amount;
        System.out.println("Transaction successful!!");
        System.out.println("your balance is: " + this.balance);
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Transaction successful!!");
        System.out.println("your balance is: " + this.balance);
    }

    public void checkBalance() {
        System.out.println("Account Balance is: " + this.balance);
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(50000);
        int ch;
        do {
            System.out.println("enter your choice:1 for withdrawal, 2 for deposit, 3 for balance check, 4 for Exit");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter the amount:");
                int amount = sc.nextInt();
                acc.withdraw(amount);
            } else if (ch == 2) {
                System.out.println("Enter the amount: ");
                int amount = sc.nextInt();
                acc.deposit(amount);
            } else if (ch == 3) {
                acc.checkBalance();
            } else if (ch == 4) {
                System.out.println("Thank you for using the ATM.");
            } else {
                System.out.println("Invalid input!!");
            }
        } while (ch != 4);
    }
}
