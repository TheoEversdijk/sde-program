import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name + ": ");
        for (FileSystemComponent component : children) {
            component.display();
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public List<FileSystemComponent> getChildren() {
        return children;
    }
}
