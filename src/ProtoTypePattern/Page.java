package ProtoTypePattern;

public class Page implements ProtoType {

    String pageName;

    public Page(String pageName) {
        this.pageName = pageName;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @Override
    public Object clone() {
        try {
            return super.clone(); // Shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString(){
        return "Page{content= '" + pageName + "'}";
    }
}
