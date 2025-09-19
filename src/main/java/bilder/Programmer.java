package bilder;

import java.util.ArrayList;

public class Programmer {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<String> hardSkils;
    private ArrayList<String> softSkils;

    public Programmer(String firstName, String lastName, int age, ArrayList<String> hardSkils, ArrayList<String> softSkils) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hardSkils = hardSkils;
        this.softSkils = softSkils;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getHardSkils() {
        return hardSkils;
    }

    public ArrayList<String> getSoftSkils() {
        return softSkils;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHardSkils(ArrayList<String> hardSkils) {
        this.hardSkils = hardSkils;
    }

    public void setSoftSkils(ArrayList<String> softSkils) {
        this.softSkils = softSkils;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hardSkils=" + hardSkils +
                ", softSkils=" + softSkils +
                '}';
    }
}
