package shapes;


public class Circle implements Shape
{
    private final double radius;    

    
    // Constructor
    public Circle(double radius)
    {
        this.radius = radius;
    }


    @Override
    public double Area()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }


    @Override
    public double Perimeter()
    {
        return 2 * Math.PI * this.radius;
    }
}