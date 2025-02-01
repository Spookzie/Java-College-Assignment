public class Book implements Item
{   
    private final String author;
    private final String name;
    
    private final double weight;

    
    //Constructor
    public Book(String author, String name, double weight)
    {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }


    //  Box interface methods   //
    //---------------------------
    @Override
    public double weight()
    {
        return this.weight;
    }
    //---------------------------


    @Override
    public String toString()
    {
        return this.author + ": " + this.name;
    }
}