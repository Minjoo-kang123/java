package operator;

public class operator1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int num4 = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println(num4);
    }
}
