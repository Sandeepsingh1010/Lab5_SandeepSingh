
public class ThreadWithdrawl extends Thread {

    Bank object;
    String name;
    int dollar;

    // Constructor
    public ThreadWithdrawl(Bank ob, String name, int money) {
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    @Override
    public void run() {
        object.withdraw(name, dollar);
    }
}
