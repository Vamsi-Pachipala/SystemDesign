package BridgePattern;

public class Client {
    public static void main(String[] args) {
        Document renderPdfInDark = new PDF(new DarkMode());
        renderPdfInDark.renderDocument("PDF");

        Document renderInLight = new PDF(new LightMode());
        renderInLight.renderDocument("PDF");
    }
}
