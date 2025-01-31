public class App
{
    public static void main(String[] args) throws Exception
    {
        // Replace this with whatever question function you want to run
        Question3();
    }


    // Program to demonstrate encapsulation in Java.   //
    private static void Question1()
    {   
        Person me = new Person("Vansh Bansal", 20);

        System.out.println("Person name: " + me.GetName());
        System.out.println("Person age: " + me.GetAge());
    
        me.GrowOld();
        me.GrowOld();
        me.GrowOld();

        System.out.println(me);
    }


    //  rogram showing the use of inheritance and polymorphism.    //
    private static void Question2()
    {
        Person me = new Person("Vansh Bansal", 20);
        System.out.println("Person name: " + me.GetName());
        System.out.println("Person age: " + me.GetAge());
        System.out.println(me);

        System.out.println("\n-------------------\n");
        Teacher sir = new Teacher("John Doe", 39, "Mathematics");
        System.out.println("Teacher name: " + sir.GetName());
        System.out.println("Teacher age: " + sir.GetAge());
        System.out.println(sir);
    }


    // Program implementing the concept of abstraction.
    private static void Question3()
    {
        Player hero = new Player();
        hero.Spawn();
        hero.Kill();
    }
}