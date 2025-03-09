public class Producer extends Thread
{
    SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() 
    {
        int value = 1;

        while(true)
        {
            try {
                this.buffer.produce(value++);
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}