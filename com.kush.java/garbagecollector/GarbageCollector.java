package garbagecollector;

public class GarbageCollector {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Print initial memory usage
        System.out.println("Initial Memory Usage: " + runtime.totalMemory() + " bytes");

        // Create a large number of objects to increase memory usage
        for (int i = 0; i < 100000; i++) {
            String[] temp = new String[1000];
        }

        // Print memory usage after object creation
        System.out.println("Memory Usage After Object Creation: " + runtime.totalMemory() + " bytes");

        // Suggest garbage collection
        System.gc();

        // Pause to allow garbage collection to complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print memory usage after garbage collection
        System.out.println("Memory Usage After Garbage Collection: " + runtime.totalMemory() + " bytes");
    }
}
