public class Labrador extends Dog
{
    private final String furColor;

    public Labrador(String sound, String food, String fur_color)
    {
        super(sound, food);

        this.furColor = fur_color;
    }
    

    @Override
    public String toString()
    {
        return "Labrador " + this.MakeSound() + ", eats " + this.GetFood() + " and has " + this.furColor + " fur";
    }
}