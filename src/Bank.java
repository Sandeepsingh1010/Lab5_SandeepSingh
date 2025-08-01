public class Bank {

    //initial balance:
    static int total;

    //Adding Constructor to be able to open account with initial balance
    public Bank(int initialBalance) {
        total = initialBalance;
    }
    //Withdraw method; withdraws money only if money is greater than or equal to total
    // Cant call static methods from Thread classes, so changed to public
    public synchronized void withdraw(String name, int withdraw) {
        if (total >= withdraw) {
            System.out.println(name + " withdraws: $" + withdraw);
            total -= withdraw;
            System.out.println("\tNew Balance = $" + total+"\n--------------------");
        } else {
            System.out.println(name + "Insufficient Balance");
        }
    }

    //Deposit Method, Whenever deposited
    public synchronized void deposit(String name, int deposit) {
        System.out.println(name + " deposits:  $" + deposit);
        total += deposit;
        System.out.println("\tNew Balance = $" + total+"\n--------------------");
    }

    public double getBalance() {
        return total;
    }

}
