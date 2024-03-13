package KW10.Iteration;

public class IterationDemo {
    // Teil a.) (for-Schleife)
    /**
     * Prints numbers from 0 to 10 using a for loop.
     * @return void
     */
    public static void printNumbersFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Teil b.) (while-Schleife)
    public static void printNumbersWhile() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // Teil b.) (do-while-Schleife)
    public static void printNumbersDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    // Teil c.)
    public static void increaseFloat() {
        float value = 0.9f;
        int iterations = 0;
        while (value < 1.0f) {
            value += 0.000025f;
            iterations++;
        }
        System.out.println("End value: " + value);
        System.out.println("Iterations: " + iterations);
    }

    // Teil e.)
    public static void increaseFloatWithForLoop() {
        float value = 0.9f;
        int iterations = 4000;
        for (int i = 0; i < iterations; i++) {
            value += 0.000025f;
        }
        System.out.println("End value: " + value);
    }

    // Teil f.)
    /**
     * Prints a box with the given width and height.
     * @param width
     * @param height
     */
    public static void printBox(final int width, final int height) {
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("#");
                }
            } else {
                System.out.print("#");
                for (int j = 0; j < width - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // Teil g.)
    public static void printSwissCross(final int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size / 2 || j == size / 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Testen der Methoden
        System.out.println("Printing numbers with for loop:");
        printNumbersFor();
        System.out.println("\nPrinting numbers with while loop:");
        printNumbersWhile();
        System.out.println("\nPrinting numbers with do-while loop:");
        printNumbersDoWhile();
        
        System.out.println("\nIncreasing float with while loop:");
        increaseFloat();
        
        System.out.println("\nIncreasing float with for loop:");
        increaseFloatWithForLoop();
        
        System.out.println("\nPrinting box:");
        printBox(10, 4);
        
        System.out.println("\nPrinting Swiss cross:");
        printSwissCross(12);
    }
}
