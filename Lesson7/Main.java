package Javatests.Lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("FirstPlate",80);
        plate.info();
        massCatDoTask(plate);
        plate.addEatToPlate(5);

    }

    static void massCatDoTask(Plate plate){
        Cat [] cats = new Cat[] {
          new Cat("Shelby",5),
          new Cat("Craster",13),
          new Cat("Pushnoy",25),
          new Cat("Ramzan" ,19),
          new Cat("Shumacher",20)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }

}
