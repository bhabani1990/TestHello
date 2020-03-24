public class StandardHeader {
    private String SendingTime;
    private WMHeader WMHeader;

    public String getSendingTime() {
        return SendingTime;
    }

    public void setSendingTime(String sendingTime) {
        SendingTime = sendingTime;
    }

    public WMHeader getWMHeader() {
        return WMHeader;
    }

    public void setWMHeader(WMHeader WMHeader) {
        this.WMHeader = WMHeader;
    }

    public StandardHeader(){

    }
}
