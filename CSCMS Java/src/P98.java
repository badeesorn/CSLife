import java.util.Scanner;

public class P98 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        String board = "";
        char gardent[][] = new char[r][c];
        int result[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            board = sc.next();
            for (int j = 0; j < c; j++) {
                gardent[i][j] = board.charAt(j);
                result[i][j] = 0;
                // System.out.print(gardent[i][j]);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (gardent[i][j] == 'S') {
                    result[i][j] += 1;
                    for (int k = j + 1; k < c; k++) {
                        if (gardent[i][k] == 'X') {
                            break;
                        }
                        if (k >= c) {
                            break;
                        }
                        result[i][k] += 1;
                    }
                    for (int k = j - 1; k >= 0; k--) {
                        if (gardent[i][k] == 'X') {
                            break;
                        }
                        if (k < 0) {
                            break;
                        }
                        result[i][k] += 1;
                    }
                    for (int k = i + 1; k < r; k++) {
                        if (gardent[k][j] == 'X') {
                            break;
                        }
                        if (k >= r) {
                            break;
                        }
                        result[k][j] += 1;
                    }
                    for (int k = i - 1; k >= 0; k--) {
                        if (gardent[k][j] == 'X') {
                            break;
                        }
                        if (k < 0) {
                            break;
                        }
                        result[k][j] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}