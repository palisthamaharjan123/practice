import java.util.Scanner;

public class Loop {
    public void loop(){
        Scanner s=new Scanner(System.in);
        int a=10;

      while(a<10){
            System.out.println("While");
           a++;
        }
       do {
           System.out.println("doWhile");
           a++;
       }while(a<10);

       for(int i=1;i<10;i++){
           System.out.println("ForLoop");
        }
       int[] array=new int[5];
        for (int x:array) {
            System.out.println("for each");
        }

    }
}
