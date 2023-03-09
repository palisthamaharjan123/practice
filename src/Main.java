import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=s.nextInt();
        int num2=s.nextInt();
        Switch sw=new Switch();
        System.out.print("enter your choice(sum/diff/mul/div/modulus):");
        String ch=s.next();
        sw.swit(num1,num2,ch);


        A obj=new A1();
        obj.sum(num1,num2);
        obj.diff(num1,num2);
        A1i a1i=new A1i();
        a1i.sum(num1,num2);
        a1i.diff(num1,num2);
        a1i.divide();
        mul();


        Reverse rev=new Reverse();
        rev.reverse();

        Condition c=new Condition();

        c.ifelseifel();
        Condition1 c1=new Condition1();
        c1.check();


        Loop l=new Loop();
        l.loop();

        Facty f=new Facty();
        f.fact();

        Multiplication m=new Multiplication();
        m.product();

        Power p=new Power();
        p.power();

        Prime pr=new Prime();
        pr.prime();

        SumOfDigits s1=new SumOfDigits();
        s1.sum();

        Pattern p1=new Pattern();
        p1.pattern();

        Child c2=new Child();
        c2.revision();

        AbstractChild a=new AbstractChild();
        a.notimp();
        a.imp();

        Abstract a1=new AbstractChild();
        a1.imp();

        Abstract a2=new AbstractChild();
        a2.setA(90);
        System.out.println("the value is"+a.getA());

        Car c3=new Tesla();
        c3.engine();

        Exception e=new Exception();
        e.sum();


    }

}
