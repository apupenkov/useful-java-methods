package files.visitor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FileVisitorUtil extends SimpleFileVisitor<Path> {

    private final Map<String, Object> singletons = new HashMap<>();
    private String basePackage;

    public FileVisitorUtil(String basePackage) {
        this.basePackage = basePackage;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
        // you code
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        // you code
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)
            throws IOException {
        // you code
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        // you code
        return FileVisitResult.CONTINUE;
    }

    public Map<String, Object> getObjectsOfMap() {
        return singletons;
    }
}
