


public class Matriz {

    public static void main(String[] args) {
         long startTime = System.nanoTime();
        int size = 2;
        int matriz[][] = new int[size][size];
        llenarmatriz(matriz);
        long endTime = System.nanoTime()- startTime;
        System.out.println("time: " + endTime);
    }

    public static void llenarmatriz(int matriz[][]) {

        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[c].length; c++) {

                matriz[f][c] = (int) (Math.random() * 100) + 1;
            }
        }

    }
}