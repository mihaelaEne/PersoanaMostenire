package ro.mycode.models;

public class Antreprenor extends Person{

    private String domeniuActivitate;
    private int companiiLaActiv;
    private long investitiiLunare;


    public Antreprenor(String type,String name, int birthYear, String adress, String domeniuActivitate, int companiiLaActiv, long investitiiLunare) {
        super(type,name, birthYear, adress);
        this.domeniuActivitate = domeniuActivitate;
        this.companiiLaActiv = companiiLaActiv;
        this.investitiiLunare = investitiiLunare;
    }

    public Antreprenor(String name, int birthYear, String domeniuActivitate, int companiiLaActiv, long investitiiLunare) {
        super(name, birthYear);
        this.domeniuActivitate = domeniuActivitate;
        this.companiiLaActiv = companiiLaActiv;
        this.investitiiLunare = investitiiLunare;
    }

    public Antreprenor(String name, String domeniuActivitate, int companiiLaActiv, long investitiiLunare) {
        super(name);
        this.domeniuActivitate = domeniuActivitate;
        this.companiiLaActiv = companiiLaActiv;
        this.investitiiLunare = investitiiLunare;
    }

    public Antreprenor(String domeniuActivitate, int companiiLaActiv, long investitiiLunare) {
        this.domeniuActivitate = domeniuActivitate;
        this.companiiLaActiv = companiiLaActiv;
        this.investitiiLunare = investitiiLunare;
    }

    public String getDomeniuActivitate() {
        return domeniuActivitate;
    }

    public void setDomeniuActivitate(String domeniuActivitate) {
        this.domeniuActivitate = domeniuActivitate;
    }

    public int getCompaniiLaActiv() {
        return companiiLaActiv;
    }

    public void setCompaniiLaActiv(int companiiLaActiv) {
        this.companiiLaActiv = companiiLaActiv;
    }

    public long getInvestitiiLunare() {
        return investitiiLunare;
    }

    public void setInvestitiiLunare(long investitiiLunare) {
        this.investitiiLunare = investitiiLunare;
    }
    public String descriereAntrp(){
        String text="";
        text+="Eu sunt un antreprenor cu urmatoarele propr: "+"\n";
        text+="name: "+super.getName()+"\n";
        text+="birthYear "+super.getBirthYear()+"\n";
        text+="adress: "+super.getAdress()+"\n";
        text+="domeniul de activitate: "+this.domeniuActivitate+"\n";
        text+="nr de companii la activ: "+this.companiiLaActiv+"\n";
        text+="suma pe care o investesc lunar: "+this.investitiiLunare;
        return text;
    }

    public Antreprenor(String prop){
        super(prop);
        String [] split= prop.split(",");
        this.domeniuActivitate=split[4];
        this.companiiLaActiv=Integer.parseInt(split[5]);
        this.investitiiLunare=Long.parseLong(split[6]);

    }

}
