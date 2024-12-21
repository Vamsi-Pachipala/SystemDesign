package ProtoTypePattern;

import java.util.ArrayList;
import java.util.List;

public class Document implements ProtoType{

    private String title;
    private List<Page> pageList;

    public Document(String title) {
        this.title = title;
        pageList = new ArrayList<>();
    }

    public  void addPage(Page page){
        pageList.add(page);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Page> getPageList() {
        return pageList;
    }
    @Override
    public Object clone() {
        try {
            Document clonedDocument = (Document)super.clone(); // shallow copy for primitive type;
            clonedDocument.pageList = new ArrayList<>();
            for (Page page : pageList){
                clonedDocument.pageList.add((Page) page.clone()); // Clone each page
            }
            return clonedDocument;
        }
        catch (CloneNotSupportedException cloneNotSupportedException){
            return null;
        }
    }
    @Override
    public String toString() {
        return "Document{title='" + title + "', pages=" + pageList + "}";
    }
}
