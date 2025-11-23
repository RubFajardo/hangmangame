import java.util.ArrayList;
import java.util.Random;

public class matcher {

    private char[] hiddenWord;
    private ArrayList<String> wordsArray = new ArrayList<String>();
    private String selectedWord;
    private int attempts;

    public matcher() {
        wordsArray.add("ELEFANTE");
        wordsArray.add("PICARO");
        wordsArray.add("PLAYA");
        this.attempts = 0;
    }

    public void setSelectWord() {
        Random rand = new Random();
        this.selectedWord = wordsArray.get(rand.nextInt(wordsArray.size()));
        hiddenWord = new char[selectedWord.length()];
        for (int i = 0; i < selectedWord.length(); i++) {
            hiddenWord[i] = '_';
        }
    }

    public void matchWords (char wordUser) {
        boolean acierto = false;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == wordUser) {
                hiddenWord[i] = wordUser;
                acierto = true;
                System.out.println("Felicidades! La letra " + wordUser + " sí está en la palabra");
            }
        }
        if (!acierto) {
            System.out.println("Nop :(, la letra " + wordUser + " no está en la palabra.");
            attempts++;
            System.out.println("Llevas " + attempts + " error");
        }
    }

    public boolean isComplete () {
        for (int i = 0; i < hiddenWord.length; i++) {
            if (hiddenWord[i] == '_') {
                return false;
            }
        }
        return true;
    }

    public char[] getHiddenWord() { return hiddenWord; }
    public int getAttempts() { return attempts; }
}
