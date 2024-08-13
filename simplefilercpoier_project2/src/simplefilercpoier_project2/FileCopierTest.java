package simplefilercpoier_project2;

import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class FileCopierTest {

    private FileCopier fileCopier;
    private Path sourceSmall;
    private Path targetSmall;
    private Path sourceLarge;
    private Path targetLarge;
    private Path invalidSource;
    private Path targetInvalid;

    @BeforeEach
    void setUp() throws IOException {
        fileCopier = new FileCopier();

        sourceSmall = Files.createTempFile("sourceSmall", ".txt");
        targetSmall = Paths.get(sourceSmall.toString().replace("sourceSmall", "targetSmall"));
        Files.writeString(sourceSmall, "Small file content");

        sourceLarge = Files.createTempFile("sourceLarge", ".txt");
        targetLarge = Paths.get(sourceLarge.toString().replace("sourceLarge", "targetLarge"));
        Files.writeString(sourceLarge, "Large file content".repeat(10000));

        invalidSource = Paths.get("nonexistentfile.txt");
        targetInvalid = Paths.get("nonexistentdirectory/target.txt");
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(sourceSmall);
        Files.deleteIfExists(targetSmall);
        Files.deleteIfExists(sourceLarge);
        Files.deleteIfExists(targetLarge);
    }

    @Test
    void testCopySmallFile() throws IOException {
        fileCopier.copyFile(sourceSmall, targetSmall);
        assertTrue(Files.exists(targetSmall));
        assertEquals(Files.readString(sourceSmall), Files.readString(targetSmall));
    }

    @Test
    void testCopyLargeFile() throws IOException {
        fileCopier.copyFile(sourceLarge, targetLarge);
        assertTrue(Files.exists(targetLarge));
        assertEquals(Files.readString(sourceLarge), Files.readString(targetLarge));
    }

    @Test
    void testHandleInvalidInput() {
        IOException exception = assertThrows(IOException.class, () -> {
            fileCopier.copyFile(invalidSource, targetInvalid);
        });
        assertTrue(exception.getMessage().contains("nonexistentfile.txt"));
    }
}
