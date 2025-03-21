public class Box1<T>
{
    private T item;

    public void addItem(T item) {   this.item = item;   }

    public T getItem()  {   return this.item;   }
}