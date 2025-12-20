public class SpringSeason {

     // Method to check if given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {

        // Spring Season: March 20 to June 20
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Check if two command line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Read month and day from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call method to check spring season
        boolean isSpring = isSpringSeason(month, day);

        // Display result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

   
}
