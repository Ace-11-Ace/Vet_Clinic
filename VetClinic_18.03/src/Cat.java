import java.util.Scanner;

public class Cat extends Pet{
    private String catBreed;
     Cat(int age, int petid, String taxonomy, boolean healthy, String petName, String diseases, double currentWeight, String catBreed) {
        super(age, petid, taxonomy, healthy, petName, diseases, currentWeight);
        this.catBreed = catBreed;
    }
    public void  PainKiller(){
        double DosageOfCarprofen;
        DosageOfCarprofen = (getCurrentWeight()/2.20462)*(0.25/12);
        System.out.println("Pain Killer Dosage: "+DosageOfCarprofen);
    }
    public void  Sedative(){
        double DosageOfAcepromazine;
        DosageOfAcepromazine = (getCurrentWeight()/2.20462)*(0.002/10);
        System.out.println("Sedative Dosage: "+DosageOfAcepromazine);
    }
    public void healing() {
        Scanner in = new Scanner(System.in);
        System.out.println("Chosose Treatment: \n1)Pain Killer: \n2)Sedative: \n3)Both Pain Killer and Sedative: \n4)Other option:");
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
