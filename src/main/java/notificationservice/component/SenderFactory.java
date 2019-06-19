package notificationservice.component;

import notificationservice.model.PushNotification;
import notificationservice.model.SmsMessage;
import notificationservice.model.enums.ChannelKind;

import java.util.LinkedList;
import java.util.List;

public class SenderFactory{

    public Sender create(ChannelKind channelKind) {
        Sender sender = null;
        switch (channelKind){
            case EMAIL:
                sender = new EmailSender();
                break;
            case PUSHNOTIGICATION:
                sender = new PushNotificationSender();
                break;
            case SMS:
                sender = new SmsSender();
        }
        return sender;
    }

    public List<Sender> create(List<ChannelKind> kinds){
        List<Sender> senderList = new LinkedList<>();
        for (ChannelKind kind:kinds) {
            senderList.add(create(kind));
        }
        return senderList;
    }
}
