import com.mysql.jdbc.Connection;

import java.io.FileInputStream;
import java.sql.*;
import javax.swing.*;
import java.util.Properties;

public class GameDAO {
    private Connection myConn;
    String gameMode;
    int place = 0;
    static int points = 0;

    GameDAO() throws Exception {

        if (Game.isDouble) {
            gameMode = "Double out";
        } else if (!Game.isDouble) {
            gameMode = "Single out";
        }

        //get db properties
        Class.forName("com.mysql.jdbc.Driver");
        Properties props = new Properties();
        props.load(new FileInputStream("game.properties"));

        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String dburl = props.getProperty("dburl");

        //connect to database
        myConn = (Connection) DriverManager.getConnection(dburl, user, password);

        System.out.println("DB connection successful to: " + dburl);
    }

    public void getAllData() {

        try {
            String sql = "select * from scoreboard";
            PreparedStatement ps = myConn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String player = rs.getString("PlayerName");
                String mode = rs.getString("GameMode");
                int pointsNum = rs.getInt("PointsNum");
                int throwsNum = rs.getInt("NumOfThrows");
                Timestamp date = rs.getTimestamp("Date");
                ScoreBoard.model.addRow(new Object[]{player, mode, pointsNum, throwsNum, date});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void getHighScore() {

        try {
            String sql = "select * from scoreboard where GameMode = " + "'" + gameMode + "'" + " and PointsNum = " + points + " order by NumOfThrows ASC";
            PreparedStatement ps = myConn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                place++;
                String player = rs.getString("PlayerName");
                String mode = rs.getString("GameMode");
                int pointsNum = rs.getInt("PointsNum");
                int throwsNum = rs.getInt("NumOfThrows");
                Timestamp date = rs.getTimestamp("Date");
                HighScore.highScoreModel.addRow(new Object[]{place, player, mode, pointsNum, throwsNum, date});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertDataForPlayer1() {
        try {
            PreparedStatement ps = myConn.prepareStatement("INSERT INTO scoreboard (PlayerName, GameMode, PointsNum, NumOfThrows, Date) VALUES(?,?,?,?,?)");
            ps.setString(1, Game.player1name);
            ps.setString(2, gameMode);
            ps.setInt(3, points);
            ps.setInt(4, Game.player1throws);
            ps.setTimestamp(5, new java.sql.Timestamp(new java.util.Date().getTime()));
            ps.executeUpdate();

            ps.close();
            myConn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertDataForPlayer2() {
        try {
            PreparedStatement ps = myConn.prepareStatement("INSERT INTO scoreboard (PlayerName, GameMode, PointsNum, NumOfThrows, Date) VALUES(?,?,?,?,?)");
            ps.setString(1, Game.player2name);
            ps.setString(2, gameMode);
            ps.setInt(3, points);
            ps.setInt(4, Game.player2throws);
            ps.setTimestamp(5, new java.sql.Timestamp(new java.util.Date().getTime()));
            ps.executeUpdate();

            ps.close();
            myConn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
