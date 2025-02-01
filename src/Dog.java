public class Dog extends Animal
{
    private final String food;


    //Constructor
    public Dog(String sound, String food)
    {
        super(sound);

        this.food = food;
    }


    //Accessor
    public String GetFood() {   return this.food;   }

    
    @Override
    public String toString()
    {
        return "Dog " + this.MakeSound() + " and eats " + this.food;
    }
}