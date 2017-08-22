package heroGame;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        King king = new King();
        Elf elf = new Elf();

        gameManager.fight(king, elf);
    }
}
