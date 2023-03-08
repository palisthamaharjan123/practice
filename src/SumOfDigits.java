public class SumOfDigits {
    public void sum(){
        int num=4321;
        int sum=0;
        while(num!=0){
            int remain= num%10;
            sum+=remain;
            num=num/10;
        }
        System.out.println(sum);
    }
    public void diff(){

    }
}
