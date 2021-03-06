package homeworksix;

public class Dog extends Animals {
    public Dog() {
        super();
    }

    @Override
    public void run(int runRange) {
        if (runRange > 500) {
            System.out.println("Слишком большая дистанция для бега собаньки");
        } else System.out.println("Собака бежит на дистанцию " + runRange + " метра");
    }

    @Override
    public void swim(int swimRange){
        if (swimRange > 10){
            System.out.println("Слишком большая дистанция для заплыва собаньки");
        } else System.out.println("Собака плывет на дистанцию " + swimRange + " метра");
    }
}

