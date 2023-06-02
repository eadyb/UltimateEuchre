import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

// Represents the deck of cards used in the game.
    // It handles shuffling, dealing cards, and tracking the remaining cards.


    public Deck() {
        cards = new ArrayList<>();
        createDeck();
    }

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

    public Card dealCard() {
        return cards.remove(cards.size() - 1);
    }
}

