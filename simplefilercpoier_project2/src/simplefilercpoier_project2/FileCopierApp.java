package simplefilercpoier_project2;

import java.io.IOException;
import java.nio.file.*;

public class FileCopierApp {
    public static void main(String[] args) {
        FileCopier fileCopier = new FileCopier();
        Path source = Paths.get("source.txt");
        Path target = Paths.get("target.txt");

        try {
            // Create a source file for demonstration
            Files.writeString(source, "This is a test file.");

            // Copy the file
            fileCopier.copyFile(source, target);

            // Verify the copy
            if (Files.exists(target) && Files.readString(source).equals(Files.readString(target))) {
                System.out.println("File copied successfully.");
            } else {
                System.out.println("File copy failed.");
            }

            // Clean up
            Files.deleteIfExists(source);
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
