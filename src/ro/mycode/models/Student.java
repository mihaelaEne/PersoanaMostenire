package ro.mycode.models;

import ro.mycode.models.Person;

public class Student extends Person {
    private String facultate;
    private float medie;
    private int anStudiu;



    public Student(String type,String name, int birthYear, String adress, String facultate, float medie, int anStudiu) {
        super(type,name, birthYear, adress);
        this.facultate = facultate;
        this.medie = medie;
        this.anStudiu = anStudiu;
    }

    public Student(String name, int birthYear, String facultate, float medie, int anStudiu) {
        super(name, birthYear);
        this.facultate = facultate;
        this.medie = medie;
        this.anStudiu = anStudiu;

    }

    public Student(String name, String facultate, float medie, int anStudiu) {
        super(name);
        this.facultate = facultate;
        this.medie = medie;
        this.anStudiu = anStudiu;
    }

    public Student(String facultate, float medie, int anStudiu) {
        this.facultate = facultate;
        this.medie = medie;
        this.anStudiu = anStudiu;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }
    public String descriereStudent(){
        String text="";
        text+="Eu sunt un student cu urmatoarele caracteristici: "+"\n";
        text+="name: "+super.getName()+"\n";
        text+="birthYear "+super.getBirthYear()+"\n";
        text+="adress: "+super.getAdress()+"\n";
        text+="facultate: "+this.facultate+"\n";
        text+="medie: "+this.medie+"\n";
        text+="an Studiu: "+this.anStudiu;
        return text;
    }

    public Student(String prop){
        super(prop);
        String [] split=prop.split(",");
        this.facultate=split[4];
        this.medie=Float.parseFloat(split[5]);
        this.anStudiu=Integer.parseInt(split[6]);
    }

    public String toSaveStudent(){
        return super.toSavePerson()+","+facultate+","+medie+","+anStudiu;}
}
