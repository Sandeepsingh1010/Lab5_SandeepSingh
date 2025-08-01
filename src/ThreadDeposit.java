public class ThreadDeposit extends  Thread {

    Bank object;
    String name;
    int dollar;

    // Constructor
    public ThreadDeposit(Bank ob, String name, int money) {
        this.object = ob;
        this.name = name;
        this.dollar = money;
    }

    @Override
    public void run() {
        object.deposit(name, dollar);
    }

}
