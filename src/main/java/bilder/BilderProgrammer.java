package bilder;


import java.util.ArrayList;

public class BilderProgrammer implements Bilder {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<String> hardSkils;
    private ArrayList<String> softSkils;

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setHardSkils(ArrayList<String> hardSkils) {
        this.hardSkils = hardSkils;
    }

    @Override
    public void setSoftSkils(ArrayList<String> softSkils) {
        this.softSkils = softSkils;
    }

    @Override
    public Programmer getProgramme() {
        return new Programmer(firstName, lastName, age, hardSkils, softSkils);
    }
}
