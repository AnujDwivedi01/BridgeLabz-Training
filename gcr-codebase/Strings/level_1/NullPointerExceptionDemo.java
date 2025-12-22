// Java program for null pointer exception

public class NullPointerExceptionDemo {

    // method to generate NullPointerException
    public static void generateException() {
        String text = null;

        // this line will throw NullPointerException
        System.out.println(text.length());
    }

    // method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled.");
        }
    }

    public static void main(String[] args) {

        // Calling method that generates exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated in generateException() method.");
        }

        // Calling method that handles exception
        handleException();
    }
}
