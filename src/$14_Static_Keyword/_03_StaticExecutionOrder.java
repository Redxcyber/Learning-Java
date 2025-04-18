package $14_Static_Keyword;

public class _03_StaticExecutionOrder {
    //static variable
    static int count = initialiseVar();

    //static block
    static {
        System.out.println("Static block executed...");
    }

    //static method
    static int initialiseVar(){
        System.out.println("Initialising static variable");
        return 0;
    }
    static void staticMethod(){
        System.out.println("Inside Static method");
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Inside main method");
        staticMethod();

    }
}

