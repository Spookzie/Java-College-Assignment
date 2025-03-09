public class RunnableImpl implements Runnable
{
    @Override
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            System.out.println("Hello World!");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}