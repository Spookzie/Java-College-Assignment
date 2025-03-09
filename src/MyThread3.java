public class MyThread3 extends Thread
{
    private final String name;

    public MyThread3(String name, int priority)
    {
        this.name = name;
        setPriority(priority);
    }


    @Override
    public void run()
    {
        System.out.println(this.name);
    }
}