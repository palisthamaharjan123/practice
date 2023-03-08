import java.util.Scanner;

public class Multiplication {
    public void product(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        int product=1;
        for(int i=1;i<11;i++){
            product=i*num;
            System.out.println(i+"*"+num+"="+product);
        }
    }
}
