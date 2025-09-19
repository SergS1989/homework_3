package bilder;

public class DemoTest {
    public static void main(String[] args) {
        Bilder bilder = new BilderProgrammer();
        Director director = new Director();
        bilder = director.createJunior(bilder);
        bilder.setFirstName("Ivan");
        bilder.setLastName("Ivanov");
        System.out.println(bilder.getProgramme());
    }
}
