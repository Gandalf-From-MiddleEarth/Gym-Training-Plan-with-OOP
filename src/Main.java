import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Gym Training Program");
        String exercise = "Valid exercises\nBurpee\nPush Up\nSit Up\nSuat";
        System.out.println(exercise);
        System.out.println("Create an exercise...");

        System.out.print("Burpee: ");
        int burpee = scanner.nextInt();
        System.out.print("Push Up: ");
        int pushUp = scanner.nextInt();
        System.out.print("Sit Up: ");
        int sitUp = scanner.nextInt();
        System.out.print("Squat: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Training training = new Training(burpee, pushUp, sitUp, squat);

        System.out.println("Exercise started");
        while (training.exerciseFinished() == false) {
            System.out.print("Exercise type: ");
            String type = scanner.nextLine();
            System.out.print("Exercise number: ");
            int number = scanner.nextInt();
            training.doExercise(type, number);
            scanner.nextLine();
        }

        System.out.println("Exercise finished congratulations");
    }
}
