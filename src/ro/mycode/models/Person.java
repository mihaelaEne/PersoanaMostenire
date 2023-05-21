package ro.mycode.models;

public class Person {
    private String type;
    private String name;
    private int birthYear;
    private String adress;


    public Person(String type, String name, int birthYear, String adress) {
        this.type = type;
        this.name = name;
        this.birthYear = birthYear;
        this.adress = adress;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String descrierePersoana() {
        String text = "";
        text += "Eu sunt o perosna cu urmatoarele proprietati:" + "\n";
        text += "name: " + this.name + "\n";
        text += "birthYear " + this.birthYear + "\n";
        text += "adress: " + this.adress;
        return text;
    }

    public Person(String prop) {
        String[] split = prop.split(",");
        this.type = split[0];
        this.name = split[1];
        this.birthYear = Integer.parseInt(split[2]);
        this.adress = split[3];
    }

    public String toSavePerson() {
        return type + "," + name + "," + birthYear + "," + adress;
    }

}
