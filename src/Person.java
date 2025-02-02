public class Person
{
    private final String name;
    private int age;
    private final int salary;


    // Constructors
    public Person(String name)
    {
        this.name = name;
        this.salary = 0;
    }

    public Person(String name, int age)
    {
        this.name   = name;
        this.age    = age;
        this.salary = 0;
    }

    public Person(String name, int age, int salary)
    {
        this.name   = name;
        this.age    = age;
        this.salary = salary;
    }

    public Person(Person person)
    {
        this.name   = person.name;
        this.age    = person.age;
        this.salary = person.salary;
    }

    
    public void GrowOld()   {   this.age++; }


    //Accessors
    public String GetName() {   return this.name;   }
    public int GetAge()     {   return this.age;    }


    @Override
    public String toString()
    {
        return this.name + " is " + this.age + " years old and earns " + this.salary;
    }
}