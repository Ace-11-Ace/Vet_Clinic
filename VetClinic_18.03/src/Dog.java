import java.util.Scanner;

public class Dog extends Pet{
    private String dogBreed;
    Dog(int age, int petid, String taxonomy, boolean healthy, String petName, String diseases, double currentWeight, String dogBreed) {
        super(age, petid, taxonomy, healthy, petName, diseases, currentWeight);
        this.dogBreed=dogBreed;
    }
    public void  PainKiller(){
        double DosageOfCarprofen;
        DosageOfCarprofen = (getCurrentWeight()/2.20462)*(0.5/12);
        System.out.println("Pain Killer Dosage: "+DosageOfCarprofen);
    }
    public void  Sedative(){
        double DosageOfAcepromazine;
        DosageOfAcepromazine = (getCurrentWeight()/2.20462)*(0.03/10);
        System.out.println("Sedative Dosage: "+DosageOfAcepromazine);
    }
    public void healing() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose Treatment: \n1)Pain Killer: \n2)Sedative: \n3)Both Pain Killer and Sedative: \n4)Other option:");
        String treatment;
        int x = in.nextInt();
        if (x == 1) {
            PainKiller();
        }
        else if (x == 2) {
            Sedative();
        }
        else if (x == 3) {
            PainKiller();
            Sedative();
        }
        else {
            System.out.println("Enter treatment");
            treatment = in.nextLine();
            System.out.println(treatment);
        }
    }
}
