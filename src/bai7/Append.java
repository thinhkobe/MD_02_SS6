package bai7;

public class Append {
    public static void main(String[] args) {
        String str1="public static";
        StringBuilder stringBuilder=new StringBuilder(str1).append(" void main");
        System.out.println(stringBuilder);
    }
}
