public class Turtle extends Pet{
    private String clasification;
    Turtle(int age, int petid, String taxonomy, boolean healthy, String petName, String diseases, double currentWeight, String clasification) {
        super(age, petid, taxonomy, healthy, petName, diseases, currentWeight);
    }

    public void healing() {
        System.out.println("No healing for Turtle");
    }
}
