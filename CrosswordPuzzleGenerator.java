import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class CrosswordPuzzleGenerator {
    private char[] alphabet;
    private int rows;
    private int cols;
    private String[] words;
    private String[][] grid;
    private Random random;

    public CrosswordPuzzleGenerator(int rows, int cols, String[] words) {
        this.rows = rows;
        this.cols = cols;
        this.words = words;
        this.alphabet = new char[26];
        this.grid = new String[rows][cols];
        this.random = new Random();
    }

    // Method to insert a word into the crossword grid
    public void insertWordHorizontally(String word, int row, int col) {
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            grid[row][col + i] = String.valueOf(word.charAt(i));
        }
    }

    // Method to insert a word into the crossword grid Vertically
    public void insertWordVertically(String word, int row, int col) {
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            grid[row + i][col] = String.valueOf(word.charAt(i));
        }
    }

    public void insertWords(String[] words){
        
        for(String word: words){

            //0 for horizontal, and 1 for vertical
            int direction = random.nextInt(2);

            if(direction == 0){
                //Insert horizontally
                int row = random.nextInt(rows);
                int col = random.nextInt(cols - word.length() + 1);
                insertWordHorizontally(word, row, col);
            }else{
                //Insert Vertically
                int row = random.nextInt(rows - word.length() + 1);
                int col = random.nextInt(cols);
                insertWordVertically(word, row, col);
            }
        }
    }

    // Method to display the crossword grid
    public void displayGrid() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void generatePuzzle() {
        // Fill the alphabet array with letters from 'A' to 'Z'
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet[letter - 'A'] = letter;
        }

        // Populate the grid with random alphabet letters
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Generate a random letter from the alphabet array
                String randomLetter = String.valueOf(alphabet[random.nextInt(26)]);
                grid[row][col] = randomLetter;
            }
        }
    }
}
