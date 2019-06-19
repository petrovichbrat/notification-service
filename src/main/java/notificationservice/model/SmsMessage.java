package notificationservice.model;

import lombok.Data;
import notificationservice.model.enums.ChannelKind;
@Data
public class SmsMessage extends Message {

    public SmsMessage(ChannelKind sms, String world) {
        super(sms, world);
        this.channelKind = ChannelKind.SMS;
    }
}
