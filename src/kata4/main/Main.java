package kata4.main;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Control control = new Control();
        String filename = "email.txt";
        control.input(filename);
        control.process();
        control.output();
        control.execute();
    }

    static class Control {
        private List<Mail> mailList;
        private Histogram<String> histogram;
        private HistogramDisplay histogramDisplay;

        public void input(String filename) {
            mailList = new MailListReader().read(filename);
        }

        public void process() {
            histogram =  new MailHistogramBuilder().build(mailList);
        }

        public void output() {
            histogramDisplay = new HistogramDisplay("JFREECHART HISTOGRAM", histogram);
        }

        public void execute() {
            histogramDisplay.execute();
        }
    }
}
