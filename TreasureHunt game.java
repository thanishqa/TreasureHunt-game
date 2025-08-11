import java.util.Scanner;

public class Hunt {
    public static void main(String[] args) {
        int health = 100;
        int coin = 0;
        boolean track = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Treasure Hunt!");
        System.out.print("starting value health " + health + "\n starting value coin " + coin + "\n");
        while (true) {
            System.out.print("MENU");
            System.out.print("1. Fight");
            System.out.print("2. Search");
            System.out.print("3. Rest");
            System.out.print("4. CheckStatus");
            System.out.print("5. Exit");
            System.out.print("enter your choice: ");
            int choice = input.nextInt();
            if (choice == 1) {
                health -= 20;
                coin += 10;
                System.out.println("your health is " + health + "\n your coin is " + coin);
            } else if (choice == 2) {
                health -= 10;
                coin += 20;
                System.out.println("your health is " + health + "\n your coin is " + coin);
            } else if (choice == 3) {
                health += 15;
                coin -= 5;
                System.out.println("your health is " + health + "\n your coin is " + coin);
            } else if (choice == 4) {
                System.out.println("current health is " + health + "\n current coin is " + coin);
            } else if (choice == 5) {
                System.out.println("Game over");
                break;
            } else{
                    System.out.println("Invalid choice");
                    continue;
                }
            if (coin >= 100) {
                System.out.println("Winner");
                track = true;
                System.out.println("Game over");
            }
            if (health <= 0) {
                System.out.println("Loser");
                track = true;
                System.out.println("Game over");
            }

        }
input.close();
    }

}
