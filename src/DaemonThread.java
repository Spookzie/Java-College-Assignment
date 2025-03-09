public class DaemonThread extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Daemon Thread Running");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}