import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //các phương thức làm việc vơi chuỗi
        String str="hello";
        //lấy ra độ dài chuỗi
        System.out.println("độ dài chuỗi là :"+str.length());
        //lấy ra kí tự tại vị trí index
        System.out.println("kí tự ở index=3 là "+str.charAt(3));
        //nối chuỗi
        String newStr=str.concat("world");
        System.out.println("newstring"+str.concat("aa"));
        System.out.println("newstring"+newStr);
        //so sánh
        System.out.println("ss"+str.equals(newStr));
        //hiệu của 2 chuỗi
        System.out.println("hiệu 2 chuỗi"+str.compareTo(newStr));

        String s1="wellcom to java";
        String s2="Programing is fun";
        String s3="wellcom to java";


        //StringBuilder(bất đồng bộ) và String Bufer(đồng bộ,bộ nhớ đệm) --> hướng tới đa luồng

        StringBuilder stringBuilder=new StringBuilder(s1);
        //nối chuỗi
        StringBuilder stringBuilder1= stringBuilder.append("world");
        //nối theo vị trí chỉ định
        stringBuilder.append("rikkei academy",7,14); //kết quả wellcom to java academy
        //chèn theo vị trí
        stringBuilder.insert(0,"rikkei");//out:rikkei wellcom to java academy
        //xóa
        stringBuilder.delete(0,6);
        //biểu thức chính quy
        // chuỗi số từ 0-9 có đúng 9 kí tự
        //\d{9}

        //So khớp dữ liệu
        //cách 1
        Pattern pattern=Pattern.compile("\\d{9}");
        Matcher matcher=pattern.matcher("548849558");
        System.out.println(matcher.matches());//trả về true/false
        //cách 2
        System.out.println(Pattern.compile("\\d{9}").matcher("8488488").matches());
        //cách 3 :
        System.out.println("545545".matches("\\d{9}"));
        //cách 4
        boolean check= Pattern.matches("\\d{9}","8488488");
    }
}
