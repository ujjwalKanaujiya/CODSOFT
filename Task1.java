import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(
                "Welcome to guess the number game!!\nWe have generated a number between 1 to 100.\nGuess that number, you have only five attempts.\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for PLAY\t Press 2 for EXIT");
        int ch = sc.nextInt();
        int i = 5, flag = 0;

        switch (ch) {
            case 1:
                Random random = new Random();

                int number = random.nextInt(1, 101);
                while (i >= 1) {
                    System.out.println("Attempt number : " + i);
                    System.out.println("Enter the number : ");

                    int choice = sc.nextInt();

                    if (choice < number) {
                        System.out.println("Response is TOO LOW\n");
                        flag = 1;
                    } else if (choice > number) {
                        System.out.println("Response is TOO HIGH\n");
                        flag = 1;
                    } else if (choice == number) {
                        System.out.println("CORRECT\n");
                        break;
                    }
                    i--;
                }
                if (flag != 0) {
                    System.out.println("Generated number was :" + number);
                }
                break;
            case 2:
                break;
            default:
                break;
        }

        sc.close();
    }
}
