import java.util.*;

public class Main {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Scanner userIn = new Scanner (System.in);
        System.out.println("What would you like to do?");
        System.out.println("[1]-Fight [2]-View Characters [3]-Create New [4]-Save Creation");
        int num = userIn.nextInt();
        if (num == 1) {
            fight();
        } else if (num == 2) {
            viewChars();
        } else if (num == 3) {
            createNewChar();
        } else {
            saveChar();
        }
        userIn.close();
    }

    public static void fight() {}
    public static void viewChars() {}
    public static void createNewChar() {}
    public static void saveChar() {}
}
