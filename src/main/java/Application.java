import notificationservice.model.Message;
import notificationservice.model.SmsMessage;
import notificationservice.model.enums.ChannelKind;
import notificationservice.service.Notificator;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        SmsMessage sms = new SmsMessage(ChannelKind.SMS,"World");
        SmsMessage sms2 = new SmsMessage(ChannelKind.SMS,"World");
        List<Message> messageList = new ArrayList<>();
        messageList.add(sms);
        messageList.add(sms2);

        Notificator.getInstance().performMarketingCampaignMailing(messageList);
        System.out.println();
    }
}
