public class App
{
    public static void main(String[] args) throws Exception
    {
        // Replace this with whatever question function you want to run
        Question6();
    }


    //  Program to demonstrate encapsulation in Java.   //
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


    //  Program showing the use of inheritance and polymorphism.    //
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


    //  Program implementing the concept of abstraction. //
    private static void Question3()
    {
        Player hero = new Player();
        hero.Spawn();
        hero.Kill();
    }

    //  Program to demonstrate method overloading and method overriding.    //
    //---------------------------------
    private static void Question4()
    {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1, 2, 3));   //Overloading the initial Sum function

        //Overriding has been already implemented multiple times across other questions (like toString method)
    }

    private static int Sum(int num_1, int num_2)   {   return num_1 + num_2;   }
    private static int Sum(int num_1, int num_2, int num_3)   {   return num_1 + num_2 + num_3;   }
    //---------------------------------


    //  Program to demonstrate class hierarchy for animals that demonstrates polymorphism.  //
    private static void Question5()
    {
        Dog myDog = new Dog("barks", "bones");
        System.out.println(myDog);
        
        Labrador myLab = new Labrador("barks", "pedigree", "golden");
        System.out.println(myLab);
    }


    //  Program to implement multiple inheritance using interfaces. //
    private static void Question6()
    {
        Box box = new Box(10);

        box.Add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.Add(new Book("Robert Martin", "Clean Code", 1));
        box.Add(new Book("Kent Beck", "Test Driven Development", 0.7));
        
        box.Add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.Add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.Add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }


    //  Question 7: Program to showcase the use of this and super keywords. //
    /*
    this keyword has been used throughout all my code, in all the classes
    super keyword has been used in the solution of q2 an q5.
    */


    //  Question 8: Program to demonstrate the concept of constructors. //
    /*
    Different classes has been defined for solutions of above questions, each class has its own constructor
    */


    //  Question 9: Program to implement the concept of access modifiers in Java.   //
    /*
    private   - the object/method defined as private is usable across that class only in which it is defined.
    protected - the object/method defined as protected is usable across the package or all subclasses.
    public    - the object/method defined as public is usable across the entire solution which uses the class it is defined in.
    
    private and public access modifiers have been used multiple times throughout all the classes
    */
}