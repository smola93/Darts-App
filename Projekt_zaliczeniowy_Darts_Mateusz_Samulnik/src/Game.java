import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {
    static String player1name;
    static String player2name;
    static int player1Points;
    static int player2Points;
    static boolean isDouble;
    static int player1throws;
    static int player2throws;
    int subtractPoints;
    int eventsCounter = 4;
    boolean player1Turn = true;
    boolean finishedByDouble = false;
    JPanel scoreBoard = new JPanel();
    JPanel turnBoard = new JPanel();
    JPanel pointsBoard = new JPanel();
    JLabel showPoints = new JLabel();
    JLabel showTurn = new JLabel();

    JButton single1 = new JButton("1");
    JButton double1 = new JButton("Double 1");
    JButton triple1 = new JButton("Triple 1");
    JButton single2 = new JButton("2");
    JButton double2 = new JButton("Double 2");
    JButton triple2 = new JButton("Triple 2");
    JButton single3 = new JButton("3");
    JButton double3 = new JButton("Double 3");
    JButton triple3 = new JButton("Triple 3");
    JButton single4 = new JButton("4");
    JButton double4 = new JButton("Double 4");
    JButton triple4 = new JButton("Triple 4");
    JButton single5 = new JButton("5");
    JButton double5 = new JButton("Double 5");
    JButton triple5 = new JButton("Triple 5");
    JButton single6 = new JButton("6");
    JButton double6 = new JButton("Double 6");
    JButton triple6 = new JButton("Triple 6");
    JButton single7 = new JButton("7");
    JButton double7 = new JButton("Double 7");
    JButton triple7 = new JButton("Triple 7");
    JButton single8 = new JButton("8");
    JButton double8 = new JButton("Double 8");
    JButton triple8 = new JButton("Triple 8");
    JButton single9 = new JButton("9");
    JButton double9 = new JButton("Double 9");
    JButton triple9 = new JButton("Triple 9");
    JButton single10 = new JButton("10");
    JButton double10 = new JButton("Double 10");
    JButton triple10 = new JButton("Triple 10");
    JButton single11 = new JButton("11");
    JButton double11 = new JButton("Double 11");
    JButton triple11 = new JButton("Triple 11");
    JButton single12 = new JButton("12");
    JButton double12 = new JButton("Double 12");
    JButton triple12 = new JButton("Triple 12");
    JButton single13 = new JButton("13");
    JButton double13 = new JButton("Double 13");
    JButton triple13 = new JButton("Triple 13");
    JButton single14 = new JButton("14");
    JButton double14 = new JButton("Double 14");
    JButton triple14 = new JButton("Triple 14");
    JButton single15 = new JButton("15");
    JButton double15 = new JButton("Double 15");
    JButton triple15 = new JButton("Triple 15");
    JButton single16 = new JButton("16");
    JButton double16 = new JButton("Double 16");
    JButton triple16 = new JButton("Triple 16");
    JButton single17 = new JButton("17");
    JButton double17 = new JButton("Double 17");
    JButton triple17 = new JButton("Triple 17");
    JButton single18 = new JButton("18");
    JButton double18 = new JButton("Double 18");
    JButton triple18 = new JButton("Triple 18");
    JButton single19 = new JButton("19");
    JButton double19 = new JButton("Double 19");
    JButton triple19 = new JButton("Triple 19");
    JButton single20 = new JButton("20");
    JButton double20 = new JButton("Double 20");
    JButton triple20 = new JButton("Triple 20");
    JButton centre25 = new JButton("25");
    JButton centre50 = new JButton("50");
    JButton missed = new JButton("Missed!");

    Game() {
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER);
        setLayout(layout);
        setTitle("GAME");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(800, 800);

        //Tablica wyników
        scoreBoard.add(showPoints);
        showPoints.setText("<html>Gracz 1: " + player1name + "<br/>Punkty: " + player1Points +
                "<br/><br/>Gracz 2: " + player2name + "<br/>Punkty:" + player2Points + "</html>");
        scoreBoard.setBorder(new TitledBorder("Tablica wyników:"));
        add(scoreBoard);
        scoreBoard.setPreferredSize(new Dimension(300, 120));

        turnBoard.add(showTurn);
        if (eventsCounter == 4) {
            showTurn.setText("<html>Gracz 1: " + "* * *" + "<br/>Gracz 2: " + " " + "</html>");
        }
        turnBoard.setBorder(new TitledBorder("Liczba rzutów:"));
        add(turnBoard);
        turnBoard.setPreferredSize(new Dimension(300, 120));

        //Przyciski punktów
        add(pointsBoard);
        pointsBoard.setLayout(new GridLayout(0, 3));
        pointsBoard.add(single1);
        pointsBoard.add(double1);
        pointsBoard.add(triple1);

        pointsBoard.add(single2);
        pointsBoard.add(double2);
        pointsBoard.add(triple2);

        pointsBoard.add(single3);
        pointsBoard.add(double3);
        pointsBoard.add(triple3);

        pointsBoard.add(single4);
        pointsBoard.add(double4);
        pointsBoard.add(triple4);

        pointsBoard.add(single5);
        pointsBoard.add(double5);
        pointsBoard.add(triple5);

        pointsBoard.add(single6);
        pointsBoard.add(double6);
        pointsBoard.add(triple6);

        pointsBoard.add(single7);
        pointsBoard.add(double7);
        pointsBoard.add(triple7);

        pointsBoard.add(single8);
        pointsBoard.add(double8);
        pointsBoard.add(triple8);

        pointsBoard.add(single9);
        pointsBoard.add(double9);
        pointsBoard.add(triple9);

        pointsBoard.add(single10);
        pointsBoard.add(double10);
        pointsBoard.add(triple10);

        pointsBoard.add(single11);
        pointsBoard.add(double11);
        pointsBoard.add(triple11);

        pointsBoard.add(single12);
        pointsBoard.add(double12);
        pointsBoard.add(triple12);

        pointsBoard.add(single13);
        pointsBoard.add(double13);
        pointsBoard.add(triple13);

        pointsBoard.add(single14);
        pointsBoard.add(double14);
        pointsBoard.add(triple14);

        pointsBoard.add(single15);
        pointsBoard.add(double15);
        pointsBoard.add(triple15);

        pointsBoard.add(single16);
        pointsBoard.add(double16);
        pointsBoard.add(triple16);

        pointsBoard.add(single17);
        pointsBoard.add(double17);
        pointsBoard.add(triple17);

        pointsBoard.add(single18);
        pointsBoard.add(double18);
        pointsBoard.add(triple18);

        pointsBoard.add(single19);
        pointsBoard.add(double19);
        pointsBoard.add(triple19);

        pointsBoard.add(single20);
        pointsBoard.add(double20);
        pointsBoard.add(triple20);

        pointsBoard.add(centre25);
        pointsBoard.add(centre50);
        pointsBoard.add(missed);

        //logic
        single1.addActionListener(this);
        double1.addActionListener(this);
        triple1.addActionListener(this);

        single2.addActionListener(this);
        double2.addActionListener(this);
        triple2.addActionListener(this);

        single3.addActionListener(this);
        double3.addActionListener(this);
        triple3.addActionListener(this);

        single4.addActionListener(this);
        double4.addActionListener(this);
        triple4.addActionListener(this);

        single5.addActionListener(this);
        double5.addActionListener(this);
        triple5.addActionListener(this);

        single6.addActionListener(this);
        double6.addActionListener(this);
        triple6.addActionListener(this);

        single7.addActionListener(this);
        double7.addActionListener(this);
        triple7.addActionListener(this);

        single8.addActionListener(this);
        double8.addActionListener(this);
        triple8.addActionListener(this);

        single9.addActionListener(this);
        double9.addActionListener(this);
        triple9.addActionListener(this);

        single10.addActionListener(this);
        double10.addActionListener(this);
        triple10.addActionListener(this);

        single11.addActionListener(this);
        double11.addActionListener(this);
        triple11.addActionListener(this);

        single12.addActionListener(this);
        double12.addActionListener(this);
        triple12.addActionListener(this);

        single13.addActionListener(this);
        double13.addActionListener(this);
        triple13.addActionListener(this);

        single14.addActionListener(this);
        double14.addActionListener(this);
        triple14.addActionListener(this);

        single15.addActionListener(this);
        double15.addActionListener(this);
        triple15.addActionListener(this);

        single16.addActionListener(this);
        double16.addActionListener(this);
        triple16.addActionListener(this);

        single17.addActionListener(this);
        double17.addActionListener(this);
        triple17.addActionListener(this);

        single18.addActionListener(this);
        double18.addActionListener(this);
        triple18.addActionListener(this);

        single19.addActionListener(this);
        double19.addActionListener(this);
        triple19.addActionListener(this);

        single20.addActionListener(this);
        double20.addActionListener(this);
        triple20.addActionListener(this);

        centre25.addActionListener(this);
        centre50.addActionListener(this);
        missed.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        eventsCounter--;
        if (eventsCounter == -1) {
            eventsCounter = 2;
        }
        if (e.getSource() == single1) {
            subtractPoints = 1;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double1) {
            subtractPoints = 1 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple1) {
            subtractPoints = 1 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single2) {
            subtractPoints = 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double2) {
            subtractPoints = 2 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple2) {
            subtractPoints = 2 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single3) {
            subtractPoints = 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double3) {
            subtractPoints = 3 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple3) {
            subtractPoints = 3 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single4) {
            subtractPoints = 4;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double4) {
            subtractPoints = 4 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple4) {
            subtractPoints = 4 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single5) {
            subtractPoints = 5;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double5) {
            subtractPoints = 5 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple5) {
            subtractPoints = 5 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single6) {
            subtractPoints = 6;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double6) {
            subtractPoints = 6 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple6) {
            subtractPoints = 6 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single7) {
            subtractPoints = 7;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double7) {
            subtractPoints = 7 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple7) {
            subtractPoints = 7 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single8) {
            subtractPoints = 8;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double8) {
            subtractPoints = 8 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple8) {
            subtractPoints = 8 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single9) {
            subtractPoints = 9;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double9) {
            subtractPoints = 9 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple9) {
            subtractPoints = 9 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single10) {
            subtractPoints = 10;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double10) {
            subtractPoints = 10 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple10) {
            subtractPoints = 10 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single11) {
            subtractPoints = 11;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double11) {
            subtractPoints = 11 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple11) {
            subtractPoints = 11 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single12) {
            subtractPoints = 12;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double12) {
            subtractPoints = 12 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple12) {
            subtractPoints = 12 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single13) {
            subtractPoints = 13;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double13) {
            subtractPoints = 13 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple13) {
            subtractPoints = 13 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single14) {
            subtractPoints = 14;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double14) {
            subtractPoints = 14 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple14) {
            subtractPoints = 14 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single15) {
            subtractPoints = 15;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double15) {
            subtractPoints = 15 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple15) {
            subtractPoints = 15 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single16) {
            subtractPoints = 16;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double16) {
            subtractPoints = 16 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple16) {
            subtractPoints = 16 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single17) {
            subtractPoints = 17;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double17) {
            subtractPoints = 17 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple17) {
            subtractPoints = 17 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single18) {
            subtractPoints = 18;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double18) {
            subtractPoints = 18 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple18) {
            subtractPoints = 18 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single19) {
            subtractPoints = 19;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double19) {
            subtractPoints = 19 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple19) {
            subtractPoints = 19 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == single20) {
            subtractPoints = 20;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == double20) {
            subtractPoints = 20 * 2;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == triple20) {
            subtractPoints = 20 * 3;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == centre25) {
            subtractPoints = 25;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == centre50) {
            subtractPoints = 50;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (e.getSource() == missed) {
            subtractPoints = 0;
            try {
                update();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        if (isDouble) {
            if (player1Points < 51 || player2Points < 51) {
                if (e.getSource() == double1 || e.getSource() == double2 || e.getSource() == double3 ||
                        e.getSource() == double4 || e.getSource() == double5 || e.getSource() == double6 ||
                        e.getSource() == double7 || e.getSource() == double8 || e.getSource() == double9 ||
                        e.getSource() == double10 || e.getSource() == double11 || e.getSource() == double12 ||
                        e.getSource() == double13 || e.getSource() == double14 || e.getSource() == double15 ||
                        e.getSource() == double16 || e.getSource() == double17 || e.getSource() == double18 ||
                        e.getSource() == double19 || e.getSource() == double20 || e.getSource() == centre50) {
                    if (player1Points == subtractPoints || player2Points == subtractPoints) {
                        finishedByDouble = true;
                    }
                }
            }
        }
    }

    public void update() throws Exception {

        if (eventsCounter == 0 && player1Turn) {
            player1Turn = false;
        } else if (eventsCounter == 0 && !player1Turn) {
            player1Turn = true;
        }

        if (player1Turn) {
            updateBoardPlayer1();
            player1Points = player1Points - subtractPoints;
            player1throws++;
        } else {
            updateBoardPlayer2();
            player2Points = player2Points - subtractPoints;
            player2throws++;
        }
        endGame();


        showPoints.setText("<html>Gracz 1: " + player1name + "<br/>Punkty: " + player1Points +
                "<br/><br/>Gracz 2: " + player2name + "<br/>Punkty:" + player2Points + "</html>");
    }

    public void updateBoardPlayer1() {
        if (eventsCounter == 3) {
            showTurn.setText("<html>Gracz 1: " + "* * " + "<br/>Gracz 2: " + " " + "</html>");
        } else if (eventsCounter == 2) {
            showTurn.setText("<html>Gracz 1: " + "*  " + "<br/>Gracz 2: " + " " + "</html>");
        } else if (eventsCounter == 1) {
            showTurn.setText("<html>Gracz 1: " + " " + "<br/>Gracz 2: " + "* * * " + "</html>");
        } else if (eventsCounter == 0) {
            showTurn.setText("<html>Gracz 1: " + "* * " + "<br/>Gracz 2: " + " " + "</html>");
        }
    }

    public void updateBoardPlayer2() {
        if (eventsCounter == 2) {
            showTurn.setText("<html>Gracz 1: " + " " + "<br/>Gracz 2: " + "* " + "</html>");
        } else if (eventsCounter == 1) {
            showTurn.setText("<html>Gracz 1: " + "* * * " + "<br/>Gracz 2: " + " " + "</html>");
        } else if (eventsCounter == 0) {
            showTurn.setText("<html>Gracz 1: " + " " + "<br/>Gracz 2: " + "* * " + "</html>");
        }
    }

    public void endGame() throws Exception {
        if (!isDouble) {
            if (player1Points < 0 || player2Points < 0) {
                if (player1Turn) {
                    player1Points += subtractPoints;
                    player1throws++;
                } else if (!player1Turn) {
                    player2Points += subtractPoints;
                    player2throws++;
                }
            } else if (player1Points == 0 || player2Points == 0) {
                System.out.println("Game finished");
                EndGame end = new EndGame();
            }
        } else if (isDouble) {
            if (player1Points < 0 || player2Points < 0) {
                if (player1Turn) {
                    player1Points += subtractPoints;
                    player1throws++;
                } else if (!player1Turn) {
                    player2Points += subtractPoints;
                    player2throws++;
                }
            } else if (((player1Points == 0 || player2Points == 0) || (player1Points == 1 || player2Points == 1)) && !finishedByDouble) {
                if (player1Turn) {
                    player1Points += subtractPoints;
                    player1throws++;
                } else if (!player1Turn) {
                    player2Points += subtractPoints;
                    player2throws++;
                }
            } else if ((player1Points == 0 || player2Points == 0) && finishedByDouble) {
                System.out.println("Game finished");
                EndGame end = new EndGame();
            }
        }
    }
}