package notificationservice.component;

import notificationservice.model.enums.ChannelKind;

public class PushNotificationSender implements Sender {
    @Override
    public ChannelKind getChannelKind() {
        return ChannelKind.PUSHNOTIGICATION;
    }
}
