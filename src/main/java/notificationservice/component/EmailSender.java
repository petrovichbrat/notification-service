package notificationservice.component;

import notificationservice.model.Message;
import notificationservice.model.enums.ChannelKind;

public class EmailSender implements Sender
{
    @Override
    public void sendMessage(Message message) {
        System.out.println("EMAIL " + message);
    }

    @Override
    public ChannelKind getChannelKind() {
        return ChannelKind.EMAIL;
    }
}
