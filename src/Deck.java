import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents the deck of cards used in the game.
 * It handles shuffling, dealing cards, and tracking the remaining cards.
 */
public class Deck {

    /**
     * Creates a list of cards to act as the deck
     */
    private List<Card> cards;

    /**
     * Gets the list of cards in the deck
     * @return list of cards in deck
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Sets the list of cards in deck to new list
     * @param cards new list for deck
     */
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    /**
     * Constructor for Deck model
     */
    public Deck() {
        cards = new ArrayList<>();
        createDeck();
    }

    /**
     * Creates an un-shuffled deck of cards
     */
    private void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"9", "10", "Jack", "Queen", "King", "Ace"};
        String color;

        for (String suit : suits) {
            for (String rank : ranks) {
                if (suit.equals("Hearts") || suit.equals("Diamonds")) {
                    color = "red";
                } else {
                    color = "black";
                }
                Card card = new Card(suit, rank, color, 0);

                cards.add(card);
            }
        }
    }

    /**
     * Shuffles the deck of cards
     */
    public void shuffleCards() {
        List<Card> shuffledDeck = new ArrayList<>();
        Random random = new Random();
        int r = 0;

        while (cards.size() > 0) {
            r = random.nextInt(cards.size());
            shuffledDeck.add(cards.get(r));
            cards.remove(r);
        }
        cards.addAll(shuffledDeck);
        shuffledDeck.clear();
    }

    /**
     * Deals a card to a player from shuffled deck
     * @return card to be dealt in player's hand
     */
    public Card dealCard() {
        return cards.remove(cards.size() - 1);
    }
}

