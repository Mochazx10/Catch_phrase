import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randCategory = new Random();
        List<String> animalCategory = new ArrayList<String>();
        animalCategory.add("Lion");
        animalCategory.add("Elephant");
        animalCategory.add("Giraffe");
        int numberOfElements = 1;

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = randCategory.nextInt(animalCategory.size());
            String guessWord = animalCategory.get(randomIndex);

        }
        List<String> occupationCategory = new ArrayList<String>();
        occupationCategory.add("Programmer");
        occupationCategory.add("Lawyer");
        occupationCategory.add("Doctor");
        int numberOfElements1 = 1;

        for (int i = 0; i < numberOfElements1; i++) {
            int randomIndex = randCategory.nextInt(occupationCategory.size());
            String guessWord = occupationCategory.get(randomIndex);

        }


        List<String> celebritiesCategory = new ArrayList<String>();
        celebritiesCategory.add("Obama");
        celebritiesCategory.add("Beyonce");
        celebritiesCategory.add("Rihanna");
        int numberOfElements2 = 1;

        for (int i = 0; i < numberOfElements2; i++) {
            int randomIndex = randCategory.nextInt(celebritiesCategory.size());
            String guessWord = celebritiesCategory.get(randomIndex);

        }
        
    }
}










