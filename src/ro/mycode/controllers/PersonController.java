package ro.mycode.controllers;

import ro.mycode.models.Angajat;
import ro.mycode.models.Antreprenor;
import ro.mycode.models.Person;
import ro.mycode.models.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonController {
    private ArrayList<Person> people;

    public PersonController(ArrayList<Person> people) {
        this.people = people;
    }

    public PersonController() {
        this.people = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea\\Teme\\PersoanaMostenire\\src\\ro\\mycode\\data\\person.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                switch (text.split(",")[0]) {
                    case "Angajat":
                        this.people.add(new Angajat(text));
                        break;

                    case "Antreprenor":
                        this.people.add(new Antreprenor(text));
                        break;

                    case "Student":
                        this.people.add(new Student(text));
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public void removePerson(Person person) {
        this.people.remove(person);
    }

    public void afisarePersoana() {

        for (int i = 0; i < people.size(); i++) {

            if (people.get(i) instanceof Angajat) {
                Angajat angajat = (Angajat) people.get(i);
                System.out.println(angajat.descriereAngajat());
                System.out.println("\n");
            } else if (people.get(i) instanceof Antreprenor) {
                Antreprenor antreprenor = (Antreprenor) people.get(i);
                System.out.println(antreprenor.descriereAntrp());
                System.out.println("\n");
            } else {
                Student student = (Student) people.get(i);
                System.out.println(student.descriereStudent());
                System.out.println("\n");
            }

        }
    }

    public String toSave() {
        String text = "";
        for (int i = 0; i < people.size(); i++) {

            if (people.get(i) instanceof Angajat) {
                Angajat angajat = (Angajat) people.get(i);
                text += angajat.toSaveAngajat() + "\n";
            } else if (people.get(i) instanceof Antreprenor) {
                Antreprenor antreprenor = (Antreprenor) people.get(i);
                text += antreprenor.toSaveAntreprenor() + "\n";
            } else {
                Student student = (Student) people.get(i);
                text += student.toSaveStudent() + "\n";
            }

        }

        return text;
    }


    public void save() {
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea\\Teme\\PersoanaMostenire\\src\\ro\\mycode\\data\\person.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSave());
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Person findByName(String name) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name)) {
                return people.get(i);
            }
        }
        return null;
    }
}


