package Javatests.Lesson6;

public abstract class Animals {
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

    public abstract void doSail(int distance);
    public abstract void doRun( int distance);
    }
