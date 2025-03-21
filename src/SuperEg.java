import java.util.List;

public class SuperEg
{
    public void AddNums(List<? super Integer> list)
    {
        list.add(1);
        list.add(2);
    }
}
