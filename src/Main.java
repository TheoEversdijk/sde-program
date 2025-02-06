import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("book1.xlsx", root);
        File file2 = new File("photo.png", root);

        root.add(file1);
        root.add(file2);

        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            root.display();

            if (root.getChildren().isEmpty()) {
                System.out.println("  No files found.");
            }

            System.out.print("Enter 'open', 'delete', 'rename' or 'exit': ");
            command = scanner.nextLine();

            if (!command.equals("open") && !command.equals("delete") &&
                    !command.equals("rename") && !command.equals("exit")) {
                System.out.println("Unknown command.");
                continue;
            }

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter file name: ");
            String fileName = scanner.nextLine();

            File targetFile = null;
            for (FileSystemComponent component : root.getChildren()) {
                if (component instanceof File && component.getName().equalsIgnoreCase(fileName)) {
                    targetFile = (File) component;
                    break;
                }
            }

            if (targetFile != null) {
                FileOperation operation = FileOperationFactory.getOperation(command, targetFile);
                operation.execute();
            } else {
                System.out.println("File not found.");
            }
        }

        scanner.close();
    }
}
