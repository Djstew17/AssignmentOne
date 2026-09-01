import java.util.Scanner;

public class FootballCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many touchdowns did you score? ");
        int touchdowns = input.nextInt();

        System.out.print("How many games did you play? ");
        int games = input.nextInt();

        double average = (double) touchdowns / games;

        System.out.println("You scored " + touchdowns + " touchdowns.");
        System.out.println("You averaged " + average + " touchdowns per game.");

        input.close();
    }
}