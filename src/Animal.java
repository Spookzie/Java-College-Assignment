public /*final*/ class Animal
{
    private final String sound;

    //Constructor
    public Animal(String sound)
    {
        this.sound = sound;
    }


    //Accessor
    public String MakeSound()   {   return this.sound;  }
}