public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("I am learning java.");
        System.out.println("It is awesome");
        System.out.println(3);
        System.out.println(358);
        System.out.println(500000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);

        //This is a comment. This is a single line comment

        /*
         * This is mutiline comment!
         */

        //type variableName = value; (Syntax for delaring variable)
        String name = "Bhargav";
        System.out.println("Hello " + name);

        int myNum = 15;
        System.out.println(myNum);

        
        int myTum;
        myTum = 15;
        System.out.println(myTum);

        int myTurn = 15;
        myTurn = 20; //myTurn is now 20
        System.out.println(myTurn);

        // final int abc = 15;
        // abc = 20;
        // this will generate error: cannot assign a value to a final variable 


        int xyz = 5; // primitive data type
        float myFloatNum = 5.99f; //primitive data type
        char myLetter = 'D'; //primitive data type
        boolean myBool = true; //primitive datatype
        String mytext = "Hello"; //String is non primitive data type

        System.out.println(xyz);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(mytext);
        

        String firstName = "Bhargav";
        String lastName = "Solanki";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);


/*
 * Integer Types
 * - Byte -128 to 127
 * - short -32768 to 32767
 * - int 
 * - long
 * 
 * Floating point types
 * - float , end the values with f
 * - double , end the values with d
 * double has precision of 15 digits whereas float has just 5-6
 * so it's better to use double
 */

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        
        //char data type is used to store a single character.

        char myGrade = 'B';
        System.out.println(myGrade);

        //ASCII values can be used to display certain characters

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);


        //Strings

        String greeting = "Hello World";
        System.out.println(greeting);

// Java Operators

        int x = 100 + 50;
        --x; //decrement operator
        System.out.println(x);
        ++x;
        System.out.println(x);
        }
}