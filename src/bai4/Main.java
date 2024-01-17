package bai4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 ="public static void main";
        StringBuffer stringBuffer=new StringBuffer(str1);

        System.out.println(Arrays.toString(str1.split("\\s+")));;


    }
}
