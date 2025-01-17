package StringAndStringBuilder;

public class HeapVersusStringPool {
    public static void main(String[] args) {
        String x = "Ram";
        String a = new String(x);
        String b = new String(x);
        String c = "Ram";
        String d = "Ram";
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(x==a);
        System.out.println(x==d);
    }
}
