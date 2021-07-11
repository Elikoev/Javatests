package Javatests;

import java.util.Scanner;

public class HomeWorkLesson2 {


    public static void main(String[] args) {
        System.out.println(doMethodOne(5, 60));//задание 1
        System.out.println("\n");
        System.out.println(doPositive_Negative(0));//задание 2
        System.out.println("\n");
        System.out.println(doReversePosToNegative(-5));//задание 3
        System.out.println("\n");
        toStringForLine("\tPrint this message", 1); //Задание 4
        System.out.println(doLeapYear());//задание 5
    }

 /*1. Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.
 */

    static boolean doMethodOne(int a, int b) {
        if (a + b >= 10 && a + b <= 20) return true;
        else return false;
    }

    /*2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль,
    положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом
     */
    static String doPositive_Negative(int a) {
        if (a >= 0) return "This nubmer is positive!!!";
        else return "This nunber is negative";
    }
    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное.
   */

    static boolean doReversePosToNegative(int a) {
        boolean status = (a < 0) ? true : false; // Вот нравятся мне тернартые операторы мб можно записать как-то подругому?=)
        return status; //можно ли ещё сократить данное выражение?
    }
/*4. Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку,указанное количество раз;
 */

    static void toStringForLine(String result, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(result);
        }

    }

    /*5. * Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный
     */
    static boolean doLeapYear() {
        System.out.println(" \n\tEnter to year number ");//сообщение дабы не потеряться
        Scanner scanner = new Scanner(System.in);//Создаём новый экземпляр сканера в него погружаем значение system.in если всё верно понято.
        int year = scanner.nextInt(); //в переменную передаём информацию из System.in и говорим что тип данных int
        scanner.close(); //Закрываем сканер переменная уже получена.
        //Тут было сложно мб можно как-то проще сделать (с математикой грустно)
        if (year % 400 ==0)return true; //проверяем что год кратен 400
        else if (year % 100 ==0)return false;//проверяем что год кратен 100 и говорим что фу.
        else if (year % 4 == 0)return true;// проверяем на кратность 4
        else return false;//возвращаем ложи в остальных случаях.

        /*Хотелось бы получить обратную связь по 5му заданию,
        можно ли сделать проще?
         */

    }

}

