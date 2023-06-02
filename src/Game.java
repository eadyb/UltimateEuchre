import java.util.Random;

/**
 * This class represents the Game as a model and holds
 * the overall game state and logic and manages
 * the deck, players, tricks, dealer and score.
 *
 */
public class Game {

    /**
     * The deck of cards
     */
    private Deck deck;
    /**
     * The array of players
     */
    private Player[] players;
    /**
     * The current dealer
     */
    private int dealer;
    /**
     * The array of scores
     */
    private int[] scores;
    /**
     * The array of hands
     */
    private Hand[] hands = new Hand[4];

    /**
     * This is the constructor for the game
     */
    public Game() {
        deck = new Deck();
        players = new Player[4];
        dealer = 0;
        scores = new int[2];

        deck.shuffleCards();
    }


    /**
     * Deals each player a new random hand and resets trick counter
     */
    public void createPlayers() {
        for (int i = 0; i < 4; i++) {
            hands[i] = new Hand();
            hands[i].dealHand(deck); // Deal 5 cards to each hand
            players[i] = new Player(hands[i], i, 0);
        }
    }

    /**
     * Decides a dealer at random by picking a number between 0 and 3
     */
    public void decideDealer() {
        Random r = new Random();
        dealer = r.nextInt(4);
    }

    /**
     * Increments the score of the winning team
     * @param teamNum the number of the winning team
     * @param numPoints the number of points to be awarded
     */
    public void scorePoints(int teamNum, int numPoints) {
        if (teamNum == 0) {
            scores[0] += numPoints;
        } else {
            scores[1] += numPoints;
        }
    }

    /**
     * Returns the local players hand
     * @return hand[0] as local player is refered to as player[0]
     */
    public Hand getPlayerHand() {
        return hands[0];
    }

    /**
     * Resets player hands and decides a new dealer
     */
    public void startGame() {
        createPlayers();
        decideDealer();
    }

    /**
     * Gets the current deck of cards
     * @return the deck
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * Sets the deck to new deck
     * @param deck
     */
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    /**
     * Gets the array of players
     * @return Player[0-3]
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     * Set the Player[]
     * @param players updates player
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    /**
     * Gets the current dealer
     * @return an integer that represents the index
     * of the player number that is the dealer
     */
    public int getDealer() {
        return dealer;
    }

    /**
     * Sets the dealer
     * @param dealer is the playerNum of the dealer
     */
    public void setDealer(int dealer) {
        this.dealer = dealer;
    }

    /**
     * Gets the array of scores
     * @return the array of scores
     */
    public int[] getScores() {
        return scores;
    }

    /**
     * Sets the scores of the teams
     * @param scores is int[] of scores
     */
    public void setScores(int[] scores) {
        this.scores = scores;
    }

    /**
     * Gets the array of hands
     * @return hands as an array
     */
    public Hand[] getHands() {
        return hands;
    }

    /**
     * Sets the array of hands
     * @param hands is the array of hands to be set
     */
    public void setHands(Hand[] hands) {
        this.hands = hands;
    }
}
