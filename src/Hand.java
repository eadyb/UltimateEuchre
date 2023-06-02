import java.util.ArrayList;
import java.util.List;

// A Hand class would represent a collection of cards held by a player.
// It would provide methods for adding and removing cards from the hand,
// sorting the cards, and performing other hand-related operations.
// Having a separate Hand class allows you to encapsulate the behavior and
// operations specific to managing a player's hand, providing a convenient
// interface for interacting with the player's cards.
public class Hand {
    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public void arrangeHand() {
        // Arrange cards in hand starting with trump and alternating black and red
        // Call whenever trump is decided
        // this function should also call assign card points
    }

    public void assignCardPoints() {
        // Call when 1 card is in trick (after leading card)
    }

    public void clearHand() {
        cards.clear();
    }

    public void dealHand(Deck deck) {
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            addCard(card);
        }
    }

}
