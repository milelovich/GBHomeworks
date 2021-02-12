package homeworkone;

//**************** 2 задание

public class Main {
    public static void main(String[] args) {
byte y = 123;
short sh = 12345;
int i = 1234567;
long l = 12345678L;
float fl = 123.45f;
double bl = -1234.567;
char ch = '\uffff';
boolean h = true;
    }

//**************** 3 задание

        static double sum (float a, float b, float c, float d) {
            return a * (b + (c / d));

        }

//**************** 4 задание

        static boolean sum (int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
        }
//**************** 5 задание

        static void define (int a) {
        if (a>= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
        }

//**************** 6 задание

        static boolean defineNegative (int a) {
            if (a >= 0) {
                return false;
            }
            return true;
        }

//**************** 7 задание

    static void print(String name) {
        System.out.println("Привет" + name + "!");
    }

}





