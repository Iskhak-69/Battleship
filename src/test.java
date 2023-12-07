import java.util.Random;
import java.util.Scanner;

public class test {
    static Random random = new Random();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] seaField = getField();

        threeDeckShip(seaField);

        for (int i = 0; i < seaField.length; i++) {
            for (int j = 0; j < seaField.length; j++) {
                System.out.print(seaField[i][j] + " ");
            }
            System.out.println();
        }
    }

    //region threeDeckShip
    public static void threeDeckShip(char[][] seaField){
        boolean isShipPlaced = false;

        while(!isShipPlaced){
            int i = random.nextInt(0, 7);
            int j = random.nextInt(0, 7);
            int direction = random.nextInt(1, 3);
//            int i = 2;
//            int j = 5;
//            int direction = 2;

            if(direction == 1){
                if(canThreeDeckShipPlace(i, j, direction)){
                    System.out.println(i + " " + j);
                    seaField[i][j] = '#';
                    seaField[i][j + 1] = '#';
                    seaField[i][j + 2] = '#';

                    isShipPlaced = true;
                    occupyThreeDeckShip(i, j, seaField, direction);
                }
            }else{
                if(canThreeDeckShipPlace(i, j, direction)){
                    seaField[i][j] = '#';
                    seaField[i + 1][j] = '#';
                    seaField[i + 2][j] = '#';

                    isShipPlaced = true;
                    occupyThreeDeckShip(i, j, seaField, direction);

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
            for(int counterI = i - 1; counterI < i + 2; counterI++){
                for(int counterJ = j - 1; counterJ < j + 4; counterJ++){
                    if((counterI == i && counterJ == j) || (counterI == i && counterJ == j + 1) || (counterI == i && counterJ == j + 2)){
                        continue;
                    }

                    if((counterI < 0 || counterI > 6) || (counterJ < 0 || counterJ > 6)){
                        continue;
                    }

                    seaField[counterI][counterJ] = '1';
                }
            }
        }else{

            for(int counterI = i - 1; counterI < i + 4; counterI++){
                for(int counterJ = j - 1; counterJ < j + 2; counterJ++){
                    if((counterI == i && counterJ == j) || (counterI == i + 1 && counterJ == j) || (counterI == i + 2 && counterJ == j)){
                        continue;
                    }

                    if((counterI < 0 || counterI > 6) || (counterJ < 0 || counterJ > 6)){
                        continue;
                    }

                    seaField[counterI][counterJ] = '1';
                }
            }

        }
    }
    //endregion

    //region twoDeckShip
    public static void twoDeckShip(char[][] seaField){
        boolean isShipPlaced = false;

        while(!isShipPlaced){
            int i = random.nextInt(0, 7);
            int j = random.nextInt(0, 7);
            int direction = random.nextInt(1, 3);
//            int i = 2;
//            int j = 5;
//            int direction = 2;

            if(direction == 1){
                if(canThreeDeckShipPlace(i, j, direction)){
                    System.out.println(i + " " + j);
                    seaField[i][j] = '#';
                    seaField[i][j + 1] = '#';
                    seaField[i][j + 2] = '#';

                    isShipPlaced = true;
                    occupyThreeDeckShip(i, j, seaField, direction);
                }
            }else{
                if(canThreeDeckShipPlace(i, j, direction)){
                    seaField[i][j] = '#';
                    seaField[i + 1][j] = '#';
                    seaField[i + 2][j] = '#';

                    isShipPlaced = true;
                    occupyThreeDeckShip(i, j, seaField, direction);

                }
            }
        }

    }

    public static boolean canTwoDeckShipPlace(int i, int j, int direction){
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

    public static void occupyTwoDeckShip(int i, int j, char[][] seaField, int direction){
        if(direction == 1){
            for(int counterI = i - 1; counterI < i + 2; counterI++){
                for(int counterJ = j - 1; counterJ < j + 4; counterJ++){
                    if((counterI == i && counterJ == j) || (counterI == i && counterJ == j + 1) || (counterI == i && counterJ == j + 2)){
                        continue;
                    }

                    if((counterI < 0 || counterI > 6) || (counterJ < 0 || counterJ > 6)){
                        continue;
                    }

                    seaField[counterI][counterJ] = '1';
                }
            }
        }else{

            for(int counterI = i - 1; counterI < i + 4; counterI++){
                for(int counterJ = j - 1; counterJ < j + 2; counterJ++){
                    if((counterI == i && counterJ == j) || (counterI == i + 1 && counterJ == j) || (counterI == i + 2 && counterJ == j)){
                        continue;
                    }

                    if((counterI < 0 || counterI > 6) || (counterJ < 0 || counterJ > 6)){
                        continue;
                    }

                    seaField[counterI][counterJ] = '1';
                }
            }

        }
    }
    //endregion



    public static char[][] getField(){
        char[][] seaField = new char[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                seaField[i][j] = '0';
            }
        }
        return seaField;
    }
}
