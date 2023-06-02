public class Player {
    // Represents a player in the game.
    // It holds information about the player's hand, current bid, tricks won, and other relevant data.

    private int team;
    private int tricksWon;
    private Hand hand;

    
    public Player(Hand hand, int team, int tricks) {
        this.hand = hand;
        this.team = team;
        this.tricksWon = tricks;
    }

    public void trickWon() {
        tricksWon++;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public int getTricksWon() {
        return tricksWon;
    }

    public void setTricksWon(int tricksWon) {
        this.tricksWon = tricksWon;
    }

}
