import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    static StartPanel startPanel = new StartPanel();
    static TopMenu topMenu = new TopMenu();

    MainFrame() {
        setTitle("DARTS V1.0");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




        setJMenuBar(topMenu.menuBar);
        topMenu.menuBar.add(topMenu.newGame);
        topMenu.menuBar.add(topMenu.scoreTable);
        topMenu.menuBar.add(topMenu.highScore);
        topMenu.newGame.add(topMenu.startNewGame);
        topMenu.scoreTable.add(topMenu.showScoreTable);
        topMenu.highScore.add(topMenu.showHighScore);


        add(startPanel, BorderLayout.CENTER);
        pack();
    }


}
