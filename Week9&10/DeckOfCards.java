import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int idx = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[idx++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numberOfCards, int numberOfPlayers) {
        if (numberOfCards > deck.length || numberOfCards % numberOfPlayers != 0) {
            System.out.println("Cannot distribute cards evenly.");
            return null;
        }
        int cardsPerPlayer = numberOfCards / numberOfPlayers;
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[i * cardsPerPlayer + j];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) System.out.print(card + " | ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int numberOfCards = sc.nextInt();
        System.out.print("Enter number of players: ");
        int numberOfPlayers = sc.nextInt();

        String[][] players = distributeCards(deck, numberOfCards, numberOfPlayers);
        if (players != null) printPlayersCards(players);
        sc.close();
    }
}