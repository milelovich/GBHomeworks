package homeworkseven;

import java.util.Scanner;

public class Plate {

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int foodAdd(){
        System.out.println("Хотите пополнить тарелку? Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        food = food + number;
        System.out.println("Содержимое тарелки: " + food);
        return food;
    }

    public void info() {
        System.out.println("Содержимое тарелки: " + food);
    }

    public void infoEnd() {
        System.out.println("Осталось в тарелке: " + food);
    }

    public boolean plateContent(){
        if (food > 0) {
            return true;
           // эх что-то у меня не получается обратиться из класса тарелки к переменной аппетит класса кошка
            // чтобы сравнить, больше ли food, чем аппетит :-( экземпляр ведь создается в классе Main
        } else {
            return false;
        }
    }

    public void decreaseFood(int n) {
        food -= n;
    }

}
