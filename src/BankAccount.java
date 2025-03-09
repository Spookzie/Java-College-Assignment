public class BankAccount
{
    private int balance;

    // Constructor
    public BankAccount(int starting_balance)
    {
        this.balance = starting_balance;
    }


    public synchronized void deposit(int amount, String thread_name)
    {
        //---------------------------
        // Question 67
        // System.out.println(thread_name + " is trying to deposit " + amount);
        // this.balance += amount;
        // System.out.println(thread_name + " updated balance to " + this.balance);
        //---------------------------

        //---------------------------
        // Quesion 68
        System.out.println(thread_name + " is trying to deposit " + amount);
        synchronized (this)
        {
            this.balance += amount;
            System.out.println(thread_name + " updated balance to: " + this.balance);
        }
        //---------------------------
    }


    @Override
    public String toString()
    {
        return "Final Account Balance: " + this.balance;
    }
}