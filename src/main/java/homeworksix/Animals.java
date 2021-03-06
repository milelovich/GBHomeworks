package homeworksix;

public class Animals {

    public int runRange;
    public int swimRange;
    private boolean canRun;
    private boolean canSwim;


    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public Animals(){
        canRun = true;
        canSwim = true;
    }


    public void Info() {
        System.out.println("Умеет бегать — " + canRun + " Умеет плавать — " + canSwim);
    }

    public void run(int runRange) {
        System.out.println("Бежит на дистанцию " + runRange + " метра");
    }

    public void swim(int swimRange) {
        System.out.println("Плывёт на дистанцию " + swimRange + " метра");
    }

}
