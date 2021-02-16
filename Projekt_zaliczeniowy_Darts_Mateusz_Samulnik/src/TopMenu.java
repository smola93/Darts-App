import javax.swing.*;
import java.awt.event.*;

public class TopMenu extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenu newGame = new JMenu("Nowa Gra");
    JMenu scoreTable = new JMenu("Tabela Wynikow");
    JMenu highScore = new JMenu("HIGH SCORE");
    JMenuItem startNewGame = new JMenuItem("Rozpocznij nowa gre");
    JMenuItem showScoreTable = new JMenuItem("Pokaz tabele wynikow");
    JMenuItem showHighScore = new JMenuItem("Wyswietl najlepszych graczy");

    TopMenu() {
        startNewGame.addActionListener(this);
        showScoreTable.addActionListener(this);
        showHighScore.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == startNewGame) {
            InitializeDialog initialize = new InitializeDialog();
        } else if (e.getSource() == showScoreTable) {
            try {
                ScoreBoard scoreBoard = new ScoreBoard();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == showHighScore) {
            try {
                HighScore highScore = new HighScore();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}