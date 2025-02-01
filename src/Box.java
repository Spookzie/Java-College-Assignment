import java.util.ArrayList;


public class Box implements Item
{
    private final double maxWeight;
    private double currentWeight;
    private double capacityLeft;

    private final ArrayList<Book> books;
    private final ArrayList<CD> cds;

    private int itemCount;


    //Constructor
    public Box(double max_capacity)
    {
        this.maxWeight = max_capacity;
        this.currentWeight = 0;
        this.capacityLeft = max_capacity;
        this.books = new ArrayList<>();
        this.cds = new ArrayList<>();
    }


    public void Add(Item packable)
    {
        if(packable.getClass().equals(Book.class))
        {
            Item book = packable;
            if(this.capacityLeft > 0)
            {
                this.books.add((Book)book);
                this.capacityLeft -= book.weight();
                this.currentWeight += book.weight();
                this.itemCount++;
            }
            else
            {
                this.capacityLeft = 0;
                System.out.println("Cannot add book, box is full!");
            }
        }
        else if(packable.getClass().equals(CD.class))
        {
            Item cd = packable;
            if(this.capacityLeft > 0)
            {
                this.cds.add((CD)cd);
                this.capacityLeft -= cd.weight();
                this.currentWeight += cd.weight();
                this.itemCount++;
            }
            else
            {
                this.capacityLeft = 0;
                System.out.println("Cannot add CD, box is full!");
            }
        }
    }


    //  Box interface methods   //
    //---------------------------
    @Override
    public double weight()
    {
        return this.currentWeight;
    }
    //---------------------------


    @Override
    public String toString()
    {
        for(Book book : this.books)
            System.out.println(book);
        for(CD cd : this.cds)
            System.out.println(cd);
        
        return "\n\nBox: \nItems added: " + this.itemCount + "\nCurrent weight: " + this.currentWeight + " kg\nCapacity left: " + this.capacityLeft + " kg\nTotal capacity: " + this.maxWeight + " kg\n";
    }
}