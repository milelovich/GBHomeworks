package homeworktwo;

public class lesson2 {
    public static void main(String[] args) {

//**************** 1 задание
//        Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С
//        помощью цикла и условия заменить 0 на 1, 1 на 0;

        // int[] arr = new int[10];
            int[] arr = {1, 1, 0, 1, 1, 0, 0, 0, 1, 1};
            for (int i = 0; i < arr.length; i++) {
                //arr[i] = i;
                if (arr[i] == 0) {
                  arr[i] = 1;
                } else {
                arr[i] = 0;
                }
                System.out.print(arr[i] + " ");
            }

    }

//**************** 2 задание
//Задать пустой целочисленный массив размером 8.
//С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j = j + 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

//**************** 3 задание
// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2

    public static void changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
            System.out.print(w[i] + " ");
        }
    }

//**************** 4 задание
//  Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами

    public static void fillDiag() {
        int[][] arr = new int[11][11];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == arr.length - 1 - i)
                    arr[i][j] = 1;
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }

//**************** 5 задание
// Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static void minMax() {
        int[] z = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
       // int[] arr = new int[8];
        // находим минимум:
        int min = z[0];
        for (int i= 1; i< z.length; i++){
            if (z[i] < min)
                min = z[i];
        }
        System.out.println("Минимальное число" + min);

        // находим максимум:
        int max = z[0];
        for (int i= 1; i< z.length; i++){
            if (z[i] > max)
                max = z[i];
        }
        System.out.println("Максимальное число" + max);


    }

}


