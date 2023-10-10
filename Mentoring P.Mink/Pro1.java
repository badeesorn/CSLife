import java.util.*;
public class Pro1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int set[] = new int[n];
        double sum = 0;
        double avg;
        for(int i=0; i< set.length; i++){
            set[i] = sc.nextInt();
        }
         for(int j=0; j< set.length; j++){
            sum+=set[j];
        }
        avg = sum/n;
        System.out.println(avg);

        Arrays.sort(set);
        int check = n%2;
        if(check == 1){
            int median = 0;
            median = set[(n/2)];
            System.out.println(median);
        }
        else if(check == 0){
            double median = 0;
            int a1 = n/2;
            int a2 = a1+1;
            int b1 = set[a1-1];
            int b2 = set[a2-1];
            double msum = b1+b2;
            median = msum/2;
            System.out.println(median);
        }
    }
}