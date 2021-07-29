package Javatests.Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

      public Cat(String name, int appetite ) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
            plate.decreaseFood(appetite,name);
    }


}
