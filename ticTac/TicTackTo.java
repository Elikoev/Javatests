package ticTac;

import java.util.Random;
import java.util.Scanner;

public class TicTackTo {


    static void start() {

        int levelCount = getLevel();
        char[][] field = getField(levelCount);

        drawField(field);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            thisPlayerMove(field, levelCount);
            if (isWin(field,'X')== true){
                System.out.println(
                        "\t\tYou win!!! \n\t" +
                                " G A M E  O V E R ");
                break;
            }
            doBotMove(field);
            if (isWin(field,'O')== true) {
                    System.out.println("\t\tYou loss!!! \n\t" +
                                        " G A M E  O V E R ");
                break;
            }
        }
    }


//    static boolean boolIsWin(char[][] field, char symbol) {
//        boolean isWin = false;
//        //горизонталь
//        for (int i = 0; i < field.length; i++) {
//            if (field[i][0] == symbol && field[i][0] == symbol && field[i][0] == symbol) {
//                isWin = true;
//                break;
//            }
//        }
//        //вертикаль
//        for (int i = 0; i < field.length; i++) {
//            if (field[0][i] == symbol && field[0][i] == symbol && field[0][i] == symbol) {
//               return true;
//            }
//        }
//        // диагональ
//        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) {
//            return true;
//        }
//        if (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) {
//            return true;
//        }
//        return false;
//    }
//
//
//
//     тут у меня нифига не получается,
//     3 день сижу, понять нифига не могу в чём дело объясните плз
    static boolean isWin(char [][] field,char symbol) {
        //horiz
        int j = 0;
        for (int i = 0; i < field.length; i++,j++) {
            if (field[i][j] == symbol) {
                return true;
            } else return false;
        }
        //vert
        for (int i = 0; i < field.length; i++,j++) {
            if (field[j][i] == symbol && field[j][i] == field.length) {
                return true;
            }
        }

      //  diagonal
        for (int i = 0; i < field.length ; i++) {
            for (j = 0; j < field.length; j++) {
                if (i==j && field[i][j]== symbol){
                    return true;
                }
            }
        }return false;
    }


    static char[][] getField(int levelCount){
        char[][] field = new char[levelCount][levelCount];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '-';
            }
        }return field;
    }

    static void doBotMove (char [][] field){
        int horizantal,vert;
        Random random = new Random();
        do {
            horizantal = random.nextInt(field.length);
            vert = random.nextInt(field.length);
        }while (isEmpetyHere(field,horizantal,vert));
        field[horizantal][vert] = 'O';
        drawField(field);
    }

    static void thisPlayerMove(char[][] field , int levelCount){

        int horizantal;
        int vert;
        do {
            if (levelCount ==3){
                System.out.println("Enter correct number cordinates");
                horizantal = getCordinate('H');
                vert = getCordinate('V');
            }else if (levelCount == 5) {
                System.out.println("Enter correct number cordinates");
                horizantal = getCordinate2Level('H');
                vert = getCordinate2Level('V');
            }else {
                System.out.println("Enter correct number cordinates");
                horizantal = getCordinate2Level('H');
                vert = getCordinate2Level('V');
            }
        } while (isEmpetyHere(field,horizantal,vert));

        field[horizantal][vert] = 'X';
        drawField(field);
    }

    static boolean isEmpetyHere(char[][] field,int horizantal,int vert ){
        return field[horizantal][vert] != '-';
    }

    static int getLevel() {
        Scanner scanLevel = new Scanner(System.in);
        int levelCount;
        int levelNumber = 0;
        do {
            System.out.println("Choose the difficulty level");
            System.out.println("1. Easy (3x3) ");
            System.out.printf("2. Hard (5x5) %n");
            levelCount = scanLevel.nextInt();
            if (levelCount == 1){
                levelNumber = 3;
            }else {
                levelNumber = 5;
            }

        } while (levelCount < 0 || levelCount > 2) ;
            return levelNumber;

    }


    static int getCordinate( char position){
        Scanner scanner = new Scanner(System.in);
        int cordinate;
        do {
            System.out.printf ("Please enter %s - cordinate (in range 1-3) ...%n ",position);
            cordinate = scanner.nextInt()-1;
        }while (cordinate < 0 || cordinate >2);
        return cordinate;
    }

    static int getCordinate2Level( char position){
        Scanner scanner = new Scanner(System.in);
        int cordinate;
        do {
            System.out.printf ("Please enter %s - cordinate (in range 1-5) ...%n ",position);
            cordinate = scanner.nextInt()-1;
        }while (cordinate < 0 || cordinate >4);
        return cordinate;
    }


    static void drawField (char[][] field){

        for (int i = 0; i < field.length ; i++) {
            for (int j = 0; j < field.length ; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
