import java.util.Random;
import java.util.Scanner;

public class test {
    static Random random = new Random();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] seaField = getField();
    }

    public static void threeDeckShip(char[][] seaField){
        boolean isShipPlaced = false;

        while(!isShipPlaced){
            int i = random.nextInt(1, 8);
            int j = random.nextInt(1, 8);
            int direction = random.nextInt(1, 3);

            if(direction == 1){
                if(canThreeDeckShipPlace(i, j, direction)){
                    seaField[i][j] = '#';
                    seaField[i][j + 1] = '#';
                    seaField[i][j + 2] = '#';

                }
            }else{
                if(canThreeDeckShipPlace(i, j, direction)){
                    seaField[i][j] = '#';
                    seaField[i + 1][j] = '#';
                    seaField[i + 2][j] = '#';
                }
            }
        }
    }

    public static boolean canThreeDeckShipPlace(int i, int j, int direction){
        if(direction == 1){
            if(j > 4){
                return false;
            }
        }else{
            if(i > 4){
                return false;
            }
        }

        return true;
    }

    public static void occupyThreeDeckShip(int i, int j, char[][] seaField, int direction){
        if(direction == 1){
            seaField[i][j] = '1';

        }else{
            seaField[i - 1][j - 1] = '1';
            seaField[i - 1][j] = '1';
            seaField[i - 1][j + 1] = '1';
            seaField[i][j - 1] = '1';
            seaField[i][j + 1] = '1';
            seaField[i - 1][j - 1] = '1';
            seaField[i - 1][j - 1] = '1';
            seaField[i - 1][j - 1] = '1';
            seaField[i - 1][j - 1] = '1';

            for(int counterI = i - 1; counterI < 6; counterI++){
                for(int counterJ = j - 1; counterJ < 5; counterJ++){
                    if(){

                    }


                }
            }

        }
    }

    public static char[][] getField(){
        char[][] seaField = new char[][]{};
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                seaField[i][j] = '0';
            }
        }
        return seaField;
    }
}
