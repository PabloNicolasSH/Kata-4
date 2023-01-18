package kata4.main;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String filename = "email.txt";
        List<Mail> mailList = new MailListReader().read(filename);
        Histogram<String> histogram = new MailHistogramBuilder().build(mailList);

        HistogramDisplay histogramDisplay = new HistogramDisplay("JFREECHART HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
}
