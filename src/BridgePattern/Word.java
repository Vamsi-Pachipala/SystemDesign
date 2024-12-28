package BridgePattern;

public class Word  extends Document{

    Word(ViewMode viewMode) {
        super(viewMode);
    }
    @Override
    void renderDocument(String fileType) {
        viewMode.renderDocument(fileType);
    }
}
