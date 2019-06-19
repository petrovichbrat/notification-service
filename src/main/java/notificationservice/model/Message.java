package notificationservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import notificationservice.model.enums.ChannelKind;
import java.util.Date;
import java.util.UUID;



@Data
@NoArgsConstructor
@EqualsAndHashCode
public abstract class Message {
    public String id;
    public ChannelKind channelKind;
    public String text;
    public Date creationDate;
    public Date datesendDate;

    public Message(ChannelKind sms, String text) {
        this.id = UUID.randomUUID().toString();
        this.creationDate = new Date();
    }
}

