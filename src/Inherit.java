public class Inherit {
    public void write(){
        System.out.println("writing");
    }
    public void write(int a){//method overloading
        System.out.println(a);
    }
    public void write(int a,int b){
        System.out.println(b);
    }
    public void write(int a,char b){
        System.out.println("int,char");
    }
    public void write(char b,int a){
        System.out.println("char,int");
    }
    public void write(String a){
        System.out.println("this is the string one");
    }
    public void revision(){
        System.out.println("i like to revise");
    }
}
