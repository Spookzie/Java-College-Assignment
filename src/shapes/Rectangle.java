package shapes;


public class Rectangle implements Shape
{
    private final double length, breadth;


    // Constructor
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public double Area()
    {
        return this.length * this.breadth;
    }

    @Override
    public double Perimeter()
    {
        return 2 * (this.length + this.breadth);
    }
}
