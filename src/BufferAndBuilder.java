public class BufferAndBuilder {//mutable string
    public void buffer(){
        StringBuffer sbuff=new StringBuffer("hello");
        sbuff.append("world");
        sbuff.delete(5,7);
        sbuff.reverse();
        System.out.println(sbuff.codePointAt(1));//unicode value
        System.out.println(sbuff);
        StringBuffer sb=new StringBuffer("heh");
        StringBuffer reverse=new StringBuffer(" ");
        reverse = sb.reverse();

        if(sb==reverse){
            System.out.println("the strings are similar");

        }
        System.out.println(sb.replace(0,1,"l"));



    }
    public void builder(){
        StringBuilder build=new StringBuilder("palistha");
        StringBuilder reverseStr = build.reverse();
        System.out.println(reverseStr);
        build.append( "maharjan");
        System.out.println(build);

    }

}
