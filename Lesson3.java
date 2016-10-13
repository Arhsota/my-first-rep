/**
 *  Andrey Sevastyanov, author 11/10/2016 homework for lesson3, Java 1
 *  We should improve this software, this is homework task
 *  The improvement concerns method checkWin. point 2 in homework
 *  In method turnPlayer, if player choose x=2, then x could be random, and not definitely 2. Point 4 in homework
 */

import java.util.*;


class Lesson3 {

    final char PLAYER_DOT = 'x';
    final char AI_DOT = 'o';
    final char EMPTY_DOT = '.';
    final int FIELD_SIZE = 3;
    final String winStr= "xxx"; //winning string
    String checkStrHor1="";     //sequence of winning characters for all situations
    String checkStrHor2="";
    String checkStrHor3="";
    String checkStrVer1="";
    String checkStrVer2="";
    String checkStrVer3="";
    String checkStrDiag1="";
    String checkStrDiag2="";
    char[][] field = new char[FIELD_SIZE][FIELD_SIZE];
    //char[][] checkfield = new char[FIELD_SIZE][FIELD_SIZE];
    //char[][] winfield = {{'x','x','x'},{'x','x','x'},{'x','x','x'}};
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new Lesson3().go();
    }


    void go() {
        initField();
        printField();
        while (true) {
            turnPlayer();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("You won!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Sorry draw...");
                break;
            }
            turnAI();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("AI won!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Sorry draw...");
                break;
            }
        }
    }

    void turnPlayer() {
        int x, y;
        do {
            System.out.println("Enter coordinates X Y (1-" + FIELD_SIZE + "):");
            x = sc.nextInt() - 1;
             if (x ==1)                                 // HOMEWORK point 4
                 x = rand.nextInt(FIELD_SIZE);
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        field[x][y] = PLAYER_DOT;
    }

    void turnAI() {
        int x, y;
        do {
            x = rand.nextInt(FIELD_SIZE);
            y = rand.nextInt(FIELD_SIZE);
        } while (!isCellEmpty(x, y));
        field[x][y] = AI_DOT;
    }

    boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x > FIELD_SIZE - 1 || y > FIELD_SIZE - 1) return false;
        if (field[x][y] == EMPTY_DOT) return true;
        return false;
    }

    boolean isFieldFull() {
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++)
                if (field[i][j] == EMPTY_DOT) return false;
        return true;
    }

    boolean checkWin(char ch) {

        //HOMEWORK point 2

        for (int j = 0; j < FIELD_SIZE; j++) {
            checkStrHor1 += String.valueOf(field[0][j]);
            checkStrHor2 += String.valueOf(field[1][j]);
            checkStrHor3 += String.valueOf(field[2][j]);
            checkStrVer1 += String.valueOf(field[j][0]);
            checkStrVer2 += String.valueOf(field[j][1]);
            checkStrVer3 += String.valueOf(field[j][2]);
        }
        // check horizontals
        if (checkStrHor1.equals(winStr)) return true; else  checkStrHor1="";
        if (checkStrHor2.equals(winStr)) return true; else  checkStrHor2="";
        if (checkStrHor3.equals(winStr)) return true; else  checkStrHor3="";
        // check verticals
        if (checkStrVer1.equals(winStr)) return true; else  checkStrVer1="";
        if (checkStrVer2.equals(winStr)) return true; else  checkStrVer2="";
        if (checkStrVer3.equals(winStr)) return true; else  checkStrVer3="";
        // check diag
        if (field[0][0] == ch && field[1][1] == ch && field[2][2] == ch) return true;
        if (field[2][0] == ch && field[1][1] == ch && field[0][2] == ch) return true;
        return false;
    }

    void initField() {
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++)
                field[i][j] = EMPTY_DOT;
    }

    void printField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++)
                System.out.print(field[i][j]);
            System.out.println();
        }
    }
}