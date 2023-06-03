/**
 * Main class for Euchre game.
 * Includes all necessary calls to start the program
 */
public class Main {

    /**
     * Main function that makes necessary calls to start the Euchre application
     * @param args String[] of arguments returned
     */
    public static void main(String[] args) {
        GameController gController = new GameController();
        gController.startView();
        /*AIController aiController = new AIController();*/

        //GameView view = new GameView(0,0,0,null);
        System.out.println("Hello World");

    }

}
