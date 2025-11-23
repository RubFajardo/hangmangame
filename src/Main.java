public class Main {
    public static void main(String[] args) {

        player player = new player("Jugador 1");
        matcher matcher = new matcher();
        Game Game = new Game(player, matcher);

        Game.iniciar();
    }
}