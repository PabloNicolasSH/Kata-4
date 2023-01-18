package kata4.model;

public class Mail {

    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomain(){
        String[] domain = mail.split("@");
        return domain[1];
    }
}
