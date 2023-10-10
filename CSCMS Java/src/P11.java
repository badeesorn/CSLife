import java.util.Scanner;

public class P11 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 1; i <= (2 *n)-1 ; i++){
          for (int j = 1; j <= (2 *n)-1; j++){
              if ( (i == 1 && j>=n  ) || ( i==n && j<=n) || (i == (2 *n)-1 && j <=n) || (i >= n && j==1) || (i>=n && j==n) || (j == (2 * n)-1 && i<=(n)) ||
               (i+j==n+1) || (i+j==2*n && i <=n) || (i+j==3*n-1 )){
                  System.out.print("*");
              }
              else if ((i+j)>=3*n){
                  System.out.print("");
              }
              else{
                  System.out.print("-");
              }
          }
          System.out.println("");
      }
    }
}