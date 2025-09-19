package bilder;

import java.util.ArrayList;

public interface Bilder {
    void setFirstName(String name);
    void setLastName(String lastName);
    void setAge(int age);
    void setHardSkils(ArrayList<String> hardSkils);
    void setSoftSkils(ArrayList<String> sofrSkils);
    Programmer getProgramme();
}
