package BridgePattern;



public class PDF extends Document {



    PDF(ViewMode viewMode) {
        super(viewMode);
    }

    @Override
    void renderDocument(String fileType) {
        viewMode.renderDocument(fileType);
    }
}
