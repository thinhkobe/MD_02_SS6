package bai8;

public class Replace {
    public static void main(String[] args) {
        String str1="public static void main";
        StringBuilder stringBuilder=new StringBuilder(str1).replace(6,100," Đã thay ");
        StringBuilder stringBuilder1=new StringBuilder(stringBuilder).append("111");
        System.out.println("chuỗi mới"+stringBuilder);
        System.out.println(stringBuilder1);
    }
}
