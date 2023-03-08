import java.util.Scanner;

public class Fact {
    public void fact(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        int fact=1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
