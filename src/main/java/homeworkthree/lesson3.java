//package homeworkthree;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class lesson3 {
//    public static void main(String[] args) {
//
//        // Написать программу, которая загадывает случайное число от 0 до 9
//        // и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
//        // больше ли указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
//        // выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
//
//        Scanner scanner = new Scanner(System.in);
//        //   while (true) {
//        Random random = new Random();
//        int myNumber = random.nextInt();
//        int secretNumber = 0;
//        int count = 0;
//        int again = 0;
//        while (true) {
//            //  for(int i = 1;; i++) {
//            System.out.println("Угадай число");
//
//            if (scanner.hasNextInt()) {
//                myNumber = scanner.nextInt();
//                count++;
//            } else {
//                scanner.nextLine();
//                continue;
//            }
//
//            scanner.nextLine();
//            if (myNumber == secretNumber) {
//                System.out.println("Вы выиграли!");
//                break;
//            }
//            if (myNumber < secretNumber) {
//                System.out.println("Ваше число меньше");
//            }
//            if (myNumber > secretNumber) {
//                System.out.println("Ваше число больше");
//            }
//            if (count == 3) {
//                System.out.println("Ваши попытки закончились");
//                break;
//            }
//        }
//
//
//            System.out.println("Хотите сыграть еще? 0 - нет, 1 - да");
//
//            while (true) {
//                if (scanner.hasNextInt()) {
//                    again = scanner.nextInt();
//                } else {
//                    scanner.nextLine();
//                    continue;
//                }
//
//                scanner.nextLine();
//                if (again != 1 || again != 0) {
//                    continue;
//                } else {
//                    break;
//                }
//            }
//                if (again == 0){
//                    break;
//                }
//
//            }
//
//        }
//    }
//
//
//
//
