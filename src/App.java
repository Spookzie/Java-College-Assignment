import Utilities.MathUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import shapes.Circle;
import shapes.Rectangle;


public class App
{

    public static void main(String[] args) throws Exception
    {
        // Replace this with whatever question method you want to run
        // To run assignment-1 questions, put Question[ques_no.]();
        // To run assignment-2 questions, do the same but do ques_no. + 51;
        // To run assignment-3 questions, do the same but do ques_no. + 61;
        Question86();
    }



    //          ASSIGNMENT - 1              //    
    
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
    //---------------------------------
    private static void Question16()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
    
            System.out.println("Factorial of " + num + " is: " + Factorial(num));
        }
    }

    private static long Factorial(int n) throws  IllegalArgumentException
    {
        if (n < 0)
            throw new IllegalArgumentException("The number you provided is negative"); 

        if (n == 0 || n == 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }
    //---------------------------------


    //  Program to identify valid and invalid identifiers in Java.  // 
    //---------------------------------
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
    //---------------------------------


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


    //  Question 21: Program to calculate the factorial of a given number using recursion.   //
    // Already done (Question 16)


    //  Program to check if a given string or number is a palindrome    //
    private static void Question22()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            String s = sc.next();
            
            String sReverse = "";
            
            for(int i = s.length()-1; i>=0; i--)
                sReverse += String.valueOf(s.charAt(i));
                
            if(sReverse.equals(s))
                System.out.println(s + " is a palindrome");
            else
                System.out.println(s + " is not a palindrome");
        }
    }


    //  Program to generate the first n terms of the Fibonacci series.  //
    private static void Question23()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int n = Integer.parseInt(sc.nextLine());
    
            int current = 0;
            int next = 1;
            while(current <= n)
            {
                System.out.print(current + " ");
    
                int prev = current;
                current += next;
                next = prev;
            }
        }
    }


    //  Question 24: Program to check whether a given number is prime.  //
    //Already done (Question 15)


    //  Program to find the sum of all elements in an array.    //
    private static void Question25()
    {
        ArrayList<String> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        //Inputting the first input & setting it as the largest as well as smallest
        System.out.println("Enter nos. of an array (enter a blank line to stop adding): ");
        nums.add(sc.nextLine());
        
        //Inputting the rest of the numbers
        int i = 0;
        while(!nums.get(i).equals(""))
        {
            i++;
            nums.add(sc.nextLine());
        }

        sc.close();


        int sum = 0;
        for(int j=0; j<nums.size()-1; j++)
            sum += Integer.parseInt(nums.get(j));

        System.out.println("Sum of all elements = " + sum);
    }


    //  Program to reverse the elements of an array.    //
    private static void Question26()
    {
        //Input array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = Integer.parseInt(sc.nextLine());

        System.out.println("Enter elements of the array:");
        int[] nums;
        nums = new int[size];
        for(int i=0; i<size; i++)
            nums[i] = Integer.parseInt(sc.nextLine());

        sc.close();


        //Print array
        System.out.print("Array: [ ");
        for(int i=0; i<size; i++)
            System.out.print(nums[i] + " ");
        System.out.print("]");
        
        //Print reverse array
        System.out.print("\nReverse of array: [ ");
        for(int i=size-1; i>=0; i--)
            System.out.print(nums[i] + " ");    
        System.out.print("]");
    }


    //  Program to perform matrix addition and multiplication.   //
    //---------------------------------
    private static void Question27()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.print("Enter number of columns: ");
        int cols = Integer.parseInt(sc.nextLine());

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] sumMat = new int[rows][cols];

        //Matrix input & print
        System.out.println("Enter elements for Matrix 1:");
        MatrixInput(sc, mat1, rows, cols);
        System.out.println("Enter elements for Matrix 2:");
        MatrixInput(sc, mat2, rows, cols);
        
        System.out.println("Matrix 1:");
        PrintMatrix(mat1, rows, cols);
        System.out.println("Matrix 2:");
        PrintMatrix(mat2, rows, cols);
        
        //Matrix sum & print
        AddMatrices(mat1, mat2, sumMat, rows, cols);
        System.out.println("Sum of Matrices:");
        PrintMatrix(sumMat, rows, cols);

        //Matrix Multiplication (Possible only if cols of matrix1 == rows of matrix2)

        if (cols == rows)
        {
            int[][] resultMat = new int[rows][cols];
            MultiplyMatrices(mat1, mat2, resultMat, rows, cols);
    
            System.out.println("Product of Matrices:");
            PrintMatrix(resultMat, rows, cols);
        }
        else
            System.out.println("Matrix multiplication is not possible with given dimensions.");

        sc.close();
    }

    private static void MatrixInput(Scanner scanner, int[][] mat, int rows, int cols)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
                mat[i][j] = scanner.nextInt();
        }
    }

    private static void AddMatrices(int[][] mat1, int[][] mat2, int[][] sum, int rows, int cols)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
                sum[i][j] = mat1[i][j] + mat2[i][j];
        }
    }

    private static void MultiplyMatrices(int[][] mat1, int[][] mat2, int[][] result, int rows, int cols)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                result[i][j] = 0;
                for (int k = 0; k < cols; k++)
                    result[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    private static void PrintMatrix(int[][] mat, int rows, int cols)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
                System.out.print(mat[i][j] + " ");

            System.out.println();
        }
    }
    //---------------------------------


    //  Program to sort an array using the bubble sort algorithm.   //
    private static void Question28()
    {
        //Input array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = Integer.parseInt(sc.nextLine());

        System.out.println("Enter elements of the array:");
        int[] nums;
        nums = new int[size];
        for(int i=0; i<size; i++)
            nums[i] = Integer.parseInt(sc.nextLine());

        sc.close();


        //Print array
        System.out.print("Array before sorting: [ ");
        for(int i=0; i<size; i++)
            System.out.print(nums[i] + " ");
        System.out.print("]");

        //Bubble sorting
        for(int i=0; i<size; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if(nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i]  = nums[j];
                    nums[j]  = temp; 
                }
            }
        }

        //Print array
        System.out.println();
        System.out.print("Array after sorting: [ ");
        for(int i=0; i<size; i++)
            System.out.print(nums[i] + " ");
        System.out.print("]");
    }


    //  Question 29: Program to demonstrate a 2D array and print its elements.  //
    //  2D array has been demonstrated in question 27 as well


    //  Program to search for an element in a sorted array using the binary search algorithm.   //
    //---------------------------------
    private static void Question30()
    {
        int[] nums;
        int x;

        try (Scanner sc = new Scanner(System.in))
        {
            //Input array
            System.out.print("Enter size of array: ");
            int size = Integer.parseInt(sc.nextLine());
            
            System.out.println("Enter elements of the array:");
            nums = new int[size];
            for(int i=0; i<size; i++)
                nums[i] = Integer.parseInt(sc.nextLine());    
            
            System.out.print("\nEnter the no. whose index you want: ");
            x = Integer.parseInt(sc.nextLine());
        }

        //Print array
        System.out.print("Array: [ ");
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println("]");

        //Binary Search
        int index = BinarySearch(nums, 0, nums.length-1, x);
        if(index != -1)
            System.out.println(x + " found at index " + index);
        else
            System.out.println(x + " does not exist in the given array");
    }

    private static int BinarySearch(int[] arr, int l, int h, int x)
    {
        if(l<=h)
        {
            int mid = l + (h-l) / 2;
            if(x > arr[mid])
                return BinarySearch(arr, mid+1, h, x);
            else if(x == arr[mid])
                return mid;
            else
                return BinarySearch(arr, l, mid-1, x);
        }

        return -1;
    }
    //---------------------------------


    //  Program to remove duplicate elements from an array. //
    private static void Question31()
    {
        int[] nums;
        
        try (Scanner sc = new Scanner(System.in))
        {
            //Input array
            System.out.print("Enter size of array: ");
            int size = Integer.parseInt(sc.nextLine());
            nums = new int[size];
            
            System.out.println("Enter elements of the array:");
            for(int i=0; i<size; i++)
                nums[i] = Integer.parseInt(sc.nextLine());
        }

        //Print array
        System.out.print("Original array: [ ");
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.print("]");

        //Removing duplicates
        ArrayList<Integer> newNums = new ArrayList<>();
        boolean isDuplicate = false;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    isDuplicate = true;
                    break;
                }
                else
                    isDuplicate = false;
            }
            
            if(!isDuplicate)
                newNums.add(nums[i]);
        }

        //Print array
        System.out.println("New array: " + newNums);
    }


    //  Program to demonstrate the use of arithmetic, relational, and logical operators.    //
    private static void Question32()
    {
        int num1, num2;
        try (Scanner sc = new Scanner(System.in))
        {
           System.out.print("Enter a number: ");
           num1 = Integer.parseInt(sc.nextLine());
           System.out.print("Enter another number: ");
           num2 = Integer.parseInt(sc.nextLine());
        }

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // add
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // subtract
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // multiply
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // divide
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // modulus

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println(num1 + " == " + num2 + " -> " + (num1 == num2)); // equal
        System.out.println(num1 + " != " + num2 + " -> " + (num1 != num2)); // not equal
        System.out.println(num1 + " > " + num2 + " -> " + (num1 > num2));   // greater
        System.out.println(num1 + " < " + num2 + " -> " + (num1 < num2));   // less
        System.out.println(num1 + " >= " + num2 + " -> " + (num1 >= num2)); // greater or equal
        System.out.println(num1 + " <= " + num2 + " -> " + (num1 <= num2)); // less or equal

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        boolean condition1 = (num1 > 0);
        boolean condition2 = (num2 > 0);

        System.out.println("(" + num1 + " > 0) && (" + num2 + " > 0) -> " + (condition1 && condition2)); // AND
        System.out.println("(" + num1 + " > 0) || (" + num2 + " > 0) -> " + (condition1 || condition2)); // OR
        System.out.println("!(" + num1 + " > 0) -> " + (!condition1)); // NOT
    }


    //  Pogram to show the difference between == and equals() for string comparison.   //
    private static void Question33()
    {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str3 == str4: " + (str3 == str4));

        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str3.equals(str4): " + str3.equals(str4));
    }


    //  Program to illustrate the use of the ternary operator.  //
    private static void Question34()
    {
        int a, b;
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a no.: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.print("Enter another no.: ");
            b = Integer.parseInt(sc.nextLine());
        }

        boolean isAGreater = (a>b) ? true : false;

        if(isAGreater)
            System.out.println(a + " is greater than " + b);
        else
            System.out.println(a + " is smaller than " + b);
    }


    //  Program to perform bitwise operations in Java.  //
    private static void Question35()
    {
        int num1, num2;
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter another number: ");
            num2 = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("\nBitwise AND (&): " + (num1 & num2));      // AND
        System.out.println("Bitwise OR (|): " + (num1 | num2));         // OR
        System.out.println("Bitwise XOR (^): " + (num1 ^ num2));        // XOR
        System.out.println("Bitwise Complement (~num1): " + (~num1));   // Complement
        System.out.println("Left Shift (num2 << 1): " + (num2 << 1));   // Left Shift
        System.out.println("Right Shift (num1 >> 1): " + (num1 >> 1));  // Right Shift 
        System.out.println("Unsigned Right Shift (num2 >>> 1): " + (num2 >>> 1));   //Unsigned Right Shift
    }


    //  Program to demonstrate operator precedence in Java. //
    private static void Question36()
    {
        int a = 10, b = 5, c = 2;
        
        // Without parentheses
        int result1 = a + b * c;
        System.out.println("a + b * c = " + result1);
        System.out.println("Multiplication is done first due to the BODMAS rule");
        
        // With parentheses
        int result2 = (a + b) * c;
        System.out.println("(a + b) * c = " + result2);
        System.out.println("Bracket is solved first due to the BODMAS rule");
    }


    //  Program to create a class with multiple constructors (constructor overloading). //
    private static void Question37()
    {
        Person onlyName = new Person("Vansh Bansal");
        System.out.println(onlyName);
        
        Person nameAndAge = new Person("Vansh Bansal", 20);
        System.out.println(nameAndAge);
        
        Person nameAgeAndSalary = new Person("Vansh Bansal", 20, 1200000);
        System.out.println(nameAgeAndSalary);
    }


    //  Program to demonstrate the use of a copy constructor in Java.   //
    private static void Question38()
    {
        Person normalPerson = new Person("Vansh Bansal", 20, 1200000);
        System.out.println(normalPerson);

        Person copiedPerson = new Person(normalPerson);
        System.out.println(copiedPerson);
    }


    //  Questions 39: Program that initializes class fields using a parameterized constructor.  //
    //  Almost all classes that I have created solve this question


    //  Question 40: Program to demonstrate the use of static and non-static methods.    //
    /*
    This whole "App.java" file is filled with static methods and even has some variables
    Most classes that I have created use non-static methods.
    */


    //  Question 41: Program to implement a singleton class in Java.    //
    //  Singleton Unclear, unable to complete question


    //  Question 42: Program to demonstrate multilevel inheritance in Java. //
    //  Solved in question 5


    //  Question 43: Program to show method overriding and the use of super to call the parent class method.    //
    /*
    Method Overriding has been implemented multiple times in different classes created for above questions
    super has been used in Question 5 and in other questions as well
    */ 


    //  Question 44: Program to implement an abstract class and override its methods in a subclass. //  
    //  An abstract class has been implemented in the file "Player.java" for solution of Question3


    //  Question 45: Program to demonstrate final classes and methods.  //
    // Same as question 10


    //  Program to show run-time polymorphism using dynamic method dispatch.    //
    private static void Question46()
    {
        /*
        To run this method, uncomment the 2 lines below and comment the "shapes" package imports
         */

        Shape myShape = new Shape();
        myShape.Draw();

        // myShape = new Circle();
        myShape.Draw();

        // myShape = new Rectangle();
        myShape.Draw();
    }


    //  Program to reverse a string without using built-in methods. //
    private static void Question47()
    {
        String s;
        try (Scanner sc = new Scanner(System.in))
        {
            s = sc.nextLine();    
        }
        String sReverse = "";
        
        for(int i = s.length()-1; i>=0; i--)
            sReverse += String.valueOf(s.charAt(i));

        System.out.println(sReverse);
    }


    //  Program to count the frequency of characters in a string.   //
    private static void Question48()
    {
        String s;
        try (Scanner sc = new Scanner(System.in))
        {
            s = sc.nextLine();
        }

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> charsCount = new HashMap<>();

        for(int i=0; i<chars.length; i++)
        {
            if(!charsCount.containsKey(chars[i]))
                charsCount.put(chars[i], 1);
            else
            {
                int newValue = charsCount.get(chars[i]) + 1;
                charsCount.put(chars[i], newValue);
            }
        }


        System.out.println(charsCount);
    }


    //  Question 49: Program to demonstrate the immutability of the String class.   //
    // Already done - Question 12
    

    //  Question 50: Program to check if a given string is a palindrome.    //
    // Already done - Question 22


    //  Program to split a string into words and print each word on a new line. //
    private static void Question51()
    {
        String s;
        try (Scanner sc = new Scanner(System.in))
        {
            s = sc.nextLine();
        }
        
        String[] arr = s.split(" ");
        
        for(String word : arr)
            System.out.println(word);
    }


    
    //          ASSIGNMENT - 2              //
    

    //  Create a Java package utilities that contains a class MathUtils with a method add(int a, int b) to return the sum of two numbers. Demonstrate the use of this package in another class. //
    private static void Question52()
    {
        int a,b;
        try(Scanner sc = new Scanner(System.in))
        {
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
        }

        int sum = MathUtils.Add(a,b);

        System.out.println(a + " + " + b + " = " + sum);
    }


    //  Define a package shapes containing an interface Shape with methods double area() and double perimeter(). Implement the interface in classes Circle and Rectangle.   //
    private static void Question53()
    {
        Circle myCircle = new Circle(2);
        System.out.println("Area of circle: " + myCircle.Area());
        System.out.println("Perimeter of circle: " + myCircle.Perimeter());

        Rectangle myRect = new Rectangle(2, 2);
        System.out.println("Area of rectangle: " + myRect.Area());
        System.out.println("Perimeter of rectangle: " + myRect.Perimeter());
    }


    //  Program to import classes from java.util and use ArrayList to store and display a list of integers. //
    private static void Question54()
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(7042);
        list.add(6969);
        list.add(420);
        list.add(69);
        list.add(0);
        list.add(747);
        list.add(22);
        list.add(9);
        list.add(32);
        list.add(5);
        list.add(88);

        System.out.println(list);
    }


    //  Define a functional interface Calculator with a method int compute(int a, int b). Use a lambda expression to provide implementation for addition, subtraction, and multiplication.  //
    private static void Question55()
    {
        Calculator add = (a, b) -> a+b;
        Calculator subtract = (a, b) -> a-b;
        Calculator multiply = (a, b) -> a*b;

        int num1, num2;
        try(Scanner sc = new Scanner(System.in))
        {
            num1 = Integer.parseInt(sc.nextLine());
            num2 = Integer.parseInt(sc.nextLine());
        }

        System.out.println(num1 + " + " + num2 + " = " + add.Compute(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract.Compute(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply.Compute(num1, num2));
    }


    //  Program to sort a list of strings in descending order using a lambda expression.    //
    private static void Question56()
    {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Keshav");
        list.add("Saksham");
        list.add("Aditya");
        list.add("Aryan");
        list.add("Parth");
        list.add("Vansh");
        list.add("Naman");
        list.add("Kashish");

        System.out.println(list);

        list.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println(list);
    }


    //  Implement a method reference in a program to find the square of a number using a static method. //
    // private static void Question57()
    // {
    //     HashMap<Integer, Integer> squareMap = new HashMap<>();
    //     squareMap.put(8, App::Square(8));
    // }

    // private static int Square(int a)    {   return (int)Math.pow(a, 2);  }
    
    // Unable to understand


    //  Program that demonstrates the difference between try-catch and try-catch-finally blocks by dividing two numbers and handling ArithmeticException.   //
    private static void Question58()
    {
        try{
            int out = 42 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Tried Division");
        }
    }


    //  Create a custom exception InvalidAgeException that is thrown when a user's age is less than 18. Write a program to demonstrate its use. //
    private static void Question59()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int age = Integer.parseInt(sc.nextLine());
            
            try{
                CheckAge(age);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
                
                // Uncomment these 2 lines to get answer for question 60
                // Logger logger = Logger.getLogger("AgeValidator");
                // logger.log(Level.SEVERE, "Invalid age entered: " + age, e);
            }
        }
    }

    private static void CheckAge(int age) throws InvalidAgeException
    {
        if(age < 18)
            throw new InvalidAgeException("A Minorrrrrr");
        
        System.out.println("Safe");
    }


    //  Question 60: 9.	Create a custom exception InvalidAgeException that is thrown when a user's age is less than 18. Handle the exception and log the error to a file using java.util.logging.   //
    // Covered in Question 59


    //  Demonstrate the use of throw and throws keywords in a program that calculates the factorial of a number. Throw an exception if the input number is negative //
    private static void Question61()
    {
        System.out.println(Factorial(-1));
    }
    

    
    //          ASSIGNMENT - 3              //


    // Implement a thread by extending the Thread class that prints numbers from 1 to 10 with a 1-second delay between each number.
    private static void Question62()
    {
        MyThread t = new MyThread();
        t.start();
    }


    // Implement a thread by implementing the Runnable interface that prints "Hello, World!" five times, each on a new line.
    private static void Question63()
    {
        RunnableImpl runnable = new RunnableImpl();
        Thread t = new Thread(runnable);
        
        t.start();
    }


    // Create a program that creates two threads. The first thread should print "Thread 1" every 1 second, and the second thread should print "Thread 2" every 2 seconds.
    private static void Question64()
    {
        MyThread2 t1 = new MyThread2(1);
        MyThread2 t2 = new MyThread2(2);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }


    // Create a Java program that starts three threads with different priorities and prints a message from each thread to show how thread priorities affect execution.
    private static void Question65()
    {
        MyThread3 t1 = new MyThread3("Minimum Priority Thread", Thread.MIN_PRIORITY);
        MyThread3 t2 = new MyThread3("Normal Priority Thread", Thread.NORM_PRIORITY);
        MyThread3 t3 = new MyThread3("Maximum Priority Thread", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        /*Ideally this code should print:
            Maximum Priority Thread
            Normal Priority Thread
            Minimum Priority Thread

        But depending on OS and JVM, the order can be different
        */
    }


    // Write a Java program to demonstrate how to create a daemon thread. The daemon thread should print "Daemon Thread Running" every 1 second, and the main thread should print "Main Thread Running" every 2 seconds.
    private static void Question66()
    {
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true); 
        dt.start();

        for (int i=0; i<5; i++)
        {
            System.out.println("Main Thread Running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


    // Create a Java program where two threads try to update the same bank account balance. Use synchronization to ensure the balance is updated correctly and avoid race conditions.
    private static void Question67()
    {
        BankAccount acc = new BankAccount(1000);

        DepositThread t1 = new DepositThread(acc, 500, "Thread 1");
        DepositThread t2 = new DepositThread(acc, 700, "Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(acc);
    }


    // Modify the above program (bank account example) to use a synchronized block instead of a synchronized method.
    private static void Question68()
    {
        BankAccount acc = new BankAccount(1000);

        DepositThread t1 = new DepositThread(acc, 500, "Thread 1");
        DepositThread t2 = new DepositThread(acc, 700, "Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(acc);
    }


    // Write a program that simulates a deadlock condition. Create two threads that attempt to lock two different resources and cause a deadlock.
    private static void Question69()
    {
        Resource A = new Resource("Resource A");
        Resource B = new Resource("Resource B");

        Thread t1 = new Thread(new Task(A, B), "Thread 1");
        Thread t2 = new Thread(new Task(B, A), "Thread 2"); // Reversed order

        t1.start();
        t2.start();
    }


    // Implement a producer-consumer scenario where one thread (producer) produces data and another thread (consumer) consumes it. Use the wait() and notify() methods for synchronization.
    private static void Question70()
    {
        SharedBuffer buffer = new SharedBuffer();
        Producer prod = new Producer(buffer);
        Consumer cons = new Consumer(buffer);

        System.out.println("Press 'ctrl + c' to stop running");
        prod.start();
        cons.start();
    }


    // Write a program that safely stops a thread using a flag. The thread should print numbers from 1 to 100, and the program should be able to stop the thread by setting the flag to false.
    private static void Question71()
    {
        NumberPrinter np = new NumberPrinter();
        np.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        np.stopThread();
    }


    // Write a program that reads a text file using the FileInputStream and prints the contents to the console.
    private static void Question72()
    {
        String filePath = "..//res//sample.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            
            int data;
            while ((data = fis.read()) != -1)
            {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }


    // Create a program that writes a string into a file using the FileOutputStream. Ensure that the program writes the string "Java I/O Streams Example" to a file named output.txt.
    private static void Question73()
    {
        //  Before running this code, delete output.txt //

        String data = "Java I/O Streams Example";
        String destFilePath = "..//res//output.txt";

        try (FileOutputStream fos = new FileOutputStream(destFilePath)) {

            fos.write(data.getBytes());
            System.out.println("Data successfully written in " + destFilePath);

        } catch (IOException e) {
            System.out.println("Error writing in file: " + e.getMessage());
        }
    }    


    // Write a program that reads a file using the FileReader class and prints the contents of the file to the console.
    private static void Question74()
    {
        String filePath = "..//res//sample.txt";

        try (FileReader fr = new FileReader(filePath)) {

            int character;
            while ((character = fr.read()) != -1)
                System.out.print((char) character);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }


    // Write a program that writes a string to a file using the FileWriter class. The string should be written to a file named example.txt.
    private static void Question75()
    {
        //  Before running this code, delete output.txt //

        String filePath = "..//res//output.txt";
        String content = "Java I/O Streams Example using FileWriter.";

        try (FileWriter fw = new FileWriter(filePath)) {

            fw.write(content); // Writing to file
            System.out.println("Successfully written to file!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }


    // Modify the previous FileReader and FileWriter examples to use BufferedReader and BufferedWriter respectively to read from and write to the file, improving performance.
    private static void Question76()
    {
        //  Before running this code, delete output.txt //

        // Reading
        String inFilePath = "..//res//sample.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inFilePath))) {

            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
    
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Writing
        String outFilePath = "..//res//output.txt";
        String content = "Java I/O Streams Example using BufferedWriter.";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))) {

            bw.write(content);
            System.out.println("File written successfully using BufferedWriter.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }


    // Write a program that checks if a file exists in the system. If the file does not exist, create the file using the File class.
    private static void Question77()
    {
        //  Run this code once with "exists.txt" present in res folder and once after deleting it   //

        String filePath = "..//res//exists.txt";

        File file = new File(filePath);

        if (file.exists())
            System.out.println("File already exists :(");
        else
        {
            try {

                if (file.createNewFile())
                    System.out.println("File created successfully: ");
                else
                    System.out.println("File creation failed.");
                
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


    // Write a Java program that lists all files in a directory specified by the user. The program should handle exceptions appropriately.
    private static void Question78()
    {
        String dirPath = "..//res";
        
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory())
        {
            File[] files = directory.listFiles();

            if (files != null && files.length > 0)
            {
                System.out.println("Files in directory: " + dirPath);

                for (File file : files)
                    System.out.println(file.getName());
            }
            else
                System.out.println("The directory is empty.");
        }
        else
            System.out.println("Invalid directory path or the directory does not exist.");
    }


    // Create a program that copies the contents of one file to another using byte streams (FileInputStream and FileOutputStream).
    private static void Question79()
    {
        //  Make sure that "sameple-copy.txt" is empty before running this code //

        String sourceFile = "..//res//sample.txt";
        String destinationFile = "..//res//sample-copy.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile))
        {
            int byteData;
            while ((byteData = fis.read()) != -1)
                fos.write(byteData);

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }

    // Write a Java program that deletes a file from the system using the File class.
    private static void Question80()
    {
        //  Check if there is a "delete-this.text" file present in res folder, if not make sure to create it before running this code   //

        String fileName = "..//res//delete-this.txt";

        File file = new File(fileName);

        if (file.exists())
        {
            if (file.delete())
                System.out.println("File deleted successfully!");    
            else
                System.out.println("Failed to delete the file.");
        }
        else
            System.out.println("File does not exist.");
    }


    // Create a program that uses the RandomAccessFile class to read and write to specific positions within a file. The program should write some data at the beginning of the file, then overwrite part of it later.
    private static void Question81()
    {
        String fileName = "..//res//random-access.txt";

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {

            raf.writeBytes("Hello, this is a test file!");

            raf.seek(7);
            raf.writeBytes("UPDATED");

            raf.seek(0);
            String content = raf.readLine();

            System.out.println("Updated File Content: " + content);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


    // Write a program that demonstrates the use of Math.random(), Math.abs(), and Math.pow() from the java.lang package
    private static void Question82()
    {
        System.out.println("Random value (0 to 1): "  + Math.random());
        System.out.println("Absolute value of -10: "  + Math.abs(-10));
        System.out.println("2 raised to power of 3: " + Math.pow(2,3));
    }


    // Create a program that uses the ArrayList class from the java.util package. Add 10 integers to the list, sort the list, and print the sorted list.
    private static void Question83()
    {
        List<Integer> nums = new ArrayList<>();

        for(int i=0; i<10; i++)
        {
            double newNum = Math.random() * 100;
            nums.add((int)newNum);
        }

        System.out.println("Original List: " + nums);
        Collections.sort(nums);
        System.out.println("Sorted List: " + nums);
    }


    // Write a program that uses HashMap from the java.util package to store key-value pairs. The keys should be employee IDs, and the values should be employee names.
    private static void Question84()
    {
        Map<Integer, String> empMap = new HashMap<>();

        empMap.put(1, "Vansh");
        empMap.put(2, "Naman");
        empMap.put(3, "Keshav");
        empMap.put(4, "Saksham");
        empMap.put(5, "Aryan");
        empMap.put(6, "Aditya");
        empMap.put(7, "Kashish");
        empMap.put(8, "Parth");
        empMap.put(9, "Sanskar");

        double pickOne = Math.random() * 10;
        System.out.println("Employee ID: " + (int)pickOne);
        System.out.println("Employee Name: " + empMap.get((int)pickOne));
    }


    // Write a program that uses the Date and Calendar classes to display the current date and time.
    private static void Question85()
    {   
        // Date Class
        Date currentDate = new Date();
        System.out.println("Current Date and Time (Date class): " + currentDate);

        // Calendar class
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date and Time (Calendar class): " + calendar.getTime());
        
        int year  = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day   = calendar.get(Calendar.DAY_OF_MONTH);
        int hour  = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Formatted Date: " + day + "/" + month + "/" + year);
        System.out.println("Formatted Time: " + hour + ":" + minute + ":" + second);
    }


    // Create a program that uses the Pattern and Matcher classes from the java.util.regex package to check if a given string is a valid email address.
    //------------------------------------
    private static void Question86()
    {
        String[] emails = {
            "test@example.com",
            "user123@gmail.com",
            "hello.world@domain.co",
            "invalid_email@com",
            "wrong@.com",
            "no_at_symbol.com"
        };

        for (String email : emails)
            System.out.println(email + " is " + (isValidEmail(email) ? "Valid" : "Invalid"));
    }

    private static boolean isValidEmail(String email)
    {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        return matcher.matches();
    }
    //------------------------------------
}