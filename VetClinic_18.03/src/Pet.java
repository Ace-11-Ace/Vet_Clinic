import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pet {
    private int age;
    private int petid;
    private String taxonomy;
    private boolean healthy;
    private String petName;
    private String diseases;
    private double currentWeight;

    public Pet(int age,int petid,String taxonomy, boolean healthy, String petName, String diseases, double currentWeight){
        this.age=age;
        this.petid=petid;
        this.taxonomy=taxonomy;
        this.healthy=healthy;
        this.petName=petName;
        this.diseases=diseases;
        this.currentWeight=currentWeight;
    }
    public void Start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Hello from Edmonton Charity Vet Clinic");
        System.out.println("Enter the attending vet name: ");
        String drName= in.nextLine();
        System.out.println("Dr. "+drName);
        System.out.println();
    }
    public String print_info () {
        return ("Pet age: "+age+", Pet ID: "+petid+", Taxonomy: "+taxonomy+", Healthy: "+healthy+", PetName: "+petName+", Diseases: "+diseases+", CurrentWeight: "+currentWeight);
    }
    public void speak () {
        System.out.println("Pet voice");
    }
    public void Check_Health_Status(){
        if (healthy == true) {
            System.out.println("Pet is helthy");
        }
        else {
            System.out.println("Pet is ill");
        }
    }
    public void  PainKiller(){
        double DosageOfCarprofen;
        DosageOfCarprofen = (getCurrentWeight()/2.20462)*(0/12);
        System.out.println("Pain Killer Dosage: "+DosageOfCarprofen);
    }
    public void  Sedative(){
        double DosageOfAcepromazine;
        DosageOfAcepromazine = (getCurrentWeight()/2.20462)*(0/10);
        System.out.println("Sedative Dosage: "+DosageOfAcepromazine);
    }
    public void healing () {
        Scanner in = new Scanner(System.in);
        System.out.println("Chosose Treatment: \n1)Pain Killer: \n2)Sedative: \n3)Both Pain Killer and Sedative: \n4)Other option:");
        String treatment;
        int x = in.nextInt();

        if (x == 1){
            treatment = "Pain Killer";
        }
        else if (x == 2){
            treatment = "Sedative";
        }
        else if (x == 3){
            treatment = "Both Pain Killer";
        }
        else {
            System.out.println("Enter treatment");
            treatment = in.nextLine();
        }
    }
    public void  writeFile(Pet p1){
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(p1.print_info());
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPetid() {
        return petid;
    }

    public void setPetid(int petid) {
        this.petid = petid;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }
}
