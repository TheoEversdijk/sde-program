public class FileOperationFactory {
    public static FileOperation getOperation(String type, File file) {
        return switch (type.toLowerCase()) {
            case "open" -> new OpenFileCommand(file);
            case "delete" -> new DeleteFileCommand(file);
            case "rename" -> new RenameFileCommand(file);
            default -> throw new IllegalArgumentException("Unknown command.");
        };
    }
}
