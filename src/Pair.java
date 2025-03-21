public class Pair<K, V>
{
    private K key;
    private V value;

    
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K GetKey()   {   return this.key;    }
    public V GetValue() {   return this.value;  }

    public void SetKey(K key)   {   this.key = key; }
    public void SetValue(V value)   {   this.value = value; }
}