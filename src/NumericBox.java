public class NumericBox<T extends Number>
{  
    private final T t;

    public NumericBox(T value)
    {
        this.t = value;
    }


    //  Getters  //
    public T Get() {   return t;   }
}