package bilder;

import java.util.ArrayList;

public class Director {
    public Bilder createJunior(Bilder bilder){
        ArrayList<String> hardSkils = new ArrayList<>();
        hardSkils.add("HTML");
        hardSkils.add("CSS");
        hardSkils.add("JS");
        bilder.setHardSkils(hardSkils);

        ArrayList<String> softSkils = new ArrayList<>();
        softSkils.add("Спокойный");
        softSkils.add("Сосредоточенный");
        softSkils.add("Коммуникабельный");
        bilder.setSoftSkils(softSkils);
        return bilder;
    }
}
