package Javatests;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        int [] tes = {1,2,3,4,5,6,7, 8,9,10,11,12,13,14};

    }


/* 8. *** Написать метод, которому на вход подается одномерный массив
и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя
пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
 -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
 -> [ 6, 1, 3, 5 ].
 При каком n в какую сторону сдвиг можете выбирать сами.

     */



/* 7. ** написать метод, в который передается не пустой одномерный
целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и
 правой части массива равны.
 */
    static boolean doTask7(int [] arr){
        int count1  = arr.length/2;
        int leftValue = arr[0];
        int rightValue = arr[count1];
        for (int i = 0; i < count1 ; i++) {
            leftValue = leftValue + arr[i];
        }
        System.out.println(leftValue);
        for (int i =count1; i < arr.length ; i++) {
            rightValue = rightValue + arr[i];

        }
        System.out.println(rightValue);
        return rightValue==leftValue;
    }


    /*6. * Задать одномерный массив и найти в нем минимальный и
    максимальный элементы ;
     */

    static void doTask6(){
        int[] array = new int[] {5,4,1,2,6,7,8,9,0,54,3};
        int minCount = array[0];
        int maxCount = array[0];
              for (int i = 0; i < array.length ; i++) {
                if (minCount >= array[i]){
                  minCount = array[i];
                }
              }
        System.out.println("Minimal value in this array = " +minCount);
              for (int i = 0; i < array.length; i++) {
                  if (maxCount <= array[i]){
                     maxCount = array[i];
            }
        }
        System.out.println("Maximum value in this array = " + maxCount);
    }



    /*5. Написать метод, принимающий на вход два аргумента:
    len и initialValue, и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue;
     */

    static int[] getArray5Task (int len,int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = i + initialValue;
        }return array;
    }


    /*4. Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    static void doTask4(){
        int[][] array = new int[5][5];
        int j =0, k = array.length -1, i =0;
        for (i = 0; i < array.length; i++) {
            array[i][j] = 1;
            array[i][j+k]=1;
            j++;
            k -= 2; }
        for (i = 0; i < array.length ; i++) {
            for (j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();

        }



    }



    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void doThreeTask(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }

        }

    }

    /*2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    static void doTwoTask(){
        int [] array = new int[100]; //создаём массив и возвращаем ссылку на его начало
                for (int i = 0; i < array.length; i++) { //проверяем длинну массива и пока она больше 0
            array[i] = i + 1;// записываем в каждый следующий элемент массива на 1 больше.
        }
    }


    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    static void getArray(){
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1){
                array[i] = 0;
            }else array[i] =1;
         }
    }
}
