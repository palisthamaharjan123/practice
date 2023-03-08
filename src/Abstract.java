public abstract class Abstract {
    public abstract void imp();//abstraction
    public void notimp(){
        System.out.println("this is not imp");
    }
    private int a=100;
    public void setA(int val){//encapsulation
        a=val;

    }
    public int getA(){
        return a;
    }
}
