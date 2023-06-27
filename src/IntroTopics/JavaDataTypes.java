package IntroTopics;

public class JavaDataTypes {
    public static void main(String[] args) {

        // Primitive datatypes :

        byte b = 10;
        System.out.println(b);

        // byte byteLimit = 128;
        // System.out.println(byteLimit);
        // The above two lines won't work as the limit of byte ::: -128<=byte<=127

        short s = 1000;
        System.out.println(s);

        char c = 'p';
        System.out.println(c);

        int a = 10000;
        System.out.println(a);

        long l = 1234567L;
        System.out.println(l);

        float f = 123.45f;
        System.out.println(f);

        double d = 123.45678;
        System.out.println(d);

        // Non-primitive Datatypes :::

        String checkString = "Eclipse and intellijIdea are very popular";
        System.out.println(checkString);
    }
}
