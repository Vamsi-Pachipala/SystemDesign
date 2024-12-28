package BridgePattern;

public class DarkMode implements ViewMode{


    @Override
    public void renderDocument(String fileType) {
        System.out.println("Rendering "+fileType + " In Dark Mode");
    }
}
