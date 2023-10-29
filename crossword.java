import java.util.Random;

public class crossword {
    public static void main(String[] args) {

        String[] words = {
            "Apple",
            "Banana",
            "Cherry",
            "Orange",
            "Lemon",
            "Grapes",
            "Mango",
            "Kiwi",
            "Peach",
            "Plum"
        };

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase();
        }


        CrosswordPuzzleGenerator generator = new CrosswordPuzzleGenerator(10,10, words);
        generator.generatePuzzle();
        generator.insertWords(words);

        generator.displayGrid();
    }
}
