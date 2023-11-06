import java.util.Scanner;

public class P46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // อ่านขนาดของเมทริกซ์ N
        int N = scanner.nextInt();
        
        // สร้างเมทริกซ์ A ขนาด N x N
        int[][] A = new int[N][N];
        
        // อ่านค่าเข็มริกซ์ A จากข้อมูลเข้า
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        // คำนวณดีเทอร์มิแนนต์ของเมทริกซ์
        int determinant = calculateDeterminant(A);
        
        // แสดงผลลัพธ์
        System.out.println(determinant);
    }
    
    // ฟังก์ชันสำหรับคำนวณดีเทอร์มิแนนต์ของเมทริกซ์
    public static int calculateDeterminant(int[][] matrix) {
        int N = matrix.length;
        if (N == 1) {
            return matrix[0][0];
        }
        
        if (N == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
        
        int determinant = 0;
        
        for (int i = 0; i < N; i++) {
            int[][] subMatrix = new int[N - 1][N - 1];
            for (int j = 1; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (k < i) {
                        subMatrix[j - 1][k] = matrix[j][k];
                    } else if (k > i) {
                        subMatrix[j - 1][k - 1] = matrix[j][k];
                    }
                }
            }
            determinant += (i % 2 == 0 ? 1 : -1) * matrix[0][i] * calculateDeterminant(subMatrix);
        }
        
        return determinant;
    }
}
