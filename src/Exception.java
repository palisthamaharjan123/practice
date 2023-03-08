public class Exception {

    public void sum(){
        diff();
        try {
            System.out.println(10 / 0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("this is not the correct one");
        }catch (ArithmeticException e){
            System.out.println("instead do 0/10");
        }

    }
    public void diff(){
        System.out.println("hello");
    }


}
