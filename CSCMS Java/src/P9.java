import java.util.Scanner;

public class P9 {
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int train = sc.nextInt();
      int bomp = sc.nextInt();
      boolean isdie = true;

      for (int i=1; i<=train; i++){
        if(i!=bomp && i!=bomp-1 && i!=bomp+1 ){
            System.out.print(i+" ");
            isdie = false;
        }
      }
        if(isdie==true){
            System.out.print("DIE");
        }
    }
}
