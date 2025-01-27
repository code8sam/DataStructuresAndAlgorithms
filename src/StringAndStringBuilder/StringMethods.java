package StringAndStringBuilder;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Aksh Sinha";
        int length = name.length();
        System.out.println(length);
        char c = name.charAt(5);
        System.out.println(c);
        String name2 = "Aksh Sinha";
        // Output of both will come true. Still,
        // never use == to check equality of Strings
        // Use .equals() method :
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        String name3 = "aksh sinha";
        System.out.println(name.equalsIgnoreCase(name3));
        String str1 = "remote";
        String str2 = "car";
        int i = str1.compareTo(str2);
        System.out.println(i);
        String name4 = "Amar Panchal";
        String substring = name4.substring(4);
        System.out.println(substring);
        String substring1 = name4.substring(2, name4.length());
        System.out.println(substring1);
        String name5 = "    Amar Panchal";
        System.out.println(name5.trim());
        String replace = name5.replace("Panchal", "Sharma");
        System.out.println(replace);
        boolean panContains = name5.contains("Pan");
        System.out.println(panContains);
        String name6 = "Pran";
        boolean startsWith = name6.startsWith("P");
        System.out.println(startsWith);
        boolean endsWith = name6.endsWith("n");
        System.out.println(endsWith);
        String name7 = "";
        String name8 = "     ";
        System.out.println(name7.isEmpty());
        System.out.println(name8.isEmpty());
        System.out.println(name8.isBlank());
        String name9 = "Henlonnn";
        int indexOf = name9.indexOf('n');
        System.out.println(indexOf);
        int indexOfAfter = name9.indexOf('n', 4);
        System.out.println(indexOfAfter);
        int lastIndex = name9.lastIndexOf('n');
        System.out.println(lastIndex);
        int a = 10;
        String inString = String.valueOf(a);
        System.out.println(inString);
    }
}
