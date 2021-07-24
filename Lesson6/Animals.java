package Javatests.Lesson6;

public class Animals {
    private String name;
    private int runMaxDistance;
    private int sailMaxDistance;
    private static int countCreatedAnimals = 0;

    public Animals(){
        countCreatedAnimals++;
    }

    public static int getCountCreatedAnimals() {
        return countCreatedAnimals;
    }

    public String getName() {
        return name;
    }

    public int getRunMaxDistance() {
        return runMaxDistance;
    }

    public int getSailMaxDistance() {
        return sailMaxDistance;
    }

    protected void doSail(int distance){
        System.out.println(
                String.format("\t %s : пробежал %s м. %n",name,distance));

    }
    public void doRun( int distance){
        System.out.println(
                String.format("\t %s : пробежал %s м. %n",name,distance));
    }

}
