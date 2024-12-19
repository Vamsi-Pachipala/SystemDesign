package CompositeDesignPattern;

public class Client {

    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");

        Folder folder1 = new Folder("folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("folder3");
        folder2.add(file3);
        folder2.add(file4);

        Folder root = new Folder("root");
        root.add(folder1);
        root.add(folder2);

        root.display();

    }
}
