package notificationservice.model.enums;

public enum ChannelKind {
    UNKNOWN(-1,"UNKNOWN"),
    SMS(0,"SMS"),
    EMAIL(1, "EMAIL"),
    PUSHNOTIGICATION(2, "Push notification");


    private int code;
    private String text;

    ChannelKind(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public static ChannelKind valueOf(int code) {
        for (ChannelKind channelKind : ChannelKind.values())
            if (channelKind.getCode() == code)
                return channelKind;

        return null;
    }
}
