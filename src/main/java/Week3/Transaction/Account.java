package Week3.Transaction;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    public Account(double balance) {
        this.balance = balance;
        this.transitionList = new ArrayList<>();
    }

    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<>();
    }

    /**
     * Nap tien vao tai khoan.
     * 
     * @param amount amount of the account
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        } else {
            balance += amount;
        }
    }

    /**
     * Rut tien ra khoi tai khoan.
     * 
     * @param amount amount of the account.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        } else {
            if (amount > balance) {
                System.out.println("So tien ban rut vuot qua so du!");
                return;
            } else {
                balance -= amount;
            }
        }
    }

    /**
     * Them giao dich vao danh sach.
     * 
     * @param amount    amount of the account.
     * @param operation operation of the transaction.
     */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.DEPOSIT && operation != Transaction.WITHDRAW) {
            System.out.println("Yeu cau khong hop le!");
            return;
        } else {
            if (operation == Transaction.DEPOSIT) {
                deposit(amount);
                transitionList.add(new Transaction(operation, amount, balance));
            } else {
                withdraw(amount);
                transitionList.add(new Transaction(operation, amount, balance));
            }
        }
    }

    /**
     * Method print transactions.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            String op = transaction.getOperation();
            if (op.equals(Transaction.DEPOSIT)) {
                op = "Nap tien";
            } else {
                op = "Rut tien";
            }
            double amount = transaction.getAmount();
            double balance = transaction.getBalance();
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n",
                    i + 1, op, amount, balance);
        }
    }
}
