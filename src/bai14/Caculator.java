package bai14;

public class Caculator {
    public static void main(String[] args) {
        String str1=" aka jnf   aaa a b c ";
        System.out.println("số lượng từ chuỗi"+str1.length());
        System.out.println(countWord(str1,3));
    }
    public static int countWord(String text,int a){
        String[] newString=text.trim().split("\\s+");
        int count=0;
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].length()>=a){
               count+=1;
            }
        }
        return count;
    }
}
