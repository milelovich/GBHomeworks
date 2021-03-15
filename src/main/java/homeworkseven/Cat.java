package homeworkseven;

public class Cat  {

    public String getName() {
        return name;
    }

    private String name;

    public int getAppetite() {
        return appetite;
    }

    private int appetite;
    private boolean isHungry;


    public boolean isHungry() {
        return isHungry;
    }



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    private Plate plate;
    public void eat(Plate plate) {
        if (plate.plateContent())
        {
            plate.info();
            plate.decreaseFood(appetite);
            System.out.println("Спасибо, было очень вкусно");
            isHungry = true;
            System.out.println("Сытость: " + isHungry());
            plate.infoEnd();


        } else {
            System.out.println("Тарелка пустая");
            System.out.println("Сытость: " + isHungry());

        }
    }




    }




