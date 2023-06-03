import java.util.ArrayList;
import java.util.List;


/**
 * Represents a collection of cards held by a player.
 * provide methods for adding and removing cards from the hand,
 * sorting the cards, and performing other hand-related operations.
 */
public class Hand {

    /**
     * Creates a list to hold cards as objects
     */
    private List<Card> cards;

    /**
     * Gets the cards in the hand
     * @return list of card objects
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Constructor for Hand model
     */
    public Hand() {
        cards = new ArrayList<>();
    }

    /**
     * Adds a card to a hand
     * @param card adds a card to the hand
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Removes a card from a hand
     * @param card card to be removed
     */
    public void removeCard(Card card) {
        cards.remove(card);
    }

    /**
     * Arrange the cards in the local players hand
     */
    public void arrangeHand() {
        // Arrange cards in hand starting with trump and alternating black and red
        // Call whenever trump is decided
        // this function should also call assign card points
    }

    /**
     * Assigns point values to each of the cards
     */
    public void assignCardPoints() {
        // Call when 1 card is in trick (after leading card)
        // Maybe move to Trick
    }

    /**
     * Clears the cards out of a hand (empties the list of cards)
     */
    public void clearHand() {
        cards.clear();
    }

    /**
     * Deals 5 cards from the deck to create a hand
     * @param deck the game deck
     */
    public void dealHand(Deck deck) {
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            addCard(card);
        }
    }

}
