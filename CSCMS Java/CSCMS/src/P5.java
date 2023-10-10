import java.util.Scanner;

public class P5 {
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    if(input==0 || input==1){
      System.out.print("No");
    }else{

    for(int i = 2; i<=input/2 ; i++){
        if(input%i==0){
            System.out.print("No");
            return;
        }
    }
    System.out.print("Yes");

    }


  }
}
