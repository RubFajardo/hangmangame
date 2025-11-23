import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private player player;
    private matcher matcher;
    private Scanner scanner;
    private char selection;
    private ArrayList<Character> usedWords = new ArrayList<Character>();

    public Game(player jugador, matcher matcher) {
        this.player = jugador;
        this.matcher = matcher;
        scanner = new Scanner(System.in);
    }

    public void iniciar() {

        System.out.println("=== EL AHORCADO ===");
        System.out.println("Hola! Juguemos al ahorcado, ¿cuál es tu nombre?");
        player.setName(scanner.nextLine());

        System.out.println("Jugador: " + player.getNombre());
        System.out.println("\nPulsa ENTER para escoger una palabra e iniciar el juego.");
        scanner.nextLine();
        matcher.setSelectWord();

        System.out.println(player.getNombre() + " , tu palabra a adivinar es: " + String.valueOf(matcher.getHiddenWord()));

        System.out.println("Tienes que adivinar la palabra secreta escogiendo letras, tienes un máximo de 4 intentos por palabra. Empecemos.");


        while (!matcher.isComplete() && matcher.getAttempts() < 4) {

            System.out.println("Escoge una letra!");
            char selectedInput = Character.toUpperCase(scanner.next().charAt(0));

            boolean alreadyUsed = false;
            for (char c : usedWords) {
                if (c == selectedInput) {
                    alreadyUsed = true;
                    break;
                }
            }

            if (alreadyUsed) {
                System.out.println("Ya has usado esa letra, escoge otra");
            } else {
                this.selection = selectedInput;
                usedWords.add(selection);
                matcher.matchWords(selection);
            }

            System.out.println("Palabra: " + String.valueOf(matcher.getHiddenWord()));
            System.out.println("Intentos fallidos: " + matcher.getAttempts());
            System.out.println("Letras usadas: " + this.usedWords);

        }

        if (matcher.isComplete()) {
            System.out.println("Fin del juego. Has adivinado la palabra!");
        }
        else {
            System.out.println("Fin del juego. Has perdido!");
        }
    }
}
