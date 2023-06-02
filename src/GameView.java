import javax.swing.*;

public class GameView extends JFrame{
    private JPanel MainPanel;
    private JLabel lblScore;
    private GameController gameController = new GameController();

    //private AIController aiController = new AIController();

    public GameView(int score, int oddTeamTricks, int evenTeamTricks, Hand playerHand, String trump) {
        //GameView gameView = new GameView()

    }
    public void initializeView(GameView gameView) {
        setTitle("Euchre");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320,180);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void updateView() {

    }


}
