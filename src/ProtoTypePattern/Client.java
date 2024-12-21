package ProtoTypePattern;

public class Client {

    public static void main(String[] args) {
        // Create a Document with Pages
        Document originalDocument = new Document("Original Document");
        originalDocument.addPage(new Page("Page 1: Introduction"));
        originalDocument.addPage(new Page("Page 2: Content"));

        // Clone the Document
        Document clonedDocument = (Document) originalDocument.clone();

        // Modify the clone
        clonedDocument.setTitle("Cloned Document");
        clonedDocument.getPageList().get(0).setPageName("Page 1: Updated Introduction");

        // Print both documents
        System.out.println("Original Document:");
        System.out.println(originalDocument);

        System.out.println("Cloned Document:");
        System.out.println(clonedDocument);
    }
}
