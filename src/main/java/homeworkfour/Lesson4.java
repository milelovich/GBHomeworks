package homeworkfour;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
        public static char[][] map; // создание игрового поля в виде 2-х мерного массива
        public static final int SIZE = 3; // константа размера поля
        public static final int DOTS_TO_WIN = 3; // константа количества фишек для победы

        //именные константы символов поля:
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';

            //инициализация поля с пустыми точками:
            public static void initMap() {
                map = new char[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++){
                    for (int j = 0; j < SIZE; j++) {
                        map[i][j] = DOT_EMPTY;
                    }

                }

        }
        // вывод поля в консоль:
        public static void printMap(){
                for (int i = 0; i <= SIZE; i++) {
                    System.out.print( i + " ");
                }
            System.out.println();
                for (int i = 0; i < SIZE; i++) {
                    System.out.print((i + 1) + " ");
                    for (int j = 0; j < SIZE; j++) {
                        System.out.print(map[i][j] + " ");
                    }
                    System.out.println();
                }
            System.out.println();
        }

        // ход человека:
        public static Scanner sc = new Scanner(System.in);
            public static void humanTurn() {
                int x, y;
                do {
                    System.out.println("Введите координаты X Y");
                    x = sc.nextInt() - 1;
                    y = sc.nextInt() - 1;
                } while (!isCellValid(x, y));
                map[y][x] = DOT_X;
            }

            // проверка ячейки:
    public static boolean isCellValid(int x, int y) {
                if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
                if (map[y][x] == DOT_EMPTY) return true;
                return false;
    }

    // ход программы:

    public static Random rand = new Random();
            public static void aiTurn() {
                int x, y;
                do {
                    x = rand.nextInt(SIZE);
                    y = rand.nextInt(SIZE);
                } while (!isCellValid(x, y));
                System.out.println("Программа сделала ход " + (x + 1) + " " + (y + 1));
                map[y][x] = DOT_O;
            }

            // проверка выигрыша:

    public static boolean checkWin(char symb) {
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;


        for (int i = 0; i < 3; i++)    // цикл проверяет три одинаковых знака подряд, по вертикали или горизонтали
            if ((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) || (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb))
                return true;

            // проверка трех одинаковых знаков по двум диагоналям
        if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) ||
                (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb))
            return true;
        return false;


    }

    // проверка заполнения поля:

    public static boolean isMapFool(){
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++){
                        if (map[i][j] == DOT_EMPTY) return false;
                    }
                } return true;
    }

    // вывод поля и вызов ходов:
    // ход человека
    // проверка: если победа человека или ничья:
    // сообщить и выйти из цикла
    // ход компьютера
    // проверка: если победа компьютера или ничья:
    // сообщить и выйти из цикла

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Победил человек :-)");
                break;
            }

            if (isMapFool()){
                System.out.println("Ничья :-/");
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Победила программа :-(");
            }

            if (isMapFool()) {
                System.out.println("Ничья :-/");
                break;
            }
        }
        System.out.println("GAME OVER");

    }


}


