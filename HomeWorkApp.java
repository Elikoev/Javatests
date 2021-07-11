public class HomeWorkApp {

public static int a = 10;
public static int b = -15;

    public static void main(String[] args) {
        printThreeWords();
        System.out.println(checkSumSign());
        System.out.println(printColor());
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

     static String checkSumSign() {
        int a = 10;// можно объявить в методе main переменные
        int b = -10;   // и передавать их в качестве агрументов для избавления от лишних объявлений переменных.
        if (a + b >= 0) {
            return "Сумма положительная";
        } else {
            return "Сумма отрицательная";
        }
    }


//    static String checkSumSign(int a,int b){
//        String result = a + b >= 0 ? "Сумма положительна":"Сумма отрицательная";
//        return result;
// }

    static String printColor() {
        int value = 1010; //можно объявить переменную в main и передавать в качестве аргумента
        if (value <= 0) {
            return "Красный";
        } else if (value > 0 && value <= 100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }
    }

/*//    Альтернативный способ без использования метода с возвращаемым значением
    //  Есть ли какая разница в таких случаях в плане производительности и потребления ресурсов?
//    static void printColor() {
//        String result;
//        int value = 1010; //можно объявить переменную в main и передавать в качестве аргумента
//        if (value <= 0) {
//            result = "Красный";
//        } else if (value > 0 && value <= 100) {
//            result = "Желтый";
//        } else {
//            result = "Зеленый";
//        }
//        System.out.println(result);
//    }
*/
    static void compareNumbers() {
        int a = 10;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
