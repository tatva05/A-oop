package simplefilercpoier_project2;

import java.io.IOException;
import java.nio.file.*;

public class FileCopier {

    public void copyFile(Path source, Path target) throws IOException {
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
