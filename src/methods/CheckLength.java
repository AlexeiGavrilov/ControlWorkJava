package methods;

public class CheckLength {
    public static String CheckLen(String a, String b) {
        if (a.equals(b)) return a;
        if (a.length()>b.length()) {return  a;} else return b;
    }
}
