import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HighScore extends JFrame {
    static JTable highScoreTable;
    static DefaultTableModel highScoreModel;
    String[] columnNames = {"Pozycja", "Imie gracza", "Tryb gry", "Liczba punktow", "Liczba rzutow", "Data"};

    HighScore() throws Exception {
        ButtonGroup mode = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("Double out");
        JRadioButton radio2 = new JRadioButton("Single out");
        mode.add(radio1);
        mode.add(radio2);
        String message = "Wybierz tryb gry:";
        Object[] params = {message, radio1, radio2};
        int option = JOptionPane.showConfirmDialog(null, params, "Pokaz tabele najlepszych", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (radio1.isSelected()) {
                Game.isDouble = true;
            } else if (radio2.isSelected()) {
                Game.isDouble = false;
            }
            ButtonGroup points = new ButtonGroup();
            JRadioButton pointsRadio1 = new JRadioButton("201");
            JRadioButton pointsRadio2 = new JRadioButton("301");
            JRadioButton pointsRadio3 = new JRadioButton("401");
            JRadioButton pointsRadio4 = new JRadioButton("501");
            points.add(pointsRadio1);
            points.add(pointsRadio2);
            points.add(pointsRadio3);
            points.add(pointsRadio4);
            String pointsMessage = "Wybierz liczbe punktow:";
            Object[] pointsParams = {pointsMessage, pointsRadio1, pointsRadio2, pointsRadio3, pointsRadio4};
            int option2 = JOptionPane.showConfirmDialog(null, pointsParams, "Pokaz tabele najlepszych", JOptionPane.YES_NO_OPTION);
            if (option2 == JOptionPane.OK_OPTION) {
                if (pointsRadio1.isSelected()) {
                    GameDAO.points = 201;
                } else if (pointsRadio2.isSelected()) {
                    GameDAO.points = 301;
                } else if (pointsRadio3.isSelected()) {
                    GameDAO.points = 401;
                } else if (pointsRadio4.isSelected()) {
                    GameDAO.points = 501;
                }

                LayoutManager layout = new FlowLayout(FlowLayout.CENTER);
                setLayout(layout);
                setTitle("Score Board");
                setVisible(true);
                setSize(800, 600);
                highScoreModel = new DefaultTableModel();
                highScoreModel.setColumnIdentifiers(columnNames);
                highScoreTable = new JTable();
                highScoreTable.setModel(highScoreModel);
                highScoreTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                highScoreTable.setFillsViewportHeight(true);
                JScrollPane scroll = new JScrollPane(highScoreTable);
                scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

                GameDAO dao = new GameDAO();
                dao.getHighScore();

                add(scroll);
            }
        }
    }
}
