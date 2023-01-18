package kata4.view;

import kata4.model.Histogram;
import kata4.model.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<Mail> mails){
        Histogram<String> histogram = new Histogram<String>();
        for (Mail mail : mails){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
