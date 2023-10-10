import java.util.Scanner;
public class P56 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
		if (n == 1){
         	System.out.println(1);
          	System.out.print(arr[0]);
          return;
        }
      
        int count = 0;
        for(int i=0; i < n; i++){
            if(i!= 0 && i!=n-1  &&arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                count++;
            } else if (i == 0 && arr[i] > arr[i+1]){
                count++;
            } else if (i == n-1 && arr[i] > arr[i-1]){
                count++;
            }
        }
        System.out.println(count);

        for(int i=0; i< n; i++){
            
            if(i!= 0 && i!=n-1  &&arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                System.out.print(arr[i]+" ");
            }else if (i == 0 && arr[i] > arr[i+1]){
                 System.out.print(arr[i]+" ");
            }else if (i == n-1 && arr[i] > arr[i-1]){
                 System.out.print(arr[i]+" ");

            }
        }


    }
}
