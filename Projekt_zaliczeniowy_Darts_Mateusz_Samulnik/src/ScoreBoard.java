import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class ScoreBoard extends JFrame {

    static JTable scoreTable;
    static DefaultTableModel model;
    String[] columnNames = {"Imie gracza", "Tryb gry", "Liczba punktow", "Liczba rzutow", "Data"};

    ScoreBoard() throws Exception {
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER);
        setLayout(layout);
        setTitle("Score Board");
        setVisible(true);
        setSize(800, 600);
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        scoreTable = new JTable();
        scoreTable.setModel(model);
        scoreTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        scoreTable.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(scoreTable);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        GameDAO dao = new GameDAO();
        dao.getAllData();

        add(scroll);
    }
}
