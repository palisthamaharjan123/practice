public class AllAboutString {
    public void string() {
        String s = new String("hello world");//string is immutable
        int len = s.length();
        System.out.println(s.equalsIgnoreCase("hello world"));
        System.out.println(len);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s);
        System.out.println(s.substring(7, 9));
        System.out.println(s.replace('d', 'l'));
        if (s.startsWith("hello")) {
            System.out.println("hii");
        } else {
            System.out.println("bye");
        }



    }
}
