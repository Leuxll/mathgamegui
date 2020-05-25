import javax.swing.*;

public class GameMenu extends JFrame{
    private JPanel gameMenuPanel;

    public GameMenu(String title) {

        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(gameMenuPanel);
        this.pack();

    }

    public static void main(String[] args) {

        JFrame frame = new GameMenu("Game Menu");
        frame.setVisible(true);

    }

}
