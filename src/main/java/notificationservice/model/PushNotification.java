package notificationservice.model;

import lombok.Data;
import notificationservice.model.enums.ChannelKind;
@Data
public class PushNotification extends Message {
    private String recipientId;

    public PushNotification(ChannelKind sms, String text, String recipientId) {
        super(sms, text);
        this.recipientId = recipientId;
    }


}
