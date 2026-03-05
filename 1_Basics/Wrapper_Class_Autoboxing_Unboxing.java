import java.util.ArrayList;

public class Wrapper_Class_Autoboxing_Unboxing {
    public static void main(String[] args) {
        // Primitives are fast, but Java's Collections Framework (like ArrayList or HashMap) can only store Objects, not primitives. To bridge this gap, Java provides "Wrapper Classes" that encapsulate a primitive inside an object.

        // Wrapper Classes: Integer (for int), Double (for double), Character (for char), Boolean (for boolean), etc.
            
        // Autoboxing: The automatic conversion the Java compiler makes between the primitive types and their corresponding object wrapper classes.

        ArrayList<Integer> number = new ArrayList<>();
        number.add(5); //Autoboxing

        // unboxing
        int myNumber = number.get(0);
        System.out.println(myNumber);
    }
    
}
