package kata4.view;

import kata4.model.Mail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    public List<Mail> read(String filename) {
        List <Mail> mails = new ArrayList<>();
        File archive;
        FileReader fr = null;
        BufferedReader br;
        try{
            archive = new File(filename);
            fr = new FileReader(archive);
            br = new BufferedReader(fr);

            String linea;
            while((linea= br.readLine())!=null){
                if (linea.contains("@")){
                    Mail mail = new Mail(linea);
                    mails.add(mail);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mails;
    }
}
