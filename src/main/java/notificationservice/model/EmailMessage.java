package notificationservice.model;

import lombok.Data;

import java.util.List;
import java.util.Objects;
@Data
public class EmailMessage {
    private String emailTo;
    private List<String> emailCC;

    public EmailMessage(String emailTo, List<String> emailCC) {
        super();
        this.emailTo = emailTo;
        this.emailCC = emailCC;
    }
}
