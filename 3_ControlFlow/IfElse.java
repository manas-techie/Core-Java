public class IfElse {
    public static void main(String[] args) {
        int age = 21;

        if (age < 18) {
            System.out.println("Chiildren");
        } else if (age >= 18 && age <= 35) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }

        // Nested
        int yearOfStudy = 3;
        boolean knowsDataStructures = true;

        // Checking eligibility for a Big Tech software engineering internship
        if (yearOfStudy == 3) {
            System.out.println("Status: Eligible year for pre-final internships.");

            // Nested check: only evaluated if the outer 'if' is true
            if (knowsDataStructures) {
                System.out.println("Action: Proceed to technical interview rounds.");
            } else {
                System.out.println("Action: Must clear the DSA screening first.");
            }

        } else {
            System.out.println("Status: Apply for early-career or new grad roles instead.");
        }
    }

}
