import java.util.List;


public class ExtendsEg
{
    public void PrintNums(List<? extends Number> list)
    {
        for(Number num : list)
            System.out.print(num + " ");
    }
}