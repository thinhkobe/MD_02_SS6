package bai13;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    String Email="rikeiacademy@rikkeisoft.com";
        System.out.println("chek"+validEmail(Email));
    if (validEmail(Email)){
        System.out.println("email hợp lệ");
    }else{
        System.out.println("email không hợp lệ");
    }

    }
    public static boolean validEmail(String email){
        boolean check= Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$",email);
        return check;
    }
}
