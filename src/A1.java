public class A1 implements A{//interface is implemented

    int sum,diff;
    @Override
    public void sum(int num1,int num2) {//duitai method implement garxa parxa
         sum=num1+num2;
        System.out.println("the sum is = "+sum);

    }

    @Override
    public void diff(int num1,int num2) {//garena vaney yo class ni abstract hunxa
        if(num1>num2){
            System.out.println("the diff is="+ (num2-num1));
        }else{
            System.out.println("the diff is="+ (num1-num2));
        }
    }
     static void mul(){
         System.out.println("the product is="+(4*4));
    }
}
