public class MyThread2 extends Thread
{
    private int timeInSec;

    // Constructor
    public MyThread2(int time_in_sec)
    {
        this.timeInSec = time_in_sec;
    }


    @Override
    public void run()
    {
        for (int i=0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(timeInSec * 1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}