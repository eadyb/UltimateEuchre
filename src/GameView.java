import javax.swing.*;

/**
 * GameView is the GUI (view) class that holds all the UI elements and logic
 */
public class GameView extends JFrame{

    /**
     * Main JPanel to hold all UI elements
     */
    private JPanel MainPanel;

    /**
     * Label to display score
     */
    private JLabel lblScore;


    //private GameController gameController = new GameController();

    //private AIController aiController = new AIController();

    /**
     * Constructor for GameView UI class
     * @param score for displaying the score
     * @param oddTeamTricks for displaying tricks won by team 1
     * @param evenTeamTricks for displaying tricks won by team 2
     * @param playerHand for displaying the player hand
     * @param trump for displaying the current trump suit
     */
    public GameView(int score, int oddTeamTricks, int evenTeamTricks, Hand playerHand, String trump) {
        //GameView gameView = new GameView()

    }

    /**
     * Inititalizes the game window
     */
    public void initializeView() {
        GameView gameView = new GameView(0,0,0,null,null);
        setTitle("Euchre");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320,180);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Updates the game view
     */
    public void updateView() {

    }


}
