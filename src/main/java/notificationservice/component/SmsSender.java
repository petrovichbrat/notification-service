package notificationservice.component;

import lombok.Data;
import notificationservice.model.Message;
import notificationservice.model.enums.ChannelKind;
@Data
public class SmsSender implements Sender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("SMS" + message);
    }

    @Override
    public ChannelKind getChannelKind() {
        return ChannelKind.SMS;
    }


}
