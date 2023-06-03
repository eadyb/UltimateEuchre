/**
 * Represents a player in the game.
 * It holds information about the player's hand,
 * team, tricks won.
 */
public class Player {

    /**
     * Integer to hold team number
     */
    private int team;

    /**
     * Integer to hold the number of tricks won by a specific player
     */
    private int tricksWon;

    /**
     * Holds a hand of cards for a player
     */
    private Hand hand;

    /**
     * Constructor Player model
     * @param hand player's hand
     * @param team player's team
     * @param tricks player's tricks won
     */
    public Player(Hand hand, int team, int tricks) {
        this.hand = hand;
        this.team = team;
        this.tricksWon = tricks;
    }

    /**
     * Increments the number of tricks won for a player
     */
    public void trickWon() {
        tricksWon++;
    }

    /**
     * Gets the player's hand
     * @return a hand of cards
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Sets a player's hand
     * @param hand new hand for player
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    /**
     * Gets the player's team
     * @return player's team number
     */
    public int getTeam() {
        return team;
    }

    /**
     * Sets the player's team
     * @param team integer to set as player's team
     */
    public void setTeam(int team) {
        this.team = team;
    }

    /**
     * Get the number of tricks won by a player
     * @return number of tricks won for a player
     */
    public int getTricksWon() {
        return tricksWon;
    }

    /**
     * Sets the number of tricks won by a player
     * @param tricksWon number of tricks won by a player
     */
    public void setTricksWon(int tricksWon) {
        this.tricksWon = tricksWon;
    }

}
