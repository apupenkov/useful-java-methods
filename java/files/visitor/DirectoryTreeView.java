package files.visitor;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class DirectoryTreeView {

    private void viewFile(ClassLoader classLoader, String basePackage) {
        Path path = null;
        try {
            path = Paths.get(Objects.requireNonNull(classLoader.getResource(basePackage.replace(".", "/"))).toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        FileVisitorUtil fileVisitor = new FileVisitorUtil(basePackage);
        try {
            Files.walkFileTree(Objects.requireNonNull(path), fileVisitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
