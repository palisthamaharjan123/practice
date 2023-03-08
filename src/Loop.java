import java.util.Scanner;

public class Loop {
    public void loop(){
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("enter the numbers(5)");
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
//        while(a<10){
//            System.out.println("hii");
//            a++;
//        }
//        do {
//            System.out.println("hii");
//            a++;
//        }while(a<10);
//        for(int i=1;i<10;i++){
//            System.out.println("hii");
//        }
        for(int x:a){
            System.out.println(x);
        }
    }
}
