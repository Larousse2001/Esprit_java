package exception;

import java.io.*;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            // Open the Input file
            File inputFile = new File("Sample.jpg");
            // Open the Output file
            File outputFile1 = new File("Output1.jpg");

            // Get file handlers in Byte Stream format
            FileInputStream in1 = new FileInputStream(inputFile);
            FileOutputStream out1 = new FileOutputStream(outputFile1);

            int c1;

            while ((c1 = in1.read()) != -1) {
                out1.write(c1);
            }

            // Close the files
            in1.close();
            out1.close();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
