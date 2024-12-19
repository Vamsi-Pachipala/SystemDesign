package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent{

    String folderName;
    List<FileComponent> fileComponents;

    public Folder(String folderName) {
        this.folderName = folderName;
        fileComponents = new ArrayList<>();
    }

    void add(FileComponent fileComponent){
        fileComponents.add(fileComponent);
    }
    void remove(FileComponent fileComponent){
        fileComponents.remove(fileComponent);
    }
    @Override
    public void display() {
        System.out.println(" Folder :" + folderName);

        for(FileComponent fileComponent : fileComponents){
            fileComponent.display();
        }
    }
}
