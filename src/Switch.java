public class Switch {
    public void swit(int a,int b,String ch){
        int result;
        switch (ch)
        {
            case "sum":
                result=a+b;
                System.out.println("the sum is:"+result);
                break;
            case "diff":
                result=a-b;
                System.out.println("the diff is:"+result);
                break;
            case "mul":
                result=a*b;
                System.out.println("the product is:"+result);
                break;
            case "div":
                result=a/b;
                System.out.println("the quotion is:"+result);
                break;
            case "mod":
                result=a%b;
                System.out.println("the remainder is:"+result);
                break;
            default:
                System.out.println("this optionm does not exist");

        }
    }
}
