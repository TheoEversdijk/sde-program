import java.util.Scanner;

public class RenameFileCommand implements FileOperation {
    private final File file;

    public RenameFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine().trim();

            if (newName.isEmpty()) {
                System.out.println("Please enter a valid name.");
            } else {
                file.name = newName;
                System.out.println("File renamed to: " + newName);
                break;
            }
        }
    }
}
