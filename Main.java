import java.util.Scanner;  // Import the Scanner class

class Log {
    // public static void Log(String[] args) {
    public static void main() {
        System.out.println("main method of Log class.");
        //Tip: main method only executes on first class run only.
    }

    public Log() {
        // LEGIT CONSTRUCTOR
        // constructor method doesn't have any param signature,
        // so class must be invoked without paramers, yikes!
        System.out.println("noParams constructor.");
    }

    public Log(int myint) {
        // LEGIT CONSTRUCTOR
        System.out.println("intParam constructor.");
    }

    public Log(Boolean mybool) {
        // LEGIT CONSTRUCTOR
        System.out.println("booleanParam constructor.");
    }

    public Log(String str) {
        // LEGIT CONSTRUCTOR
        System.out.println("stringParam constructor.");

    }

    public void Log(String str) {
        // NOT LEGIT CONSTRUCTOR, coz constructors can't return
        // values as we have return as void.
        System.out.println("void method" + " => " + str);
    }

    public static void log(String str) {
        // static methods can be called without
        // creating the isntance of the class, yikes!!
        System.out.println("static void constructor method" + "  => " + str);
    }

    static void Log(Boolean s) {
        System.out.println(String.valueOf(true));
    }


}

public class Main {
    // Below method works directly via calling log() in main method.
    static void log(String s) {
        System.out.println(s);
    }
    // Below method works directly via calling log() in main method.
    static void log(Boolean s) {
        System.out.println(String.valueOf(true));
    }

    public static void main(String[] args) {
        Log LogInstance = new Log();
        LogInstance.main();
        LogInstance.Log("My message.");

        LogInstance.Log("Breakkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk.");
        Log log2 = new Log(3);
        Log log3 = new Log(true);
        Log log4 = new Log("sometext");
        LogInstance.Log("Breakkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk.");


        Log.main();// Calling static methods directly,coz they don't require class instantiation.
        Log.log("Boom");// Calling static methods directly,coz they don't require class instantiation.
        // log("Hello, world!!");// works!
        // log(true);//works now!
        // log("Enter username");
        // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // String userName = myObj.nextLine();  // Read user input
        // log("Username is: " + userName);  // Output user input
    }
}

// Learnings:
// log("Hello", "world!");//Doesn't work at all.
// System.out.println("c", "s");//Doesn't work at all.


// Paragraph:
// In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.
// It is a special type of method which is used to initialize the object.