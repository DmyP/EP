package Concurrency;

public class Operations {
    public static void main(String[] args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(a, b, 500);
                } catch (InsufficientFundsException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(b, a, 300);
                } catch (InsufficientFundsException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    static void transfer(Account a, Account b, int amount) throws InsufficientFundsException, InterruptedException {
        System.out.printf("before transfer, Thread - %s, account a - %d, b - %d\n", Thread.currentThread().getName(), a.getBalance(), b.getBalance());

        if (a.getBalance() < amount) {
            throw new InsufficientFundsException();
        }
        synchronized (a) {
            System.out.println(Thread.currentThread().getName() + " sync " + a.getBalance());
            a.withdraw(amount);
            System.out.printf("withdraw successful account a - %d, b - %d\n", a.getBalance(), b.getBalance());
            Thread.sleep(1000);
            synchronized (b) {
                System.out.println(Thread.currentThread().getName() + " sync " + a.getBalance());
                b.deposit(amount);
                System.out.printf("deposit successful account a - %d, b - %d\n", a.getBalance(), b.getBalance());
            }

        }
    }
}
