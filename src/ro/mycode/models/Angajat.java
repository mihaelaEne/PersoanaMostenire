package ro.mycode.models;

public class Angajat extends Person{

    private String pozitie;
    private String comapanie;
    private int salariu;


    public Angajat( String type,String name, int birthYear, String adress, String pozitie, String comapanie, int salariu) {
        super(type,name, birthYear, adress);
        this.pozitie = pozitie;
        this.comapanie = comapanie;
        this.salariu = salariu;
    }

    public Angajat(String name, int birthYear, String pozitie, String comapanie, int salariu) {
        super(name, birthYear);
        this.pozitie = pozitie;
        this.comapanie = comapanie;
        this.salariu = salariu;
    }

    public Angajat(String name, String pozitie, String comapanie, int salariu) {
        super(name);
        this.pozitie = pozitie;
        this.comapanie = comapanie;
        this.salariu = salariu;
    }

    public Angajat(String pozitie, String comapanie, int salariu) {
        this.pozitie = pozitie;
        this.comapanie = comapanie;
        this.salariu = salariu;
    }
    public Angajat(){}

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public String getComapanie() {
        return comapanie;
    }

    public void setComapanie(String comapanie) {
        this.comapanie = comapanie;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String descriereAngajat(){
        String text="";
        text+="Eu sunt un angajat cu urmatoarele proprietati: "+"\n";
        text+="name: "+super.getName()+"\n";
        text+="birthYear "+super.getBirthYear()+"\n";
        text+="adress: "+super.getAdress()+"\n";
        text+="pozitie: "+this.pozitie+"\n";
        text+="companie: "+this.comapanie+"\n";
        text+="salariu: "+this.salariu+"\n";
        return text;
    }

    public Angajat(String prop){
        super(prop);
        String[] split=prop.split(",");
        this.pozitie=split[4];
        this.comapanie=split[5];
        this.salariu=Integer.parseInt(split[6]);
    }

}

