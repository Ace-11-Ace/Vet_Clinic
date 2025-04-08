import java.util.Scanner;

public class Parrot extends Pet{
    private boolean canSpeak;
    Parrot(int age, int petid, String taxonomy, boolean healthy, String petName, String diseases, double currentWeight, boolean canSpeak) {
        super(age, petid, taxonomy, healthy, petName, diseases, currentWeight);

    }

    public void healing() {
        System.out.println("No healing for Parrot");
    }
}
