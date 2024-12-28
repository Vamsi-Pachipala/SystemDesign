package BridgePattern;

public class LightMode implements ViewMode{

    @Override
    public void renderDocument(String fileType) {
        System.out.println("Rendering "+fileType + " In Light Mode");
    }
}
