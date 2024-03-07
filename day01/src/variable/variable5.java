package variable;

public class variable5 {
    public static void main(String[] args) {
        String str = "abcdefg";
        str = str.toUpperCase();
        StringBuffer s = new StringBuffer(str);
        System.out.println(s.reverse());
    }
}
