public class Generic<T>
{
    private T t;

    public Generic(T value)
    {
        this.t = value;
    }

    public T Get() {   return this.t;  }


    public void Set(T value)   {   this.t = value; }


    public void Type()
    {
        System.out.println(t.getClass().getName());
    }
}