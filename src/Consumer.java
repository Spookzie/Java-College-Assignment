public class Consumer extends Thread
{
    SharedBuffer buffer;

    public Consumer(SharedBuffer buffer)
    {
        this.buffer = buffer;
    }

    @Override
    public void run()
    {
        while(true)
        {
            try {
                this.buffer.consume();
                Thread.sleep(1500);
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
    }
}