public class Teacher extends Person
{
    private final String subject;
    

    //Constructor
    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }


    @Override
    public String toString()
    {
        return this.GetName() + " teaches " + this.subject;
    }
}