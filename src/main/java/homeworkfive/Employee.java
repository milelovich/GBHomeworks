package homeworkfive;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;


    public Employee (String fullName, String position, String email, int phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }



        public static void main(String[] args) {
        Employee employee1 = new Employee ("Пушкин Иван Иванович", "Директор", "pu@mail.ru", 111, 300000, 40);
        Employee employee2 = new Employee ("Кукушкин Иван Иванович", "Менеджер проектов", "ku@mail.ru", 222, 200000, 35);
        Employee employee3 = new Employee ("Сидоров Иван Иванович", "Программист", "sv@mail.ru", 333, 350000, 33);
        Employee employee4 = new Employee ("Козлов Иван Иванович", "Инженер", "kz@mail.ru", 444, 250000, 44);
        Employee employee5 = new Employee ("Кузнецов Иван Иванович", "Двроник", "kzc@mail.ru", 555, 150000, 31);
        System.out.println("EMPLOYEE NUMBER ONE: \nName: " + employee1.fullName + ", position: " + employee1.position + ", age: " + employee1.age + "\nsalary: " + employee1.salary + "$" + ", e-mail: " + employee1.email + ", phone number: " + employee1.phoneNumber);
        System.out.println();
        System.out.println("EMPLOYEE NUMBER TWO: \nName: " + employee2.fullName + ", position: " + employee2.position + ", age: " + employee2.age + "\nsalary: " + employee2.salary + "$" + ", e-mail: " + employee2.email + ", phone number: " + employee2.phoneNumber);
        System.out.println();
        System.out.println("EMPLOYEE NUMBER THREE: \nName: " + employee3.fullName + ", position: " + employee3.position + ", age: " + employee3.age + "\nsalary: " + employee3.salary + "$" + ", e-mail: " + employee3.email + ", phone number: " + employee3.phoneNumber);
        System.out.println();
        System.out.println("EMPLOYEE NUMBER FOUR: \nName: " + employee4.fullName + ", position: " + employee4.position + ", age: " + employee4.age + "\nsalary: " + employee4.salary + "$" + ", e-mail: " + employee4.email + ", phone number: " + employee4.phoneNumber);
        System.out.println();
        System.out.println("EMPLOYEE NUMBER FIVE: \nName: " + employee5.fullName + ", position: " + employee5.position + ", age: " + employee5.age + "\nsalary: " + employee5.salary + "$" + ", e-mail: " + employee5.email + ", phone number: " + employee5.phoneNumber);
        System.out.println();


            Employee[] emplArray = new Employee[5];
            emplArray[0] = new Employee("Пушкин Иван Иванович", "Директор", "pu@mail.ru", 111, 300000, 40);
            emplArray[1] = new Employee("Кукушкин Иван Иванович", "Менеджер проектов", "ku@mail.ru", 222, 200000, 35);
            emplArray[2] = new Employee("Сидоров Иван Иванович", "Программист", "sv@mail.ru", 333, 350000, 33);
            emplArray[3] = new Employee("Козлов Иван Иванович", "Инженер", "kz@mail.ru", 444, 250000, 44);
            emplArray[4] = new Employee("Кузнецов Иван Иванович", "Двроник", "kzc@mail.ru", 555, 150000, 31);


            for (int i = 0; i < 5; i++) {
                //this.age = age;
                if (emplArray[i].age > 40) {
                    System.out.println("Сотрудник старше 40 лет: " + emplArray[i].fullName);
                }
            }



        }


    }





