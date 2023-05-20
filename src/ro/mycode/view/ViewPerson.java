package ro.mycode.view;

import ro.mycode.controllers.PersonController;
import ro.mycode.models.Person;

import java.security.cert.PolicyNode;
import java.util.Scanner;

public class ViewPerson {

    private Scanner scanner;
    private PersonController personController;

    public ViewPerson(Person person) {
        personController = new PersonController();
        scanner = new Scanner(System.in);
        play();
    }

    public ViewPerson() {

    }

    public void meniu() {
        System.out.println("Buna ziua!");
        System.out.println("Apasa tasta 1 pentru a afisa toate persoanele ");
        System.out.println("Apasa tasta 2 pentru a adauga o persoana ");
        System.out.println("Apasa tasta 3 pentru a sterge o persoana  ");
    }

    public void play() {
        int alegere = 0;
        boolean running = true;
        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    personController.afisarePersoana();
                    break;
                case 2:addPerson();
                break;
                case 3: removePerson();
                break;
                default:
                    System.out.println("Alegere incorecta");
                    break;

            }
        }
    }

    private void addPerson() {
        System.out.println("Type:");
        String type = scanner.nextLine();
        System.out.println("Name:");
        String name=scanner.nextLine();
        System.out.println("BirthYear:");
        int birthYear=Integer.parseInt(scanner.nextLine());
        System.out.println("Adress:");
        String adress=scanner.nextLine();

        Person person=personController.findByName(name);

        if(person==null){
            Person pNou=new Person(type,name,birthYear,adress);
            personController.addPerson(pNou);
        }else {
            System.out.println("Persoana exista deja");
        }
    }


    private void removePerson(){
        System.out.println("Name:");
        String name=scanner.nextLine();

        Person person=personController.findByName(name);


        if(person==null){
            System.out.println("Nu exista peroana cu numele introdus");
        }else{
            personController.removePerson(person);
            System.out.println("Persoana a fost stearsa");
        }
    }
}
