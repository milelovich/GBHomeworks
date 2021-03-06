package homeworksix;

public class Cat extends Animals {

    public Cat() {
        super();
        setCanSwim(false);
    }

    @Override
    public void run (int runRange){
        if (runRange > 200) {
            System.out.println("Слишком большая дистанция для бега кота");
        } else System.out.println("Котик бежит на дистанцию " + runRange + " метра");

    }



}
