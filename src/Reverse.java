public class Reverse {
    public void reverse(){
        int num=5764;
        int remainder;
        int reverse=0;
        while(num!=0){
            remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
