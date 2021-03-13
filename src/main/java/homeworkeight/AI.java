package homeworkeight;

import java.util.Random;

public class AI extends AGamer {
    MainGameField gameField;
    String playerSign = "";


    public AI(String sign, String playerSign) {
        this.sign = sign;
        this.playerSign = playerSign;

    }

    boolean shot(int x, int y) {
        gameField = MainGameField.getInstance();
        x = -1;
        y = -1;
        boolean ai_win = false;
        boolean user_win = false;

        if (!ai_win && !user_win) {
            do {
                Random rnd = new Random();
                x = rnd.nextInt(3);
                y = rnd.nextInt(3);
            }
            while (gameField.isCellBusy(x, y));
        }
        gameField.cell[x][y] = sign;
        return true;
    }

    boolean win() {
        gameField = MainGameField.getInstance();
        return gameField.checkWin(this.sign);
    }
}
