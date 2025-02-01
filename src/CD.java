public class CD implements Item
{
    private final String artist;
    private final String name;
    
    private final int year;


    //Constructor
    public CD(String artist, String name, int year)
    {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }


    //  Box interface methods   //
    //---------------------------
    @Override
    public double weight()
    {
        return 0.1;
    }
    //---------------------------
    

    @Override
    public String toString()
    {
        return this.artist + ": " + this.name + "(" + this.year + ")";
    }
}
