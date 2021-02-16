import javax.swing.*;

public class EndGame extends JPanel {
    Object[] player1win = {
            "Gratulacje! Zwycięża: " + Game.player1name,
            "Liczba rzutów: " + Game.player1throws
    };

    Object[] player2win = {
            "Gratulacje! Zwycięża: " + Game.player2name,
            "Liczba rzutów: " + Game.player2throws
    };


    EndGame() throws Exception {
        if (Game.player1Points == 0) {
            int finishP1 = JOptionPane.showConfirmDialog(null, player1win, "Koniec gry!", JOptionPane.DEFAULT_OPTION);
            if (finishP1 == JOptionPane.OK_OPTION) {
                System.out.println("Go to score table");
                InitializeDialog.newGame.setVisible(false);
                GameDAO dao = new GameDAO();
                dao.insertDataForPlayer1();
                ScoreBoard scoreBoard = new ScoreBoard();
            }
        } else if (Game.player2Points == 0) {
            int finishP2 = JOptionPane.showConfirmDialog(null, player2win, "Koniec gry!", JOptionPane.DEFAULT_OPTION);
            if (finishP2 == JOptionPane.OK_OPTION) {
                System.out.println("Go to score table");
                InitializeDialog.newGame.setVisible(false);
                GameDAO dao = new GameDAO();
                dao.insertDataForPlayer2();
                ScoreBoard scoreBoard = new ScoreBoard();
            }
        }
    }

}
