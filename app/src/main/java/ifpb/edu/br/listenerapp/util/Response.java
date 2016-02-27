package ifpb.edu.br.listenerapp.util;

public class Response {
    private String contentValue;

    private int statusCodeHttp;

    public Response(int statusCodeHttp, String contentValue) {
        this.statusCodeHttp = statusCodeHttp;
        this.contentValue = contentValue;
    }

    public int getStatusCodeHttp() {
        return statusCodeHttp;
    }
    public void setStatusCodeHttp(int statusCodeHttp) {
        this.statusCodeHttp = statusCodeHttp;
    }

    public String getContentValue() {
        return contentValue;
    }
    public void setContentValue(String contentValue) {
        this.contentValue = contentValue;
    }
}
