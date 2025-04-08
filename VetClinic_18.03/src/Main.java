import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y =0;
        Pet p1 = new Cat(6,1,"asd",false,"KOTIK","HeadPains",4,"Biba");
        p1.Start();
            while (x !=5){
                System.out.println("Press 1 to know pet \nPress 2 to know pet health status \nPress 3 to ask pet speak\nPress 4 to heal animal \n \nPress 5 to exit \n ");
                x = in.nextInt();
                if (x==1){
                    System.out.println(p1.print_info());
                    p1.writeFile(p1);
                }
                else if (x==2){
                    p1.Check_Health_Status();
                }
                else if (x==3){
                    p1.speak();
                }
                else if (x==4){
                    System.out.println("Press 1 if you want to heal cat\nPress 2 if you want to heal dog\nPress 3 if you want to heal turtle\nPress 4 if you want to heal parrot\nPress 5 if you want to exit\n");
                    while (y!=5){
                        y=in.nextInt();
                        if (y == 1){
                            p1.healing();
                            y=5;
                        }
                        else if (y==2){
                            p1.healing();
                            y=5;
                        }
                        else if (y==3) {
                            p1.healing();
                            y=5;
                        }
                        else if (y==4){
                            p1.healing();
                            y=5;
                        }
                    }
                }
            }

        }

    }
