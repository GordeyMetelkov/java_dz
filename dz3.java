public class dz3 {
    public static void main(String[] args) {
        
    }
    public static void chess(int n) {
        int [][] chessField = new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
            }
        }
    }
    public static void d(int [][] field) {
        int step = 1;
        int posX = 0;
        int posY = 0;
    }
    public static void steps(int [][] field, int posX, int posY, int step) {
            if (twoLeftBottomStep(field, posX, posY) && (field[posX-2][posX+1] == 0)){
                posX -= 2;
                posY += 1;
                field[posX][posY] = step;
                step++;
                steps(field, posX, posY, step);
            }
            else if (leftTwoBottomStep(field, posX, posY) && (field[posX-1][posX+2] == 0)){
                posX -= 1;
                posY += 2;
                field[posX][posY] = step;
                step++;
                steps(field, posX, posY, step);
        }
    }
    public static boolean twoLeftTopStep(int [][] field, int posX, int posY) {
        if (posX - 2 >= 0 && posY - 1 >= 0 ){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean leftTwoTopStep(int [][] field, int posX, int posY) {
        if (posX - 1 >= 0 && posY - 2 >= 0 ) {
            return true;
        }   
        else {
            return false;
        }
    }
    public static boolean leftTwoBottomStep(int [][] field, int posX, int posY) {
        if (posX - 1 >= 0 && posY + 2 >= field.length ) {
            return true;
        }   
        else {
            return false;
        }
    }
    public static boolean twoLeftBottomStep(int [][] field, int posX, int posY) {
        if (posX - 2 >= 0 && posY + 1 >= field.length ) {
            return true;
        }   
        else {
            return false;
        }
    }

    public static boolean rightTwoTopStep(int [][] field, int posX, int posY) {
        if (posX + 1 >= field.length && posY - 2 >= 0 ) {
            return true;
        }   
        else {
            return false;
        }
    }
    public static boolean twoRightTopStep(int [][] field, int posX, int posY) {
        if (posX + 2 >= field.length && posY - 1 >= 0 ) {
            return true;
        }   
        else {
            return false;
        }
    }
    public static boolean rightTwoBottomStep(int [][] field, int posX, int posY) {
        if (posX + 1 >= field.length && posY + 2 >= field.length ) {
            return true;
        }   
        else {
            return false;
        }
    }
    public static boolean twoRightBottomStep(int [][] field, int posX, int posY) {
        if (posX + 2 >= field.length && posY + 1 >= field.length ) {
            return true;
        }   
        else {
            return false;
        }
    }
}
