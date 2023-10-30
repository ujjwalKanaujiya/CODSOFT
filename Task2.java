import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100 of each subject");
        System.out.println("Enter marks of Artificial Intelligence : ");
        int ai = sc.nextInt();
        System.out.println("Enter marks of Software Engineering : ");
        int se = sc.nextInt();

        System.out.println("Enter marks of Web Technology : ");
        int wt = sc.nextInt();

        System.out.println("Enter marks of Computer Network : ");
        int cn = sc.nextInt();

        System.out.println("Enter marks of Cloud Computing : ");
        int cc = sc.nextInt();

        int sum = ai + se + wt + cc + cn;
        int percentage = sum / 5;
        System.out.println("----------------RESULT----------------");
        System.out.println("Total Marks : "+sum+"/500");
        System.out.println("Average Percentage : "+percentage+"%");
        if (percentage > 90 && percentage <= 100) {
            System.out.println("Grade : A1");

        } else if (percentage > 80 && percentage <= 90) {
            System.out.println("Grade : A2");

        } else if (percentage > 65 && percentage <= 80) {
            System.out.println("Grade : B1");

        }
        if (percentage > 55 && percentage <= 65) {
            System.out.println("Grade : B2");

        }
        if (percentage > 45 && percentage <= 55) {
            System.out.println("Grade : C1");

        }
        if (percentage > 35 && percentage <= 45) {
            System.out.println("Grade : C2");

        }
        if (percentage > 30 && percentage <= 35) {
            System.out.println("Grade : D");

        } else if (percentage < 30) {
            System.out.println("Grade : F");
        }
        System.out.println("--------------------------------------");
        sc.close();

    }
}
