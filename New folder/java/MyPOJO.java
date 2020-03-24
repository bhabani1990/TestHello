import java.util.List;

public class MyPOJO {
    public StandardHeader getStandardHeader() {
        return StandardHeader;
    }

    public void setStandardHeader(StandardHeader standardHeader) {
        StandardHeader = standardHeader;
    }

    private StandardHeader StandardHeader;
    private List<Body> Body;

    public List<Body> getBody() {
        return Body;
    }

    public void setBody(List<Body> body) {
        Body = body;
    }

    public MyPOJO(){

    }
}
