import java.util.Scanner;

public class Condition1 {
    public void check(){
        Scanner s=new Scanner(System.in);
        System.out.print("enter aything:");
        char c=s.next().charAt(0);
        if(c>=65 && c<=122 ){
            if(c>=65 && c<=90){
                System.out.println("it is a character");
            } else if (c>=97 && c<=122) {
                System.out.println("it is a character");
            }else{
                System.out.println("it is a special character");
            }
//            System.out.println("it is a character");
        } else if (c >= 48 && c<=57) {
            System.out.println("it is a digit");

        }else{
            System.out.println("it is a special character");
        }

    }
}
