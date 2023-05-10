import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// In this program, we start by declaring some constants for the number of questions, options per question, points per correct answer, and the filename of the questions file.

// We then define a main() method that reads the questions from the file using the readQuestions() method, asks the user each question with its options, gets the user's answer, and checks if it's correct. If the user's answer is correct, we add the correct answer points to their score.

// The readQuestions() method reads the questions from the file and stores them in a two-dimensional array of strings. Each row represents a question, and the first column is the question itself, followed by the four answer options and the correct answer index.

// Overall, this program covers all the concepts we've learned, including reading input from a file, using arrays to store data, using conditional statements to check if the user's answer is correct, and using loops to iterate over the questions and options.

public class Quiz {
    private static final String QUESTIONS_FILE = "questions.txt";
    private static final int NUM_QUESTIONS = 5;
    private static final int NUM_OPTIONS = 4;
    private static final int CORRECT_ANSWER_POINTS = 10;

    public static void main(String[] args) {
        int score = 0;
        String[][] questions = readQuestions();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            System.out.println("Question " + (i+1) + ": " + questions[i][0]);
            for (int j = 1; j <= NUM_OPTIONS; j++) {
                System.out.println(j + ") " + questions[i][j]);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == Integer.parseInt(questions[i][NUM_OPTIONS+1])) {
                score += CORRECT_ANSWER_POINTS;
            }
        }
        System.out.println("Your score is: " + score);
    }

    private static String[][] readQuestions() {
        String[][] questions = new String[NUM_QUESTIONS][NUM_OPTIONS+2];
        try {
            File file = new File(QUESTIONS_FILE);
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < NUM_QUESTIONS; i++) {
                for (int j = 0; j < NUM_OPTIONS+2; j++) {
                    questions[i][j] = scanner.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not read questions file: " + QUESTIONS_FILE);
        }

        return questions;
    }
}
