import javax.swing.*;

public class InitializeDialog extends JPanel {
    JTextField player1 = new JTextField();
    JTextField player2 = new JTextField();
    static Game newGame;

    Object[] message = {
            "Nazwa Gracza 1:", player1,
            "Nazwa Gracza 2:", player2
    };

    InitializeDialog() {
        int option = JOptionPane.showConfirmDialog(null, message, "Rozpocznij Nową Grę", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            Game.player1name = player1.getText();
            Game.player2name = player2.getText();

            ButtonGroup points = new ButtonGroup();
            JRadioButton radio1 = new JRadioButton("201");
            JRadioButton radio2 = new JRadioButton("301");
            JRadioButton radio3 = new JRadioButton("401");
            JRadioButton radio4 = new JRadioButton("501", true);
            points.add(radio1);
            points.add(radio2);
            points.add(radio3);
            points.add(radio4);
            String message = "Wybierz liczbę punktów";
            Object[] params = {message, radio1, radio2, radio3, radio4};
            int option2 = JOptionPane.showConfirmDialog(null, params, "Wybierz liczbę punktów", JOptionPane.YES_NO_OPTION);
            if (option2 == JOptionPane.OK_OPTION) {
                if (radio1.isSelected()) {
                    Game.player1Points = 201;
                    Game.player2Points = 201;
                    GameDAO.points = 201;
                } else if (radio2.isSelected()) {
                    Game.player1Points = 301;
                    Game.player2Points = 301;
                    GameDAO.points = 301;
                } else if (radio3.isSelected()) {
                    Game.player1Points = 401;
                    Game.player2Points = 401;
                    GameDAO.points = 401;
                } else if (radio4.isSelected()) {
                    Game.player1Points = 501;
                    Game.player2Points = 501;
                    GameDAO.points = 501;
                }

                ButtonGroup gameMode = new ButtonGroup();
                JRadioButton radio_gameMode1 = new JRadioButton("Single out");
                JRadioButton radio_gameMode2 = new JRadioButton("Double out", true);
                gameMode.add(radio_gameMode1);
                gameMode.add(radio_gameMode2);
                String message_gameMode = "Wybierz tryb gry:";
                Object[] params_gameMode = {message_gameMode, radio_gameMode1, radio_gameMode2};
                int option3 = JOptionPane.showConfirmDialog(null, params_gameMode, "Wybierz tryb gry", JOptionPane.YES_NO_OPTION);
                if (option3 == JOptionPane.OK_OPTION) {
                    if (radio_gameMode1.isSelected()) {
                        Game.isDouble = false;
                    } else if (radio_gameMode2.isSelected()) {
                        Game.isDouble = true;
                    }
                    newGame = new Game();
                    System.out.println("initializing game...");
                }
            }
        }
    }
}
