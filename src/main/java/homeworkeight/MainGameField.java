package homeworkeight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class MainGameField extends JPanel {
    private static MainGameField instance = null; //  игровое поле
    public static final int FIELD_SIZE = 450;     // размер игрового поля
    public final String NOT_SIGN = "*";    // начальное значение ячеек поля
    boolean gameOver = false;     // закончилась ли игра
    String gameOverMessage = "";    // сообщение, которое появится при завершении игры

    int cellSize;
    int x;
    int y;

    boolean nextTurn = false;     // чей ход

    public String[][] cell;

    public static synchronized MainGameField getInstance() {
        if (instance == null)
            instance = new MainGameField();
        return instance;
    }

    void startNewGame() {
        gameOver = false;
        gameOverMessage = "";
        cellSize = FIELD_SIZE / 3;
        cell = new String[3][3];
        repaint();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cell[i][j] = NOT_SIGN;
            }
        }
        setVisible(true);
    }

    private MainGameField() {
        setVisible(false);

// счит координаты клика мыши
            addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                x = e.getX() / cellSize;
                y = e.getY() / cellSize;

                if (!gameOver) {
                    TTT();
                }
            }
        });
    }

    void TTT() {

        Player player = new Player("X");
        AI ai = new AI("O", player.sign);

        if (!gameOver) {
            if (player.shot(x, y)) {
                if (player.win()) {
                    gameOver = true;
                    gameOverMessage = "Вы выиграли";
                }
                if (isFieldFull()) {
                    gameOver = true;
                    gameOverMessage = "Ничья";
                }
                repaint();


                if (!gameOver) {
                    ai.shot(x, y);
                }
                if (ai.win()) {
                    gameOver = true;
                    gameOverMessage = "Победила программа";
                }
                repaint();


                if (isFieldFull() && !ai.win()) {
                    gameOver = true;
                    gameOverMessage = "Ничья";
                }
            }
        }
    }

    boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return cell[x][y] != NOT_SIGN;
    }

    public boolean isFieldFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cell[i][j] == NOT_SIGN)
                    return false;
            }
        }
        return true;
    }

    public boolean checkLine(int start_x, int start_y, int dx, int dy, String sign) {
        for (int i = 0; i < 3; i++) {
            if (cell[start_x + i * dx][start_y + i * dy] != sign)
                return false;
        }
        return true;
    }

    public boolean checkWin(String sign) {
        for (int i = 0; i < 3; i++) {
            // проверяем строки
            if (checkLine(i, 0, 0, 1, sign)) return true;
            // проверяем столбцы
            if (checkLine(0, i, 1, 0, sign)) return true;
        }
        // проверяем диагонали
        if (checkLine(0, 0, 1, 1, sign)) return true;
        if (checkLine(0, 2, 1, -1, sign)) return true;
        return false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i <= 3; i++) {
            g.drawLine(0, i * this.cellSize, FIELD_SIZE, i * this.cellSize);
            g.drawLine(i * this.cellSize, 0, i * this.cellSize, FIELD_SIZE);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cell[i][j] != NOT_SIGN) {
                    if (cell[i][j] == "X") {
                        g.setColor(Color.RED);
                        g.drawLine((i * cellSize), (j * cellSize), (i + 1) * cellSize, (j + 1) * cellSize);
                        g.drawLine((i + 1) * cellSize, (j * cellSize), (i * cellSize), (j + 1) * cellSize);
                    }
                    if (cell[i][j] == "O" || cell[i][j] == "O") {
                        g.setColor(Color.BLUE);
                        g.drawOval((i * cellSize), (j * cellSize), cellSize, cellSize);
                    }
                }
            }
        }

        if (gameOver) {
            g.setColor(Color.RED);
            g.fillRect(0, 0, FIELD_SIZE, FIELD_SIZE);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", 10, 40));
            g.drawString(gameOverMessage, 5, 19 * FIELD_SIZE / 32);
        }
    }
}
