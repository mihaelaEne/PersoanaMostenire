import ro.mycode.controllers.PersonController;
import ro.mycode.models.Angajat;
import ro.mycode.models.Antreprenor;
import ro.mycode.models.Student;
import ro.mycode.view.ViewPerson;

public class Main {
    public static void main(String[] args) {

//        PersonController personController=new PersonController();
//        personController.afisarePersoana();

//        ViewPerson viewPerson=new ViewPerson();
//        viewPerson.play();


        PersonController personController=new PersonController();
        Angajat a1=new Angajat("type1-Angajat","Nume1-Angajat",2002,"Adresa1-angajat","pozitiaOcupataInFirma", "CpmpaniaLaCareLucreaza", 2000);
        Antreprenor antr1=new Antreprenor("TYPE2-aNTREPREN","numeAntrepr",1990,"ADRESA-ANTRP","domeniul DE activitate",10,7);
        Student s1=new Student("type-Student","Nume-Student",2002,"adresa student","CSIE",8.2F,2);

        personController.addPerson(a1);
        personController.addPerson(antr1);
        personController.addPerson(s1);

        personController.save();
    }
}