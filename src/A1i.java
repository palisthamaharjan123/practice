public  class A1i implements A,B{
    int sum;
    @Override
    public void sum(int num1, int num2) {
        int num3=90;
        sum=num1+num2+num3;
        System.out.println(sum);
    }

    @Override
    public  void diff(int num1, int num2){
        System.out.println("the diff is="+ (num1-num2));
    }


    @Override
    public void divide() {
        int num1=90;
        int num2=5;
        System.out.println("the answer for the division is = "+ (num1/num2));
    }

}
