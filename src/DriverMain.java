public class DriverMain {

    public static void main(String[] args) {

        Bank obj = new Bank(500);

        //Threads for ThreadWithdrawl
        ThreadWithdrawl t1 = new ThreadWithdrawl(obj, "dummy1", 100);
        ThreadWithdrawl t2 = new ThreadWithdrawl(obj, "dummy2", 100);
        ThreadWithdrawl t3 = new ThreadWithdrawl(obj, "dummy3", 100);
        ThreadWithdrawl t4 = new ThreadWithdrawl(obj, "dummy4", 100);

        //Threads for ThreadDeposit
        ThreadDeposit d1 = new ThreadDeposit(obj, "dummy5", 50);
        ThreadDeposit d2 = new ThreadDeposit(obj, "dummy6", 50);
        ThreadDeposit d3 = new ThreadDeposit(obj, "dummy7", 50);
        ThreadDeposit d4 = new ThreadDeposit(obj, "dummy8", 50);

        try {
            // Start Withdrawals
            t1.start();
            t2.start();
            t3.start();
            t4.start();

            // Start Deposits
            d1.start();
            d2.start();
            d3.start();
            d4.start();

        } catch (Exception e) {
            System.out.println("Thread execution interrupted !");
            e.printStackTrace();
        }

        System.out.println("Final Balance = $" + obj.getBalance());
    }
}
