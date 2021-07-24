package Javatests.Lesson6;

public class Cat extends Animals {
    private String name;
    private int runMaxDistance = 200;
    private int sailMaxDistance= 0;
    private static int countCreatedCats = 0;

    public Cat(String name) {
        this.name = name;
        countCreatedCats++;
    }

    public int getCountCreatedCats() {
        return countCreatedCats;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doRun(int distance) {
        if (runMaxDistance > distance) {
            System.out.print(
                    String.format("\t Кот %s : пробежал %s метров %n", name, distance));
        }else {
            System.out.print(
                    String.format("\t Кот %s : не может пробежать больше %S метров.%n", name, runMaxDistance)
            );
        }
    }

    @Override
    protected void doSail(int distance) {
        System.out.println("\t Раб, ты забыл что коты не плавают?");
    }

}
