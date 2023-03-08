import java.util.Scanner;

public class Prime {
    public void prime(){
        int i;
        int count=8;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        for( i=2;i<=num/2;i++){
            if(num%i!=0){
                count=1;
                break;
            }
        }
        if(count==1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
