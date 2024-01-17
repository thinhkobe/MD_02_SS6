package bai6;

public class Insert {
    public static void main(String[] args) {
        String str1="public static";
        StringBuilder stringBuilder1=new StringBuilder(str1).insert(6,"aaa");
        System.out.println("chuỗi mới"+stringBuilder1);
    }
}
