import java.util.Random;
import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] choices = { "Rock", "Paper", "Scissor" };

        int round = 5;
        int noofround = 1;
        int user = 0;
        int computer = 0;

        System.out.println();
        System.out.println("------------------  Welcome to Rock Paper Scissor Game  ------------------");
        System.out.println("Enter your Choice : ");

        option o = new option();
        o.opt();
        while (noofround <= round) {
            System.out.println("------------------  Number of Round : "+noofround+"/"+round+"  ------------------");

            System.out.print("User move         : ");
            o.value = scan.nextLine();

            Random random = new Random();
            int rps = random.nextInt(choices.length);
            System.out.println("Computer move     : " + choices[rps]);

            if (o.value.equals(choices[rps])) {
                System.out.println("------------------------------");
                System.out.println("Round "+noofround+" will be   : Die");
            } 
            else if (o.value.equals("Rock") && choices[rps].equals("Scissor") ||
                    (o.value.equals("Paper") && choices[rps].equals("Rock")) ||
                    (o.value.equals("Scissor") && choices[rps].equals("Paper"))) 
            {
                user++;
                System.out.println("------------------------------");
                System.out.println("Round "+noofround+" Winner is : User");
            } 
            else 
            {
                computer++;
                System.out.println("------------------------------");
                System.out.println("Round "+noofround+" Winner is : Computer");
            }
            noofround++;
            System.out.println();
        }

        if (computer > user)

        {
            // System.out.println();
            System.out.println("Over All Winner is Computer"+computer+"/"+round);
        } else {
            System.out.println(user+"/"+round);
            System.out.println("Over All Winner is User");
        }

        scan.close();
    }
}
