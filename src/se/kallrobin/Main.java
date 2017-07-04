package se.kallrobin;

import se.kallrobin.Deck.Deck;
import se.kallrobin.Game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Game game = new Game();

	    game.startGame();

	    String ans = null;
        Scanner scanner = new Scanner(System.in);

        while (ans != "quit") {
            System.out.println("Stay Or hit?");
            System.out.print("\t");
            ans = scanner.nextLine();
            switch (ans) {
                case "hit":
                    game.hit();
                    break;
                case "stay":
                    game.stay();
                    break;
            }
        }
        scanner.close();
    }

}
