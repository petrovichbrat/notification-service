package notificationservice.service;


import notificationservice.component.Sender;
import notificationservice.component.SenderFactory;
import notificationservice.model.Message;
import notificationservice.model.enums.ChannelKind;
import java.util.*;
import java.util.stream.Collectors;


 public class Notificator {
     private static Notificator instance;

     public static synchronized Notificator getInstance() {
         if (instance == null) {
             instance = new Notificator();
         }
         return instance;
     }

    /////////////////////////////////////////////////////////////////
    private Map<ChannelKind, Sender> senders = new HashMap<>();
    private SenderFactory senderFactory = new SenderFactory();

    public void performMarketingCampaignMailing(List<Message> messages) {
        List<ChannelKind> channelKinds = messages.stream()
                .map(Message::getChannelKind).distinct().collect(Collectors.toList());

        if (senders.isEmpty()) {
            senderFactory.create(
                    messages.stream()
                            .map(Message::getChannelKind)
                            .collect(Collectors.toList())
            ).forEach(sender -> senders.putIfAbsent(sender.getChannelKind(), sender));

        } else {
            messages.stream()
                    .map(Message::getChannelKind)
                    .distinct()
                    .forEach(channelKind -> senders.putIfAbsent(channelKind, senderFactory.create(channelKind)));
        }
        messages.forEach(message -> sendMessage(message));

    }

    public void sendMessage(Message message) {
        if (!senders.containsKey(message.getChannelKind()))
            throw new IllegalStateException();
        else senders.get(message.getChannelKind()).sendMessage(message);

    }
}
