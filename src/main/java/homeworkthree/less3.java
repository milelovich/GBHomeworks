package homeworkthree;
import java.util.Random;
import java.util.Scanner;

public class less3 {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 9");
        game();
    }

    public static void game() {
        Random rand = new Random();
        int number = rand.nextInt(10);
        Scanner in = new Scanner(System.in);
        System.out.print("У вас 3 попытки");

        int count = 0;
        while (count < 3) {
            int inputNumber = in.nextInt();

            if (inputNumber > 9 || inputNumber < 0) {
                System.out.print("Число должно быть 0 до 9");
                System.out.println("\n");
                game();
                break;
            }

            if (number > inputNumber) {
                System.out.println("Загаданное число больше " + inputNumber + "\n");
            }
            if (number < inputNumber) {
                System.out.println("Загаданное число меньше " + inputNumber + "\n");
            }
            if (number == inputNumber) {
                System.out.println("Правильно! Загаданное число " + number + "\n");
                break;
            }
            count++;

            if (count == 3) {
                System.out.println("\nВаши попытки закончились, попробуем еще раз? \n0 - нет, 1 - да");
                int user_choice = in.nextInt();
                switch (user_choice) {
                    case 0:
                        System.out.println("GAME OVER");
                        break;
                    case 1:
                        System.out.println("Новая игра!");
                        game();
                        break;
                }
                break;
            }

            System.out.print("Попробуйте еще раз: ");

        }
    }

}
