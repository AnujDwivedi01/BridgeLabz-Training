// java program fir football team height status

public class FootballTeamHeightStatus {

    // Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        // Array to store heights of 11 players
        int[] heights = new int[11];

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        // Display player heights
        System.out.println("Player Heights (cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nResults:");
        System.out.println("Shortest Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Height: " + findTallestHeight(heights) + " cm");
        System.out.println("Mean Height: " + findMeanHeight(heights) + " cm");
    }
}
