import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> playerNames = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        while(game){
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            battleship();
        }
    }
    public static char[][] battleship(){
        Random random = new Random();
        int fieldSize = 7;
        int oneDeckShip = 4;
        int twoDeckShip = 2;
        int threeDeckShip = 1;
        char[][] seaField = new char[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                seaField[i][j] = '*';
            }
        }
        while(threeDeckShip > 0){
            if(threeDeckShip > 0){
                boolean isTrue = true;
                while(isTrue){
                    int x = random.nextInt(1, 8);
                    int y = random.nextInt(1, 8);
                    System.out.println(x);
                    System.out.println(y);
                    int direction = random.nextInt(1,3);
                    //direction == 1 is horizontal
                    //direction == 2 is vertical
                    if(direction == 1){
                        if(y > 1 && y < 7){
                            seaField[x - 1][y - 1] = '#';
                            seaField[x - 1][y - 2] = '#';
                            seaField[x - 1][y] = '#';
                            isTrue = false;
                        }
                        else if(x > 1 && x < 7){
                            seaField[x - 1][y - 1] = '#';
                            seaField[x - 2][y - 1] = '#';
                            seaField[x][y - 1] = '#';
                            isTrue = false;
                        }
                    }
                }
            }
            threeDeckShip--;
        }
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(seaField[i][j] + " ");
            }
            System.out.println();
        }
        return seaField;
    }
}