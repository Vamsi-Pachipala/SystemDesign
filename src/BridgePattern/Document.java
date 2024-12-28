package BridgePattern;

public abstract class Document {

    ViewMode viewMode;

    Document(ViewMode viewMode){
        this.viewMode = viewMode;
    }
    abstract void renderDocument(String fileType);
}
