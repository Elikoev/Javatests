package Javatests.Lesson7;

public class Plate {
    private String namePlate;
    private int food;

    public Plate(String namePlate, int food) {
        this.namePlate = namePlate;
        this.food = food;
    }

    public String getNamePlate() {
        return namePlate;
    }
    public boolean isHaveFood(int n){
        return food > n;
    }
    public void decreaseFood(int n,String nameCat){
        if (isHaveFood(n)){
        food -= n;
            System.out.printf(String.format("Кот [%s] сыт, он съел из тарелки [%s] %s еды.\n" +
                    "Текущее значение еды на тарелке составляет : %s. \n\n",
                    nameCat, namePlate, n,food));
        }else {
            System.out.printf(String.format("Извините на тарелке [%s] не может быть отрицательное количество еды.\n" +
                    "Текущее значение еды на тарелке составляет : %s, кот [%s] голоден ему необходимо %s еды.\n\n",getNamePlate(),food,nameCat,n));
        }

   }

    public void info(){
        System.out.printf(String.format("Сейчас на тарелке [%s] : %s еды. \n\n",namePlate,food));
    }

    /*Добавить в тарелку метод,
    с помощью которого можно было бы добавлять еду в тарелку. */

    public void addEatToPlate (int countAddEat){
        //представим что тарелка бесконечная в объёме
        food += countAddEat;
        System.out.printf(String.format("Вы добавили в тарелку [%s] %s еды! \n" +
                "Текущее значение еды в тарелке [%s] = %s.\n\n",namePlate,countAddEat, namePlate,food));
    }
}
