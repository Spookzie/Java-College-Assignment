public class SharedBuffer
{
    private int data;
    private boolean hasData = false;


    public synchronized void produce(int value) throws InterruptedException
    {
        // Wait if data is already produced
        while (this.hasData)
            wait(); 
    
        this.data = value;
        System.out.println("Produced: " + this.data);
        this.hasData = true;
        
        // Notify consumer
        notify(); 
    }

    public synchronized void consume() throws InterruptedException
    {
        // Wait if no data is available
        while (!this.hasData)
            wait(); 
        
        System.out.println("Consumed: " + this.data);
        this.hasData = false;

        // Notify producer
        notify(); 
    }
}