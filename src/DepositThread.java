public class DepositThread extends Thread
{
    private final BankAccount account;
    private final int amount;
    private final String threadName;

    // Constructor
    public DepositThread(BankAccount account, int amount, String thread_name)
    {
        this.account = account;
        this.amount = amount;
        this.threadName = thread_name;
    }

    @Override
    public void run()
    {
        this.account.deposit(this.amount, this.threadName);
    }
}