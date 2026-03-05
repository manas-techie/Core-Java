
public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = 3; // Let's say 1 = Monday, 3 = Wednesday

        // Selecting a target muscle group for a structured gym routine
        switch (dayOfWeek) {
            case 1:
                System.out.println("Workout: Chest and Triceps");
                break; // Exits the switch block immediately
            case 2:
                System.out.println("Workout: Back and Biceps");
                break;
            case 3:
                System.out.println("Workout: Legs and Core");
                break;
            case 4:
                System.out.println("Workout: Shoulders");
                break;
            case 5:
            case 6:
            case 7: // Grouping cases together (intentional fall-through)
                System.out.println("Workout: Active Rest / Light Cardio");
                break;
            default:
                // Acts like the 'else' block
                System.out.println("Invalid day entered.");
        }


        // Enchanced Switch expresion
        String tech = "Backend";

        String TechStack  = switch(tech){
            case "FrontEnd" -> "React";
            case "Backend" -> {
                //multiple line
                System.out.println("hello");
                yield "Node js";
            }
            default -> "General Computer";
        };

        System.out.println(TechStack);
    }

}
