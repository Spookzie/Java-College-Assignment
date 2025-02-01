public class App
{
    public static void main(String[] args) throws Exception
    {
        // Replace this with whatever question function you want to run
        Question12();
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

    
    //  Program to implement the final keyword for variables, methods, and classes. //
    private static void Question10()
    {
        int a = 5;
        final int b = 5;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a++;
        // b++;
        // Uncomment this line to see the error of using final keyword with variables
        // Final variables' values cannot be reassaigned/modified

        System.out.println("\na = " + a);
        System.out.println("b = " + b);


        // "Dog.java" & "Labrador.java" show the implementation of final keyword with method, since GetFood() has been defined as final in Dog.java, it cannot be overriden in Labrador.java
        //  Uncomment line 13, 14, run App.java with Question5() to see the error 

        // "Animal.java" holds the implementation of class Animal, "final" has been added in the implementation but has been commented,
        // Uncomment final keyword in line 1, run App.java with Question5() to see the error 
        // No class can be extended from a final class
    }


    //  Program that uses Java's StringBuilder for efficient string operations. //
    private static void Question11()
    {
        StringBuilder sb = new StringBuilder("This question");
        System.out.println("Initial StringBuilder: " + sb);

        sb.append(" is done :)");
        System.out.println("After appending : " + sb);

        sb.insert(13, " of assignment");
        System.out.println("After inserting: " + sb);

        sb.replace(0, 4, "java");
        System.out.println("After replacing: " + sb);

        sb.delete(13, 27);
        System.out.println("After deleting: " + sb);

        sb.reverse();
        System.out.println("After reversing: " + sb);
        sb.reverse();

        int capacity = sb.capacity();   //Total length the stringbuilder can go up to
        System.out.println("Total capacity: " + capacity);

        int len = sb.length();
        System.out.println("Occupied capacity (length): " + len);

        char ch = sb.charAt(3);
        System.out.println("Character at index 3: " + ch);

        sb.setCharAt(0, 'J');
        System.out.println("After setCharAt: " + sb);

        String subS = sb.substring(5, 12);
        System.out.println("Substring: " + subS);

        int wordIndex = sb.indexOf("is");
        System.out.println("Index of 'is': " + wordIndex);

        sb.deleteCharAt(23);
        sb.deleteCharAt(22);
        System.out.println("After deleteCharAt: " + sb);

        String result = sb.toString();
        System.out.println("After conversion to string: " + result);
    }

    
    //  Program to demonstrate the immutability of the String class.    //
    private static void Question12()
    {
        String s1 = "Hello";
        String s2 = s1.concat(" World");

        System.out.println("Original String: " + s1); // "Hello"
        System.out.println("Modified String: " + s2); // "Hello World"

        if (s1.equals(s2))
            System.out.println("Both refer to the same object.");
        else
            System.out.println("Different objects are created in memory.");
    }
}