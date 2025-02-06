public class File extends FileSystemComponent {
    private final Directory parent;

    public File(String name, Directory parent) {
        super(name);
        this.parent = parent;
    }

    public Directory getParent() {
        return parent;
    }

    @Override
    public void display() {
        System.out.println("  " + name);
    }
}
