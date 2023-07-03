import java.util.Scanner;
public class j10_switch {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
            System.out.println("you are going to become an adult");
            break;
            case 23:
            System.out.println("you are going to join a job ");
            break;
            default:
            System.out.println("enjoy your life");
            sc.close();

        }
    }        
}
    

