import java.util.Scanner;

public class P147 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int day = sc.nextInt();
        int plant[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                plant[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int d = 0; d < day; d++) {
            int Max_M = 0;
            int Max_N = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (plant[i][j] > plant[Max_M][Max_N]) {
                        Max_M = i;
                        Max_N = j;
                    }
                }
            }
            sum = sum + plant[Max_M][Max_N];
            plant[Max_M][Max_N] = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if(plant[i][j] > 0){
                        plant[i][j] -= 1;
                    }
                }
            }
        }

        System.out.println(sum);

    }
}
