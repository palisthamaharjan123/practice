import java.util.Scanner;

public class Power {
    public void power(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a num:");
        int num=s.nextInt();
        int result=1;
        System.out.println("enter power of num:");
        int pow=s.nextInt();
        while(pow>0){
             result=result*num;
             pow--;

        }
        System.out.println(result);

    }
}
