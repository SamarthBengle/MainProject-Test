/**
 * Hello World Example for MainProject-Test
 * This file will be automatically synced to MainProject-Examples-Test
 */
public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld demo = new HelloWorld();
        demo.printGreeting();
        demo.demonstrateAutoSync();
    }

    /**
     * Print a friendly greeting
     */
    public void printGreeting() {
        System.out.println("Hello from MainProject-Test Example!");
        System.out.println("This is a basic Hello World demonstration.");
    }

    /**
     * Demonstrate that this example was automatically synced
     */
    public void demonstrateAutoSync() {
        System.out.println("\n=== Auto-Sync Demo ===");
        System.out.println("This example was automatically synced from MainProject-Test!");
        System.out.println("Any new examples added to sootup.examples/ will be synced automatically.");

        // Simulate some basic processing
        String message = generateMessage();
        System.out.println("Generated message: " + message);
    }

    private String generateMessage() {
        return "SootUp example sync is working perfectly!";
    }
}