public class DeleteFileCommand implements FileOperation {
    private final File file;

    public DeleteFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        Directory parent = file.getParent();
        parent.remove(file);
        System.out.println("Deleted " + file.getName());
    }
}
