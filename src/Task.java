public class Task implements Runnable
{
    private final Resource res1;
    private final Resource res2;

    public Task(Resource resource_1, Resource resource_2)
    {
        this.res1 = resource_1;
        this.res2 = resource_2;
    }

    @Override
    public void run()
    {
        synchronized (res1)
        {
            System.out.println(Thread.currentThread().getName() + " locked " + this.res1.GetName());

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (res2)
            {
                System.out.println(Thread.currentThread().getName() + " locked " + this.res2.GetName());
            }
        }     
    }
}