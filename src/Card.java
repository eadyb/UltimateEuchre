public class Card {
    private String suit;
    private String rank;
    private String color;
    private int pointValue;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Card(String suit, String rank, String color, int pointValue) {
        this.suit = suit;
        this.rank = rank;
        this.color = color;
        this.pointValue = pointValue;
    }
}
