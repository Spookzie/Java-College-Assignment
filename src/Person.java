public class Person
{
    private final String name;
    private int age;


    //Constructor
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    
    public void GrowOld()   {   this.age++; }


    //Accessors
    public String GetName() {   return this.name;   }
    public int GetAge()     {   return this.age;    }


    @Override
    public String toString()
    {
        return this.name + " is " + this.age + " years old.";
    }
}