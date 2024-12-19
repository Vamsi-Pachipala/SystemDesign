package CompositeDesignPattern;

public class File implements FileComponent{

    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("   :fileName: "+fileName);
    }
}
