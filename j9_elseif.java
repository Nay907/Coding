import java.util.Scanner;
public class j9_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>50){
            System.out.println("you are not experienced");
        }
        else if(age>40){
            System.out.println("you are semi-experienced");
        }
        else if(age>30){
            System.out.println("you are semi-semi-experienced");
        }
        else{
            System.out.println("you are not experienced");
        }
        sc.close();


    }
    
}
