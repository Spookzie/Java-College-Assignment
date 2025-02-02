import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    public static void main(String[] args) throws Exception
    {
        // Replace this with whatever question function you want to run
        Question20();
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


    //  Program to declare variables of all primitive data types in Java and print their default values.    //
    //---------------------------------
    private static boolean boolean_var;
    private static byte    byte_var;
    private static char    char_var;
    private static short   short_var;
    private static int     int_var;
    private static long    long_var;
    private static float   float_var;
    private static double  double_var;

    private static void Question13()
    {
        System.out.println("Default values of primitive data types:\n");
        System.out.println("boolean: " + boolean_var);
        System.out.println("byte: " + byte_var);
        System.out.println("char: " + char_var);
        System.out.println("short: " + short_var);
        System.out.println("int: " + int_var);
        System.out.println("long: " + long_var);
        System.out.println("float: " + float_var);
        System.out.println("double: " + double_var);
    }
    //---------------------------------


    //  Program to demonstrate the use of if-else, switch, and for loops.    //
    private static void Question14()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int grade = Integer.parseInt(sc.nextLine());
        sc.close();

        char gradeLetter;

        //If-else
        if (grade >= 90)
            gradeLetter = 'A';
        else if (grade >= 80)
            gradeLetter = 'B';
        else if (grade >= 70)
            gradeLetter = 'C';
        else if (grade >= 60)
            gradeLetter = 'D';
        else
            gradeLetter = 'F';
    

        //Switch-case
        switch (gradeLetter)
        {
        case 'A':
            System.out.println("Excellent! You got an A.");
            break;
        case 'B':
            System.out.println("Great job! You got a B.");
            break;
        case 'C':
            System.out.println("Good effort! You got a C.");
            break;
        case 'D':
            System.out.println("You passed with a D.");
            break;
        case 'F':
            System.out.println("Unfortunately, you failed.");
            break;
        default:
            System.out.println("Invalid grade.");
        }


        //For loop
        System.out.println("\nDisplaying your grade in:");
        for (int i = 3; i > 0; i--)
        {
            System.out.println(i + "...");
            try
            {
                Thread.sleep(1000); // Pause for 1 second (1000 ms)
            } catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }


        System.out.println("Your final grade: " + gradeLetter);

    }


    //  Program to check if a number is prime using a while loop.   //
    private static void Question15()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = true;

        if (num < 2)
            isPrime = false;
        else
        {
            int i = 2;
            while (i <= Math.sqrt(num))
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }

                i++;
            }
        }

        if(isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is NOT a prime number.");
    }


    //  Program to calculate the factorial of a number using recursion. //
    private static void Question16()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
    
            System.out.println("Factorial of " + num + " is: " + Factorial(num));
        }
    }

    private static long Factorial(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }


    //  Program to identify valid and invalid identifiers in Java.  //
    
    private static void Question17()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter an identifier: ");
            String identifier = sc.nextLine();
            
            if (IsValidIdentifier(identifier))
            System.out.println(identifier + " is a valid identifier.");
            else
            System.out.println(identifier + " is NOT a valid identifier.");
        }
    }
    
    private static boolean IsValidIdentifier(String str)
    {
        final String regex = "[a-zA-Z_][a-zA-Z0-9_]*";

        final String[] keywords = {
        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", 
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", 
            "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", 
            "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", 
            "throw", "throws", "transient", "try", "void", "volatile", "while"
        };

        for (String keyword : keywords)
        {
            if (str.equals(keyword))
                return false;
        }

        return Pattern.matches(regex, str);
    }


    //  Program to find the largest and smallest numbers in an array.   //
    private static void Question18()
    {
        ArrayList<String> nums = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        //Inputting the first input & setting it as the largest as well as smallest
        System.out.println("Enter nos. of an array (enter a blank line to stop adding): ");
        nums.add(sc.nextLine());
        int i=0;
        int largest = Integer.parseInt(nums.get(i));
        int smallest = largest;

        //Inputting the rest of the numbers
        while(!nums.get(i).equals(""))
        {
            i++;
            nums.add(sc.nextLine());
        }
        
        //Finding the Largest
        for(int j=1; j<nums.size()-1; j++)
        {
            if(Integer.parseInt(nums.get(j)) > largest)
                largest = Integer.parseInt(nums.get(j));
        }
        
        //Finding the Smallest
        for(int j=1; j<nums.size()-1; j++)
        {
            if(Integer.parseInt(nums.get(j)) < smallest)
                smallest = Integer.parseInt(nums.get(j));
        }
        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
        sc.close();
    }


    //  Program to check if a given number is odd or even.    //
    private static void Question19()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a no.: ");
            int n = Integer.parseInt(sc.nextLine());

            if(n%2 == 0)
                System.out.println(n + " is even.");
            else 
                System.out.println(n + " is odd.");
        }
    }


    //  Program to find the largest of three numbers entered by the user.   //
    private static void Question20()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter three nos.: ");
            
            int n1 = Integer.parseInt(sc.nextLine());
            int n2 = Integer.parseInt(sc.nextLine());
            int n3 = Integer.parseInt(sc.nextLine());

            if(n1>=n2 && n1>=n3)
                System.out.println(n1 + " is largest");
            else if(n2>=n1 && n2>=n3)
                System.out.println(n2 + " is largest");
            else
                System.out.println(n3 + " is largest");
        }
    }


    //  Question 20: Program to calculate the factorial of a given number using recursion.   //
    // Already done (Question 16)
}