import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        int untere = 1;
        int obere = 49;
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        do {
            int randomInt = random.nextInt(obere - untere + 1) + untere;
            if (!randomNumbers.contains(randomInt)) {
                randomNumbers.add(randomInt);
            }
        } while (randomNumbers.size() < 6);

        System.out.println("Bitte geben Sie Ihre 6 Zahlen ein:");
        ArrayList<Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int userNumber = scanner.nextInt();
            if (userNumber < untere || userNumber > obere) {
                System.out.println("Bitte geben Sie eine Zahl zwischen " + untere + " und " + obere + " ein:");
                i--;
            } else if (userNumbers.contains(userNumber)) {
                System.out.println("Diese Zahl wurde bereits eingegeben. Bitte geben Sie eine andere Zahl ein:");
                i--;
            } else {
                userNumbers.add(userNumber);
            }
        }
        int count = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (randomNumbers.contains(userNumbers.get(i))) {
                count++;
            }
        }
        System.out.println("Hier sind die Lottozahlen!: " + randomNumbers);
        if (count == 6){
            System.out.println("Herzlichen Glückwunsch! Sie haben 6 Richtige!");
        } else if (count == 5){
            System.out.println("Herzlichen Glückwunsch! Sie haben 5 Richtige!");
        } else if (count == 4){
            System.out.println("Herzlichen Glückwunsch! Sie haben 4 Richtige!");
        } else if (count == 3){
            System.out.println("Herzlichen Glückwunsch! Sie haben 3 Richtige!");
        } else if (count == 2){
            System.out.println("Herzlichen Glückwunsch! Sie haben 2 Richtige!");
        } else if (count == 1){
            System.out.println("Herzlichen Glückwunsch! Sie haben 1 Richtige!");
        } else {
            System.out.println("Leider haben Sie keine Richtige.");
        }

    }
}