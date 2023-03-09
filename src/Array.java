import java.util.Scanner;

public class Array {
    public static void array(){
        int[][] arr=new int[2][2];
        Scanner s=new Scanner(System.in);
        System.out.println("enter the val");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("the array is=");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
