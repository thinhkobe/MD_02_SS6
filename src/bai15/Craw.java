package bai15;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Craw {
    public static void main(String[] args) throws MalformedURLException {
        try {
            URL url = new URL("https://dantri.com.vn/");
            Scanner scanner=new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
//            System.out.println(content);

            Pattern pattern=Pattern.compile("\" >(.*?)</a>");
            Matcher m=pattern.matcher(content);
            while (m.find()){
                System.out.println(m.group(1));
            };
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
