public class TypeCasting {
    public static void main(String[] args) {
        // casting is take a variable of one type and convert it into another type
        // implicite: automatic - happen when converting a smaller datatype to a larger datatype
        int myInt = 9;
        double myDouble = myInt;
        Double myDouble2 = myDouble;
        System.out.println(((Object) myDouble).getClass().getSimpleName());

        if (myDouble2 instanceof Double) {
            System.out.println("Its a double");
        }

        // Explicite type casting

        double myDouble3 = 9.34;
        int myNumber = (int) myDouble3;
    }

}
