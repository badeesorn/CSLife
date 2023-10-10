import java.util.Scanner;

public class P51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{10,11,12},{13,14,15},{16,17,18}};
        int arr3[][] = {{19,20,21},{22,23,24},{25,26,27}};
        int round = sc.nextInt();
        for(int i = 0;i<round;i++){
            String opa = sc.next();
            int index = sc.nextInt();
            int tarr1[][] = new int[3][3];
            int tarr2[][] = new int[3][3];
            int tarr3[][] = new int[3][3];
            for(int j = 0;j<3;j++){
                for(int k=0;k<3;k++){
                    tarr1[j][k] = arr1[j][k];
                    tarr2[j][k] = arr2[j][k];
                    tarr3[j][k] = arr3[j][k];
                }
            }

            if(opa.equals("up")){
                arr1[0][index] = tarr1[2][index];
                arr1[1][index] = tarr2[2][index];
                arr1[2][index] = tarr3[2][index];

                arr2[0][index] = tarr1[1][index];
                arr2[2][index] = tarr3[1][index];

                arr3[0][index] = tarr1[0][index];
                arr3[1][index] = tarr2[0][index];
                arr3[2][index] = tarr3[0][index];

            }else if(opa.equals("down")){
                arr1[0][index] = tarr3[0][index];
                arr1[1][index] = tarr2[0][index];
                arr1[2][index] = tarr1[0][index];

                arr2[0][index] = tarr3[1][index];
                arr2[2][index] = tarr1[1][index];

                arr3[0][index] = tarr3[2][index];
                arr3[1][index] = tarr2[2][index];
                arr3[2][index] = tarr1[2][index];

            }else if(opa.equals("right")){
                arr1[index][0] = tarr3[index][0];
                arr1[index][1] = tarr2[index][0];
                arr1[index][2] = tarr1[index][0];

                arr2[index][0] = tarr3[index][1];
                arr2[index][2] = tarr1[index][1];

                arr3[index][2] = tarr1[index][2];
                arr3[index][1] = tarr2[index][2];
                arr3[index][0] = tarr3[index][2];
            }else{
                arr1[index][0] = tarr1[index][2];
                arr1[index][1] = tarr2[index][2];
                arr1[index][2] = tarr3[index][2];

                arr2[index][0] = tarr1[index][1];
                arr2[index][2] = tarr3[index][1];

                arr3[index][2] = tarr3[index][0];
                arr3[index][1] = tarr2[index][0];
                arr3[index][0] = tarr1[index][0];
            }
        }
        sc.close();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}