package Javatests.Lesson6;

public class Dog extends Animals{
    private String name;
    private int runMaxDistance = 500;
    private int sailMaxDistance= 10;
    private static int countCreatedDogs = 0;

    public Dog(String name) {
        this.name = name;
        countCreatedDogs++;
    }

    public int getCountCreatedDogs() {
        return countCreatedDogs;
    }

    @Override
    public void doRun(int distance) {
        if (runMaxDistance > distance) {
         System.out.print(
                 String.format("\t Пёс %s : пробежал %s метров %n", name, distance));
        }else {
         System.out.print(
                 String.format("\t Пёс %s : не может пробежать больше %S метров.%n", name, runMaxDistance)
             );
         }
    }

    @Override
    public void doSail(int distance) {
        if (sailMaxDistance > distance) {
            System.out.print(
                    String.format("\t Пёс %s : проплыл %s метров %n", name, distance));
        }else {
            System.out.print(
                    String.format("\t Пёс %s : не может проплыть больше %S метров.%n", name, runMaxDistance)
            );
        }
    }
}
