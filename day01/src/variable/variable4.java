package variable;

public class variable4 {
    public static void main(String[] args) {
        String str = "12345@naver.com";

        String[] id = str.split("@");
        System.out.print(id[0] + id[1]);
    }
}
