import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random firstMove = new Random();
        String playerMove = firstMove.nextInt(2) == 0 ? "X" : "O";
        String winner = "";
        int position = 0;
        int moveCount = 0;
        int[] positionXY = new int[2];
        String[][] arr = new String[3][3];
        for (int i = 0; i<3; i++)
            for (int j = 0; j<3; j++)
                arr[i][j] = "-";
        showArray(arr);
        int x = 0, y = 0;
        boolean ifWinner = false;
        boolean ifCorrectInput = false;
        while(!ifWinner) {
            ifCorrectInput = false;
            do {
                System.out.println("It's " + playerMove + " move now:");
                position = scanner.nextInt();
                getPosition(position,positionXY);
                x = positionXY[0];
                y = positionXY[1];
                if ((position > 9)||(position < 1))
                    System.out.println("Error: position must be in [1..9] range!");
                else
                if (arr[x][y] != "-")
                    System.out.println("Error: this position is already occupied!");
                else
                    ifCorrectInput = true;
            }
            while(!ifCorrectInput);
            arr[x][y] = playerMove;
            showArray(arr);
            moveCount++;
            ifWinner = winnerStatus(arr);
            if (ifWinner) // если есть победитель
                winner = playerMove;
            if ((moveCount==9)&&(!ifWinner)) { // если ничья
                winner = "dead heat";
                ifWinner = true;
            }
            playerMove = changePlayer(playerMove);
        }
        System.out.println("Winner: "+winner);
    }

    // меняем ход игрока
    static String changePlayer(String playerNow) {
        if(playerNow == "X")
            return "O";
        else
            return "X";
    }

    // выводим массив на консоль
    static void showArray(String[][] arr) {
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("......");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");

    }

    // проверяем, если кто-то выиграл
    static boolean winnerStatus(String[][] arr) {
        if (    ((arr[0][0] == arr[0][1])&&(arr[0][1] == arr[0][2])&&(arr[0][0] != "-")&&(arr[0][1] != "-")&&(arr[0][2] != "-")) ||
                ((arr[1][0] == arr[1][1])&&(arr[1][1] == arr[1][2])&&(arr[1][0] != "-")&&(arr[1][1] != "-")&&(arr[1][2] != "-")) ||
                ((arr[2][0] == arr[2][1])&&(arr[2][1] == arr[2][2])&&(arr[2][0] != "-")&&(arr[2][1] != "-")&&(arr[2][2] != "-")) ||
                ((arr[0][0] == arr[1][0])&&(arr[1][0] == arr[2][0])&&(arr[0][0] != "-")&&(arr[1][0] != "-")&&(arr[2][0] != "-")) ||
                ((arr[0][1] == arr[1][1])&&(arr[1][1] == arr[2][1])&&(arr[0][1] != "-")&&(arr[1][1] != "-")&&(arr[2][1] != "-")) ||
                ((arr[0][2] == arr[1][2])&&(arr[1][2] == arr[2][2])&&(arr[0][2] != "-")&&(arr[1][2] != "-")&&(arr[2][2] != "-")) ||
                ((arr[2][0] == arr[1][1])&&(arr[1][1] == arr[0][2])&&(arr[2][0] != "-")&&(arr[1][1] != "-")&&(arr[0][2] != "-")) ||
                ((arr[0][0] == arr[1][1])&&(arr[1][1] == arr[2][2])&&(arr[0][0] != "-")&&(arr[1][1] != "-")&&(arr[2][2] != "-"))
        )
            return true;
        else return false;
    }

    // переводим позицию из 1..9 в два значения индексов массива
    static void getPosition(int position, int[] positionXY) {
        int x = 0, y = 0;
        switch (position) {
            case 1:
                x = 0;
                y = 0;
                break;
            case 2:
                x = 0;
                y = 1;
                break;
            case 3:
                x = 0;
                y = 2;
                break;
            case 4:
                x = 1;
                y = 0;
                break;
            case 5:
                x = 1;
                y = 1;
                break;
            case 6:
                x = 1;
                y = 2;
                break;
            case 7:
                x = 2;
                y = 0;
                break;
            case 8:
                x = 2;
                y = 1;
                break;
            case 9:
                x = 2;
                y = 2;
                break;
        }
        positionXY[0] = x;
        positionXY[1] = y;
    }
}