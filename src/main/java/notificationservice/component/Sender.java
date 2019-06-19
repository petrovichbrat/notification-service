package notificationservice.component;

import notificationservice.model.Message;
import notificationservice.model.enums.ChannelKind;

public interface Sender {
     default void sendMessage(Message message){
        System.out.println(message);
    }
     ChannelKind getChannelKind();

}
