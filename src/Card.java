
/**
 * Represents a card with a point value
 */
public class Card {

    /**
     * String to hold card's suit
     */
    private String suit;

    /**
     * String to hold card rank/value
     */
    private String rank;

    /**
     * String to hold color of card
     */
    private String color;

    /**
     * Integer to hold point value of a card (used for determining card strength).
     */
    private int pointValue;

    /**
     * Gets the rank of the card
     * @return rank of card
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the rank of a card
     * @param rank value of card (i.e. 9, 10, jack, etc.)
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * Gets the color of the card
     * @return the color of the card as a string
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of a card
     * @param color color to be set for card
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the point value of a card
     * @return the point value as an integer
     */
    public int getPointValue() {
        return pointValue;
    }

    /**
     * Sets the point value of a card
     * @param pointValue integer point value
     */
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    /**
     * Gets the suit of a card
     * @return the suit of the card as a string
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Sets the suit of a card
     * @param suit suit to assign to card
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * Constructor for the Card model
     * @param suit suit of the card
     * @param rank rank/face value of card
     * @param color color of the card
     * @param pointValue point value of the card
     */
    public Card(String suit, String rank, String color, int pointValue) {
        this.suit = suit;
        this.rank = rank;
        this.color = color;
        this.pointValue = pointValue;
    }
}
