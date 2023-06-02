/**
 * This class handles user input and interactions,
 * playing cards, and other game actions.
 * It communicates with the Model to update the
 * game state and triggers updates to the View.
 * 
 * It also manages the AI players' actions and decision-making process.
 * It interacts with the Model to make AI players bid, play cards,
 * and perform other game-related actions.
 */
public class GameController {

    private Game game = new Game();

    public void startView() {
        // insert correct parameters
        GameView gameView = new GameView(0,0,0, game.getPlayerHand(), "Diamonds");
        gameView.initializeView(gameView);
    }


    public void playCard() {
        // add card to trick
    }

}
