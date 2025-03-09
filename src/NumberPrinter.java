public class NumberPrinter extends Thread
{
    private boolean isRunning = true;

    public void stopThread()
    {
        this.isRunning = false;
    }

    @Override
    public void run()
    {
        for (int i=1; i<=100 && this.isRunning; i++)
        {
            System.out.println(i);

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Thread Stopped");
    }
}