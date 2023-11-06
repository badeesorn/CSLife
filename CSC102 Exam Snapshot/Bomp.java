import java.util.Scanner;

public class Bomp {
    public static void main(String[] args) {
        int size = 5;
        int cube[][][] = new int[size][size][size];
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            cube[x][y][z] = 1;

            for (int a = 0; a < size; a++) {
                cube[a][y][z] = 1;
                cube[x][a][z] = 1;
                cube[x][y][a] = 1;
            }
        }

        int total = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    total += cube[i][j][k];
                }
            }
        }
        System.out.println(total);
    }
}
