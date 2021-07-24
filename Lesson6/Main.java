package Javatests.Lesson6;

public class Main extends Animals{
    public static void main(String[] args) {
        createDog();
        createCat();
    }

    static void createDog(){
        Dog dog = new Dog("sharpeI");
        dog.doRun(480);
        Dog dog1 = new Dog("Chapai");
        dog1.doSail(90);
        System.out.println("\t Создано " + dog.getCountCreatedDogs() + " собак");
        System.out.println("\t Создано " + getCountCreatedAnimals() + " животных \n");
    }

    static void createCat(){
        Cat cat = new Cat("Vasia");
        cat.doRun(1888);
        cat.doSail(200);
        System.out.println("\t Создано " + cat.getCountCreatedCats() + " котов");
        System.out.println("\t Создано " + getCountCreatedAnimals() + " животных \n");
    }
}
