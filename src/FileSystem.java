public class FileSystem {
    private static FileSystem instance;
    private final Directory root;

    private FileSystem() {
        root = new Directory("root");
    }

    public static synchronized FileSystem getInstance() {
        if (instance == null) {
            instance = new FileSystem();
        }
        return instance;
    }

    public Directory getRoot() {
        return root;
    }
}
