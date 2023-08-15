import java.util.Scanner;

import java.util.Random;

public class j29_rock_paper_scissor {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper and 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int compInput = random.nextInt(3);

        if (compInput == userInput) {
            System.out.println("draw");
        } else if (userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0
                || userInput == 2 && compInput == 1) {
            System.out.println("you win");
        } else {
            System.out.println("computer win");
        }
        // System.out.println("computer choice: " + compInput);
        if (compInput == 0) {
            System.out.println("compchoice : Rock");
        } else if (compInput == 1) {
            System.out.println("compchoice : Paper");
        } else if (compInput == 2) {
            System.out.println("compInput : Scissor");
        } else {
            System.out.println("game end");
        }
        sc.close();

    }

}
