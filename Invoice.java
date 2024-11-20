
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Invoice {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\wahid\\IdeaProjects\\TabMid\\src\\invoice.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Ice Cream Shop Invoice");
            writer.newLine();
            writer.write("Subtotal:");
            writer.write("Tax:");
            writer.write("Total Due Amount:");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



