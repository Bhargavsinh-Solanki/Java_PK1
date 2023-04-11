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

// Java Strings

        String txt = "ABCDEFGHIJKLMNOPQRTSUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase()); //outputs everthing in uppercase
        System.out.println(txt.toLowerCase()); //outputs everything in lowercase


//Finding a character in the string

        String pqr = "Please locate where 'locate' occurs";
        System.out.println(pqr.indexOf("locate")); //output 7 as the java counts the value from 0


//String Concatenation

        String aName = "Bhargav";
        String bName = "Solanki";
        System.out.println(aName + " " + bName);
        System.out.println(aName.concat(bName));

        /*
         * /n for newline
         * /r for Carriage return
         * /t for Tab
         * /b Backspace
         * /f for Form feed
         */

        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);

        //Java Boolean Example
        int myAge = 25;
        int votingAge = 18;
        //System.out.println(myAge >= votingAge);
        
        //If else condition
        if (myAge >= votingAge){
            System.out.println("Old enough to vote");
        }
        else {
            System.out.println("Not old enough to vote");
        } 

//The else if statement
/*
 * if (condition1){
 *  //block of the code to be executed if condition1 is true
 * } else if (condition2) {
 *  //block of the code to be executed if the condition2 is true 
 * } else {
 *  // block of code to be executed if the condition1 is false and condition2 is false
 * }
 */ 
 
 //short hand if else : variable = (condition) ? expressionTrue : expressionFalse;
        int time = 20;
        String result = (time < 18)? "Good day." : "Good evening.";
        System.out.println(result); 

//Java Switch
// switch(expression) {
//     case x:
//       // code block
//       break;
//     case y:
//       // code block
//       break;
//     default:
//       // code block
//   }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: //if there is no case match to run, default will be executed.
                System.out.println("Looking forward to the weekend");
            } //output "Thursday" (day 4)


//While Loop

        /*
         * while (condition)
         * //code block to be executed
         */

        int i = 0;
        while (1 < 5) {
            System.out.println(i);
            i++;
        }

        }
}