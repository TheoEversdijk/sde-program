public class OpenFileCommand implements FileOperation {
    private final File file;

    public OpenFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        System.out.println("Opened " + file.getName());
    }
}
